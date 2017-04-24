class Circulo2{

  double raio;
  
  void carregaRaio(double r){
    raio = r;
  }
  
  double calculaArea(){
    return 3.14159 * raio * raio;
  }
  
  double calculaPerimetro(){
    return 3.14159 * 2.0 * raio;
  }
}