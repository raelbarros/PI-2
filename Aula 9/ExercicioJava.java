class ExercicioJava{
  
  double [] listaNumeros = new double[10];
  boolean achou;

  void iniciarLista(double x){
    
    for(int i = 0; i < listaNumeros.length; i++)
      listaNumeros[i] = x;

    
  }
  
  void imprimirLista(){
    
    for(int i = 0; i < listaNumeros.length; i++)
      System.out.println(listaNumeros[i]);
    
  }
  
  double somaLista(){
    double soma = 0;
    
    for(int i = 0; i < listaNumeros.length; i++)
      soma += listaNumeros[i];
    
    return soma;
  }
  
  double multiplicaLista(){
     double produto = 1;
        
    for(int i = 0; i < listaNumeros.length; i++)
      produto = produto * listaNumeros[i];

    return produto;
  }
  
  void inicializarAleatorio(){
    
    for (int i = 0; i < listaNumeros.length; i++)
      listaNumeros[i] = Math.random()*100;

  }
  
  double encontreMaior(){
    double maior = 0;
    
    for (int i = 0; i < listaNumeros.length; i++){
      if (listaNumeros[i] > maior){
        maior = listaNumeros[i];
      }
    }

    return maior;
  }
  
   double encontreMenor(){
    double menor = 0;
    
     menor = encontreMaior();
       
    for (int i = 0; i < listaNumeros.length; i++){
      if (listaNumeros[i] < menor){
        menor = listaNumeros[i];
      }
    }

    return menor;
  }
  
   double devolveMedia(){
     return (somaLista() / listaNumeros.length);
   }
   
   boolean encontrarNumero(double x){

    
     for (int i = 0; i < listaNumeros.length; i++){
      if (listaNumeros[i] == x){
        achou = true;
      }
     }
      return achou;
   }
   
   void multiplicarPor(double x){
     
     for (int i = 0; i < listaNumeros.length; i++)
       listaNumeros[i] *= x;
       
       
     imprimirLista();   
   }
     
   void multiplicarImparesPor(double x){
     
     for (int i = 1; i < listaNumeros.length; i=i+2)
       listaNumeros[i] *= x;       
     
     imprimirLista();
     
   }
   
   int encontrarPosicaoNumero(double x){
   
     for (int i = 1; i < listaNumeros.length; i=i+2){
       if (listaNumeros[i] == x){
        return i;
       }   
     }
   return -1;
   }
   
   void numerosMaioresQueMedia(){
     for (int i = 0; i < listaNumeros.length; i++){
       if (listaNumeros[i] > devolveMedia()){
         System.out.println(listaNumeros[i]);
       }
     }
   }
   
   public static void main(String [] args){
     
     ExercicioJava ex = new ExercicioJava();
   
     ex.inicializarAleatorio();
     ex.imprimirLista();
     ex.somaLista();
     ex.multiplicaLista();
     ex.encontreMaior();
     ex.encontreMenor();
     ex.devolveMedia();
     ex.encontrarNumero(2.0);
     ex.multiplicarPor(2.0);
     ex.multiplicarImparesPor(2.0);
     ex.encontrarPosicaoNumero(20);
   }
   
}