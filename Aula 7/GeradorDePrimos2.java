class GeradorDePrimos2{
  
  int limiteInferior = 1;
  
  void carregaLimiteInferior(int limite){
    limiteInferior = limite;
  }
  
  boolean ehPrimo(int x){
    int numeroDeDivisor = 1;
    int candidatoADivisor = 2;
    
    while ((candidatoADivisor <= x/2) && (numeroDeDivisor == 1)){
      if(x % candidatoADivisor == 0){
        numeroDeDivisor = numeroDeDivisor + 1;
      }
      candidatoADivisor = candidatoADivisor + 1;
    }
    
    if(numeroDeDivisor == 1){
      return true;
    }
    else {
      return false;
    }
  }
  
  int proximoPrimo(){
    limiteInferior = limiteInferior +1;
    while(!ehPrimo(limiteInferior)){
      limiteInferior = limiteInferior +1;
    }
    return limiteInferior;
  }
}