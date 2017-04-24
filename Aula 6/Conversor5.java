class Conversor5{
  double celparaFah(double x){
    return (9.0 * x )/5.0 + 32.0;
  }
  
  double fahparaCel(double y){
    return 5.0 * (y - 32.0) / 9.0;
  }
  
  void imprimeTabelaFahparaCel(double inicio, double fim){
    double fahr = inicio;
    double cel;
    
    while(fahr <= fim){
      cel = fahparaCel(fahr);
      System.out.println(fahr + "F = " + cel + "C");
      fahr = fahr + 10.0;
    }
  }
}
