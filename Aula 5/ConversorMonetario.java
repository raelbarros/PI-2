class ConversorMonetario {

  double a, b;
  
  void defineTaxaCompra(double x){
    a = x; 
  }
  
  void defineTaxaVenda(double y){
    b = y;
  }
  
  void imprimeTaxas(){
    System.out.println("Taxa de compra = " + a);
    System.out.println("Taxa de vendas = " + b);
  }
  
  double vendeDolar(double x){
    return x * a; 
  }
  
  double compraDolar(double y){
    return y * (b/10);
  }
}