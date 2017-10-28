package br.com.cwi.automation_training.pages.treinamento;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import br.com.cwi.automation_training.util.TestRule;

public class TreinamentoPage extends TreinamentoElementMap {

	public TreinamentoPage() {
		PageFactory.initElements(TestRule.getDriver(), this);
	}	

	public void buscarProduto(String produto) {	
		search_query_top.sendKeys(produto);
		botaoPesquisar.click();
		logPrint("Buscou pelo produto " + produto);
	}
	
	public void clicarBotao() {	
		JavascriptExecutor jsel = (JavascriptExecutor) driver;
		jsel.executeScript("window.scrollBy(0,600)","");
		moveToElement(imagem);
		botaoAddToCar.click();
		logPrint("Adicionou o carrinho de compras");	
	}
	
	public void exibirMensagem(String mensagem) {
		boolean acertou = false;
		
		Assert.assertTrue(acertou);
		logPrint("Exibiu mensagem de Sucesso.");
	}
	
	
}