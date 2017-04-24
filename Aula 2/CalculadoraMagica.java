class CalculadoraMagica{
  
  int soma(int a, int b){
    return a + b;
  }
  
  int subt(int a , int b){
    return a - b;
  }
  
  int multi(int a , int b){
    return a * b;
  }
  
  double div(int a, int b){
    return a / b;
  }
  
  double pot(int a, int b){
    return Math.pow(a,b);
  }
  
  double somaQuadrados(int a, int b){
    int x= a + b;
    return Math.pow(x,2);
  }
}