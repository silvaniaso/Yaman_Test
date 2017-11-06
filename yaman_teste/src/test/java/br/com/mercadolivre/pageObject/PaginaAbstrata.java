package br.com.mercadolivre.pageObject;

import org.openqa.selenium.WebDriver;

public class PaginaAbstrata {

	protected static WebDriver driver;
	
	public PaginaAbstrata(WebDriver driver) {
		this.driver = driver;
	}
	
	public PaginaPrincipal navegaParaPagina() {
		driver.navigate().to("http://www.mercadolivre.com.br");
		return new PaginaPrincipal(driver);
	}
	
	public void encerraPagina(){
		driver.quit();
	}
}
