lass TrianguloRetangulo{

  double cateto1, cateto2;
  
  void cateto1(double c){
    cateto1 = c;
  }
  
  
  void cateto2(double c){
    cateto2 = c;
  }

  double area(){
    return cateto1 * cateto2 / 2.0;
  }
}