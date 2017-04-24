class Prisma {
  
  double altura, areaDaBase;

  void altura(double a){
    altura = a;
  }

  void areaDaBase(double a){
    areaDaBase = a;
  }
  
  double volume(){
    return areaDaBase * altura;
  }
}