class Retangulo2{

  int lado1;
  int lado2;
  
  void carregaLados(int l1, int l2){
    lado1 = l1;
    lado2 = l2;
  }
  
  int calculaArea(){
    return lado1 * lado2;
  }
  
  int calculaPerimetro(){
    return 2 * (lado1 + lado2);
  }
}