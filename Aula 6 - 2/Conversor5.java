class Conversor5{
  double celparaFah(double x){
    return (9.0 * x )/5.0 + 32.0;
  }
  
  double fahparaCel(double y){
    return 5.0 * (y - 32.0) / 9.0;
  }
  
  void imprimeTabelaFahParaCel(double inicio, double fim, int parametro){
    double fahr = inicio;
    double cel;
    int x = parametro;
    
    while(fahr <= fim){
      cel = fahparaCel(fahr);
      System.out.println(fahr + "F = " + cel + "C");
      fahr = fahr + x;
    }
  }
  
  void imprimeTabelaCelParaFah(double inicio, double fim, int parametro){
    double cels = inicio;
    double fahr;
    int x = parametro;
    
    while(cels <= fim){
      fahr = celparaFah(cels);
      System.out.println(cels + "C = " + fahr + "F");
      cels = cels + x;
    }
  }
}
