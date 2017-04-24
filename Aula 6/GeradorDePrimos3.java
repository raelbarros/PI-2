class GeradorDePrimos3{

  int limiteInferior = 1;
  
  void carregaLimiteInferior(int limite){
    limiteInferior = limite;
  }
  
  boolean ehPrimo(int x){
    int numeroDeDividor = 1;
    int candidatoADivisor = 2;
    
    while( (candidatoADivisor <= x/2) && (numeroDeDividor == 1) ){
      if(x % candidatoADivisor == 0){
        numeroDeDividor = numeroDeDividor + 1;
      }
      candidatoADivisor = candidatoADivisor + 1;
    }
    
    if(numeroDeDividor == 1){
      return true;
    }
    else {
      return false;
    }
  }
  
   int proximoPrimo(){
     if(limiteInferior == 1){
       limiteInferior = 2;
     }
     else if(limiteInferior % 2 == 0){
       limiteInferior = limiteInferior + 1;
     }
     else{
       limiteInferior = limiteInferior + 2;
     }
     
      while(!ehPrimo(limiteInferior)){
        limiteInferior = limiteInferior + 2;
      }
      return limiteInferior;
    }
}