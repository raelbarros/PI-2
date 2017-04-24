class Media{
  
  double media, y;
  double calculaMedia(double x){
    y = x;
    media = 0.0;
    if (y <= 0)
      System.out.println("Media é: "+ media);
    else{ 
      while(y >= 1){
      media = (media + y);
      y--;  
      }
    }
    media = media / x;
    System.out.println("Media é: "+ media);
   return media; 
  }


}