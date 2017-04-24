class CalculadoraNotas{

  double calculaMedia(int a, int b, int c, int d){
    return (a+b+c+d)/4;
  }
  
  double calculaMediaPonderada(int a, int b, int c, int d){
    return ((a*1) + (b*2) + (c*3) + (d*4)) / 10;
  }
}