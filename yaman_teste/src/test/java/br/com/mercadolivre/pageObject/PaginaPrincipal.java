package br.com.mercadolivre.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaginaPrincipal extends PaginaAbstrata {

	public PaginaPrincipal(WebDriver driver) {
		super(driver);
	}

	public PaginaResultados realizarPesquisa(String produto) {

		WebElement campoPesquisa = driver.findElement(By.className("nav-search-input"));
		campoPesquisa.sendKeys(produto);

		WebElement botaoPesquisar = driver.findElement(By.className("nav-search-btn"));
		botaoPesquisar.click();

		return new PaginaResultados(driver);
	}

}
