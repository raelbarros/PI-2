class TesteConversor4{

  void testaPontual(double cel, double fah){
    Conversor4 c4 = new Conversor4();
    
    if( c4.celparafah(cel) != fah ){
      System.out.println("C -> F  Nao Funcionou para " + fah);
    }
    if( c4.fahparacel(fah) != cel ){
      System.out.println("F -> C Nao Funciona para " + cel);
    }
  }
    
    void testaTudo(){ 
    double cel = 10.0;
    double fah = 50.0;
    
    testaPontual (cel, fah);
      
    cel = 20.0;
    fah = 68.0;
    
    testaPontual (cel, fah);
    
    cel = 101.0;
    fah = 213.8;
    
    testaPontual (cel, fah);
    
    System.out.println("Fim dos Testes");
  
    
    }
}