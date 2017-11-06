package br.com.mercadolivre.pageObject;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaginaResultados extends PaginaAbstrata {

	private String descricaoItem;
	private String moeda;
	private String valor;

	public PaginaResultados(WebDriver driver) {
		super(driver);
	}

	public PaginaResultados imprimeResultados(int quantidade) {

		for (int j = 1; j <= quantidade; j++) {

			WebElement element = driver.findElement(By.xpath("//*[@id=\"searchResults\"]/li[" + j + "]"));

			List<WebElement> links = element.findElements(By.tagName("span"));

			for (int i = 1; i < links.size(); i++) {

				String classe = links.get(i).getAttribute("class");

				if (classe.equals("main-title")) {
					descricaoItem = links.get(i).getText();
				}

				if (classe.equals("price-symbol")) {
					moeda = links.get(i).getText();
				}

				if (classe.equals("price-fraction")) {
					valor = links.get(i).getText();
				}

			}

			System.out.println(descricaoItem + ": " + moeda + " " + valor);

		}
		return new PaginaResultados(driver);

	}

	
	public PaginaDetalhesItem selecionaSegundaPagina() {
		WebElement botaoPaginacao = driver.findElement(By.xpath("//*[@id=\"results-section\"]/div[2]/ul/li[3]"));
		botaoPaginacao.click();

		return new PaginaDetalhesItem(driver);
	}

	public PaginaDetalhesItem selecionaPenultimoItem() {
		int nroItens = 1;
		String inicioXpath = "//*[@id=\"searchResults\"]/li[";				
		while(existeElemento(inicioXpath + nroItens + "]")){
			
			nroItens = nroItens + 1;
		}
		
		WebElement penultimoItem = driver.findElement(By.xpath("//*[@id=\"searchResults\"]/li[" + (nroItens-2) + "]"));
		penultimoItem.click();
		
	//	Thread.sleep(10);
		
		return new PaginaDetalhesItem(driver);
	}

	public static boolean existeElemento(String elementoXpath) {
		
		int count=driver.findElements(By.xpath(elementoXpath)).size();
		
		if (count==0)
			return false;
		else
			return true	;
	}	
	

	
}
