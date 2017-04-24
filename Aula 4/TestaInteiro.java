class TestaInteiro{
  
  void testaTudo(int valor){
    Inteiro x = new Inteiro();
    
    x.carregaValor(5);
    
    if (x.devolveValorAbsoluto() != 5){
      System.out.println("Teste devolve Valor Absoluto nao funciuona");
    }
    
    if (x.soma(5) != 10){
      System.out.println("Teste soma nao funciona");
    }
    
    if (x.subtrai(5) != 5){
      System.out.println("Teste subtrai nao funciona");
    }
    
    if (x.multiplicaPor(5) != 25){
      System.out.println("Teste multiplica nao funciona");
    }
    
    if (x.dividePor(5) != 5){
      System.out.println("Teste divide nao funciona");
    }
    
    System.out.println("Fim dos testes");
  }

}