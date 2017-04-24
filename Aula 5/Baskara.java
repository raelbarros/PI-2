class Baskara {
  
  double a, b , c, delta;
  
  void carregaValores(double x, double y, double z){
    a = x;
    b = y;
    c = z;
  }
  
  double delta(){
    delta = (b*b) - 4.0 * a * c;
    return delta;
  }
  
  void numeroDeRaizesReais(){
    
    if( delta > 0 )
      System.out.println("A equacao possui duas raizes reais diferentes");
      
    else if(delta == 0 )
      System.out.println("A equacao possui duas raizes iguais");
    
    else if(delta < 0 )
      System.out.println("A equacao nao tem raizes reais");
    }  
    
  void imprimeRaizesReais(){
    if ( delta < 0)
      System.out.println("Nao existe raizes");
    
      else{
      double x1 = -b - ( Math.sqrt(delta) ) / (2*a);
      double x2 = -b + ( Math.sqrt(delta) ) / (2*a);
      System.out.println("A raizes sao "+ x1 + " "  + x2 );
    }
  }
  
}

