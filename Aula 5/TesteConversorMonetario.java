class TesteConversorMonetario {


  void testaTudo(){
    ConversorMonetario x = new ConversorMonetario();
    
    x.defineTaxaCompra(4.0);
    x.defineTaxaVenda(3.5);
    x.imprimeTaxas();
    
       if ( x.vendeDolar(5) != 20 )
         System.out.println("Teste de vendas errado");
    
    
       if ( x.compraDolar(5) != 1.75 )
         System.out.println("Teste de compra errado");
       
       
    System.out.println("Fim dos testes");   
       
  }


}