package br.com.cwi.automation_training.pages.treinamento;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import br.com.cwi.automation_training.pages.BasePage;

public class TreinamentoElementMap extends BasePage {

	protected WebElement search_query_top;
	
	@FindBy(css = ".button-search")
	protected WebElement botaoPesquisar;
	
	@FindBy(css = "[title='Add to cart']")
	protected WebElement botaoAddToCar;
	
	@FindBy(css = ".ajax_block_product.col-xs-12.col-sm-6.col-md-4.first-in-line.first-item-of-tablet-line.first-item-of-mobile-line")
	protected WebElement imagem;
	
	@FindBy(css = "")
	protected WebElement mensagem;
}