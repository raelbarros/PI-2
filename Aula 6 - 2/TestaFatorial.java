import java.util.Random;
class TestaFatorial{
  
  Random rdn = new Random();
  int aux, y = 0;  

  void fatoraTudo(){
      Fatorial f = new Fatorial();
      
      do{
        aux = rdn.nextInt(10)-1;
     
        if(f.calculaFatorial(aux) == -1){
          System.out.println("Teste negativo certo");
        }
    
        else if(f.calculaFatorial(aux) != 1){
          System.out.println("Teste fatora positivo errado");
        }
        y++;
      }
      while(y < 5);
      y = 0;
    System.out.println("Fim dos Testes");
  }
}