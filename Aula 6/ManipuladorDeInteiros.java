class ManipuladorDeInteiros{
  
  void fatoraInteiro(int x){
    System.out.print(x + " =");
    
    GeradorDePrimos3 gerador = new GeradorDePrimos3();
    int primo = gerador.proximoPrimo();
    
    while (x > 1){
      if(x % primo == 0){
        System.out.print(" " + primo);
        x = x / primo;
      }
      else {
        primo = gerador.proximoPrimo();
      }
    }
    System.out.println();
  }
}