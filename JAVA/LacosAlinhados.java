class LacosAlinhados{

  void imprimir(){
    int i;
    
    for (i = 1; i <= 10; i++){
      for (int j = 0; j <= 10; j++){
        System.out.println(i + " x "+ j + " = "+ i*j);
      }
      System.out.println("---------");
    }
    
  }
}