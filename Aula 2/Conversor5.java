class Conversor5 {
  
  double celparafah(double x) {
    return 9.0 * x / 5.0 + 32.0;
  }
  
  double celparakel(double x){
    return x + 273.15;
  }
  
  double fahparacel(double x){
    return 5.0 * ( x - 32.0) / 9.0;
  }
  
  double fahparakel(double x){
    return (x - 32.0)/1.80 + 273.15;
  }
  
  double kelparacel(double x){
    return x - 273.15;
  }
  
  double kelparafah(double x){
    return (x - 273.15) * 1.80 + 32.0;
  }
}