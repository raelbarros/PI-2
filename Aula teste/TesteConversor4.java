class TesteConversor4{

  int testaTudo(){
    Conversor4 c4 = new Conversor4();
    
    double cel = 10.0;
    double fah = 50.0;
    
    if( c4.celparafah(cel) != fah ){
      System.out.println("C -> F  Nao Funcionou para " + fah);
    }
    if( c4.fahparacel(fah) != cel ){
      System.out.println("F -> C Nao Funciona para " + cel);
    }
    
    
    cel = 20.0;
    fah = 68.0;
    
    if( c4.celparafah(cel) != fah ){
      System.out.println("C -> F  Nao Funcionou para " + fah);
    }
    if( c4.fahparacel(fah) != cel ){
      System.out.println("F -> C Nao Funciona para " + cel);
    }
    
    
    cel = 101.0;
    fah = 213.8;
    
    if( c4.celparafah(cel) != fah ){
      System.out.println("C -> F  Nao Funcionou para " + fah);
    }
    if( c4.fahparacel(fah) != cel ){
      System.out.println("F -> C Nao Funciona para " + cel);
    }
    
    System.out.println("Fim dos Testes");
    
    return 0;
  }
}