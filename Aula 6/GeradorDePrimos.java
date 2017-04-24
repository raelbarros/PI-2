class GeradorDePrimos{
  
  void verificaPrimo(int x){
    int numeroDeDivisor = 1;
    int candidatoADivisor = 2;
    
    while (candidatoADivisor <= x){
      if(x % candidatoADivisor == 0){
        numeroDeDivisor = numeroDeDivisor + 1;
      }
      candidatoADivisor = candidatoADivisor + 1;
    }
    
    if(numeroDeDivisor == 2){
      System.out.println("O numero " + x + " e primo");
    }
    else {
      System.out.println("O numero " + x + " nao e primo");
    }
    
  }
}