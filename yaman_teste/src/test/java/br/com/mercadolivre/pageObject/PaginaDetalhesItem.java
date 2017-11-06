package br.com.mercadolivre.pageObject;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class PaginaDetalhesItem extends PaginaAbstrata {

	public PaginaDetalhesItem(WebDriver driver) {
		super(driver);
	}

	public PaginaDetalhesItem tirarPrint() {
		ScreenShot("PenultimoItem");
		return new PaginaDetalhesItem(driver);
	}
	
	public static void ScreenShot(String nomeEvidencia) {

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY_hh-mm-ssaa");
		String datefile = dateFormat.format(new Date());

		try {
			FileUtils.copyFile(src, new File("evidencias/" + nomeEvidencia + "_" + datefile + ".png"));

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}
}
