package br.com.cwi.automation_training.steps.treinamento;

import org.junit.Assert;

import br.com.cwi.automation_training.pages.selenium.FabricaDeTestesPage;
import br.com.cwi.automation_training.pages.treinamento.TreinamentoPage;
import br.com.cwi.automation_training.util.TestRule;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;

public class TreinamentoSteps {	
	
	@Dado("que estou na homepage do site \"(.*)\"")
	public void acessarHomePage(String url) {
		TestRule.openApplicationChrome(url);
	}
	
	@E("pesquiso pelo produto \"(.*)\"")
	public void pesquisarProduto(String nomeProduto) {
		TreinamentoPage treinamentoPage = new TreinamentoPage();
		treinamentoPage.buscarProduto(nomeProduto);
	}
	
	@Quando("clico no botao Add to cart")
	public void clicarBotao(){
		TreinamentoPage treinamentoPage = new TreinamentoPage();
		treinamentoPage.clicarBotao();
	}
	
	@Entao("deve apresentar a frase \"(.*)\"")
	public void exibirMensagem(String mensagem){
		TreinamentoPage treinamentoPage = new TreinamentoPage();
		
	}
	
}