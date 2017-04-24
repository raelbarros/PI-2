class TestaRetangulo{

  void testePontual(int l1, int l2){
  
    Retangulo2 r = new Retangulo2();
    r.carregaLados(l1, l2);
    
    if( r.calculaArea() != l1 * l2 ){
      System.out.println("Nao funciona para os lados " + l1 + " e " + l2);
    }
    
    if ( r.calculaPerimetro() != 2 * (l1 + l2) ){
      System.out.println("Nao funciona para os lados " + l1 + " e " + l2);
    }
    
    System.out.println("Fim dos Testes");
  }
  
  void testaTudo(){
    testePontual(10, 20);
    testePontual(1, 20);
    testePontual(3, 3);
  }
}