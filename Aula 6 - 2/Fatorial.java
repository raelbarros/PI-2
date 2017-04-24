class Fatorial {

  int fat, num, aux;

  int calculaFatorial(int x){
     num = x;
     aux = num;
     fat = 1;

      if (num < 0){
       System.out.println("Nº informado é negativo"); 
       return -1;
      }
    
      else {
        while(num > 1 ){
        fat = fat * (num);
        num--;
        }
        System.out.println(aux + "! = " + fat);
      }
      return 1;
    }
  }