class TesteConversor2{

  int testaTudo(){
    Conversor2 c2 = new Conversor2();

     // criar variaveis inteiras
    int entrada = 40;
    int resposta = 104;
    
    if( c2.celparafah(entrada) == resposta ){
      System.out.println("Funcionou");
    }
    else 
      System.out.println("Nao Funcionou");
  
    return 0;
  }
}