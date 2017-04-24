class Ola{

  int x = 0;
  
  void cumprimenta (){
    
    if (x==0){
     System.out.println("Bom dia");
     x++;
    }
    
    else if (x==1){
      System.out.println("Boa tarde");
      x++;
    }

    else if (x==2){
      System.out.println("Boa noite");
      x=0;
    }
    
  }
}
