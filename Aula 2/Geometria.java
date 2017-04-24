class Geometria{

  int areaQuadrado(int a){
    return a*a;
  }
  
  double areaTriangulo(int a, int b){
    return (a*b)/2;
  }
  
  double areaCirculo(int a){
    return 3.14159 *(Math.pow(a,2));
  }
  
  double areaTrapezio(int a, int b, int c){
    return ((a+b)/2)*c;
  }
  
  double areaRetangulo(int a, int b){
    return a*b;
  }
  
  double perimetroRetangulo(int a, int b){
    return 2 * (a + b);
  }
}