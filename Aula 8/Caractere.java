class Caractere{

  void imprimeCaracteres(char ch, int n){
    int i =0;
    
    while (i < n){
      System.out.print(ch);
      i++;   
    }  
    
  }
  
  void novaLinha(){
    System.out.println();
  }
  
  void imprimeCaracteresNL(char ch, int n){
    imprimeCaracteres(ch , n);
    novaLinha();  
  }
  
  void desenhaLetraE(){
    imprimeCaracteresNL('*',30);
    imprimeCaracteresNL('E',15);
    imprimeCaracteresNL('E',14);
    imprimeCaracteresNL('E',3);
    imprimeCaracteresNL('E',3);
    imprimeCaracteresNL('E',13);
    imprimeCaracteresNL('E',13);
    imprimeCaracteresNL('E',3);
    imprimeCaracteresNL('E',3);
    imprimeCaracteresNL('E',14);
    imprimeCaracteresNL('E',15);
    imprimeCaracteresNL('*',20);
  }
  
}