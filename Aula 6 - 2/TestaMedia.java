import java.util.Random;
class TestaMedia{
  
  Random rdn = new Random();
  int aux, y = 0; 

  void testaCalculaMedia(){
    
    Media x = new Media();
          
      do{
        aux = rdn.nextInt(100);
        System.out.println(aux);
        
        if (x.calculaMedia(aux) < 0)
          System.out.println("O programa esta errado");
        
        y++;
      }
      while(y < 5);
      
      y = 0;
      System.out.println("Fim dos Testes");
  }

}