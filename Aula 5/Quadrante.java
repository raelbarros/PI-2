class Quadrante{

  int x, y;
  
  void carregaValor(int a, int b){
    x = a;
    y = b;  
  }
  
  void achaQuadrante(){
    if (x == 0 && y == 0 )
      System.out.println("As coordenadas são = 0");
    
    else if (x > 0 && y > 0)
      System.out.println("Primeiro quadrante");
    
    else if (x > 0 && y < 0)
      System.out.println("Segundo quadrante");
    
    else if (x < 0 && y > 0)
      System.out.println("Terceiro quadrante");
    
    else 
      System.out.println("Quarto quadrante");
  }
}