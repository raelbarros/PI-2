class Caractere1{
  
  void verificaResposta(char ch){
    if ((ch == 's') || (ch == 'S'))
      System.out.println("A resposta foi sim");
    
    else if ((ch == 'n') || (ch == 'N'))
      System.out.println("A resposta foi nao");
  
    else
      System.out.println("Resposta invalida");
  
  }


}