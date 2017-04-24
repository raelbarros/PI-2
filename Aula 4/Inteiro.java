class Inteiro{
  int valor;
  
  void carregaValor(int x){
    valor = x;
  }
  
  int devolveValor(){
    return valor;
  }
  
  int devolveValorAbsoluto(){
    return Math.abs(valor);
  }
  
  void imprime(){
    System.out.println("vc digitou " + valor);
  }

  int soma(int x){
    valor = valor + x;
    return valor;
  }
  
  int subtrai(int x){
    valor = valor - x;
    return valor;
  }
  
  int multiplicaPor(int x){
    valor = (valor * x);
    return valor;
  }
  
  int dividePor(int x){
    if(x!=0){
      valor = valor / x;
      return valor;
    }
    else
      System.out.println("O Divisor eh igual a 0");
      return valor;
  }
  
}