#language: pt
#encoding: iso-8859-1
Funcionalidade: Compra

  @treinamento
  Cenario: Adicionar produto ao carrinho
    Dado que estou na homepage do site "http://automationpractice.com/index.php"    
    E pesquiso pelo produto "Dress"
    Quando clico no botao Add to cart
    Entao deve apresentar a frase "Product successfully added to your shopping cart"
    
  