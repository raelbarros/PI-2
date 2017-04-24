class Fibonacci{
  
  int i = 0;
  int ultimo = 1;
  int penultimo = 0;
  int total;
  
  void imprimeNúmerosDeFibonacci(int x){
    while (i < x){
      total = penultimo + ultimo;
      penultimo = ultimo;
      ultimo = total;
      i++;
      System.out.print(" " + total);
    }
  }
}