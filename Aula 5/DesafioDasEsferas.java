import java.util.Random;

class DesafioDasEsferas{
  
  //joga numeros aleatorios para fazer o teste no final
  Random rdn = new Random();  
  int testa = rdn.nextInt(3);
  int testa2 = (rdn.nextInt(3) + 3);
  
  
  //declaração de variavel
  int esfera;
  boolean x, ladoDireito, ladoEsquerdo; 

  //carrega valores da esfera diferente
  void defineEsferaDiferente(int a, boolean b){
      esfera = a;
      x = b;
  }
  
  //resolve o problema proposto
  void resolveDesafio(){
    //verifica o lado mais pesado na 1º passada
    if ( (esfera < 6 && x == true) || (esfera >= 6 && x == false) ){
      ladoEsquerdo = true;
      System.out.println("Lado esquerdo mais pesado");
    }
    
    else if ( (esfera >= 6 && x == true) || (esfera < 6 && x == false) ){
      ladoDireito = true;
      System.out.println("Lado direito mais pesado");
    }

    //apos passar na primeira passada verifica novamente qual lado é mais pesado
      if (ladoEsquerdo == true){
        if ( (esfera < 3 && x == true) || (esfera >= 3 && x == false) ){
          ladoEsquerdo = true;
          System.out.println("Lado esquerdo mais pesado");
        }
        //se nao passar no teste anterior ele dediz que a espera esta no outro lado
        else if (testa != esfera){
          System.out.println("balanca equilibrada");
        }
        
        // deduz a resposta do lado oposto
        System.out.println("A resposta é: " + testa2);
        
        //confirma a resposta
        if (testa2  == esfera)
            System.out.println("Resposta certa");
          else
            System.out.println("Resposta errada");
      }
      
      else if (ladoDireito == true){ 
          if ( (esfera >= 3 && x == true) || (esfera < 3 && x == false) ){
          ladoDireito = true;
          System.out.println("Lado direito mais pesado");
          }
          
          else if (testa2 != esfera){
          System.out.println("balanca equilibrada");
          }
          
          System.out.println("A resposta é: " + testa);
          
          if (testa  == esfera)
            System.out.println("Resposta certa");
          else
            System.out.println("Resposta errada");
      }
      
  }
}
