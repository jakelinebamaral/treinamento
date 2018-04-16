package test;

import java.io.IOException;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import main.BasePage;
import utils.Utils;

public class Teste {
	BasePage bp = new BasePage();
	Utils ut = new Utils();

	@Given("^testeRipley - Acessar a tela inicial$")
	public void acessarPagina() throws IOException {
		bp.abrirPage("http://www.bancoripley.com.pe");
		ut.finaliza();
	}

	@When("^testeRipley - clicar no link1$")
	public void link1() throws InterruptedException, IOException {		
		bp.acao("//*[@id=\"MMMenu0805194703_0_Item_0\"]");
		ut.finaliza();
//		bp.clicarElementoPorXpath("//*[@id=\"MMMenu0805194703_0_Item_0\"]");
		
	}

//	@When("^tesetTrivago - Escolher data qualquer entrada$")
//	public void dataInicial() throws InterruptedException {
//		Thread.sleep(5000);
//		//bp.esperarPorXpath("//*[@id=\"js-fullscreen-hero\"]/div/form/div[2]/div[2]/div/table/tbody/tr[3]/td[6]");
//		bp.clicarElementoPorXpath("//*[@id=\"js-fullscreen-hero\"]/div/form/div[2]/div[2]/div/table/tbody/tr[3]/td[6]");
//	}
//	@When("^testeTrivago - Escolher data qualquer saida$")
//	public void dataFinal() throws InterruptedException {
//		Thread.sleep(5000);
//		//bp.esperarPorXpath("//*[@id=\"js-fullscreen-hero\"]/div/form/div[2]/div[2]/div/table/tbody/tr[5]/td[1]");
//		bp.clicarElementoPorXpath("//*[@id=\"js-fullscreen-hero\"]/div/form/div[2]/div[2]/div/table/tbody/tr[5]/td[1]");
//	}
//	@When("^testeTrivago - Escolher primeira oferta$")
//	public void verOferta() throws InterruptedException {
//		Thread.sleep(5000);
//		bp.clicarElementoPorXpath("//*[@id=\"js_item_3809554\"]/div[1]/div[3]/section[2]/div/div[2]/button");
//	}

}
