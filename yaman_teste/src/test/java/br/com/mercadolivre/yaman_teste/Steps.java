package br.com.mercadolivre.yaman_teste;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import br.com.mercadolivre.pageObject.PaginaDetalhesItem;
import br.com.mercadolivre.pageObject.PaginaPrincipal;
import br.com.mercadolivre.pageObject.PaginaResultados;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {

	PaginaPrincipal paginaPrincipal;
	PaginaResultados paginaResultados;
	PaginaDetalhesItem paginaDetalhesItem;
	WebDriver driver;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "src/test/resource/drivers/chromedriver.exe");

		ChromeOptions option = new ChromeOptions();
		option.addArguments("start-maximized", "disable-infobars");

		// Instancia o Webdriver
		driver = new ChromeDriver(option);
	}
	
	@After
	public void encerrar() {
		driver.quit();
	}
	
	@Given("^A pagina inicial foi acessada$")
	public void acessarPaginaPrincipal() throws Throwable {
		paginaPrincipal = new PaginaPrincipal(driver);
		paginaPrincipal.navegaParaPagina();
	}

	@When("^A pesquisa pelo item \"([^\"]*)\" e realizada$")
	public void pesquisarItem(String produto) throws Throwable {
		paginaPrincipal.realizarPesquisa(produto);
	}

	@Then("^Imprime o titulo e valor do item$")
	public void imprimirInformacoesItens() throws Throwable {
		paginaResultados = new PaginaResultados(driver);
		paginaResultados.imprimeResultados(5);
	}

	@Then("^Tira print do penultimo anuncio da segunda pagina$")
	public void evidenciarPenultimoItem() throws Throwable {
		paginaResultados = new PaginaResultados(driver);
		paginaDetalhesItem = new PaginaDetalhesItem(driver);
		paginaResultados.selecionaSegundaPagina();
		paginaResultados.selecionaPenultimoItem();
		paginaDetalhesItem.tirarPrint();
	}

}
