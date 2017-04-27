class TabuadaMatriz{
  
  int [] [] tabuada = new int[10][11];
  
  void carregarMatriz(){
    int i;
    int linha, coluna;
    
    for (i = 1; i <= 10; i++){
      for (int j = 0; j <= 10; j++){
        linha = i -1;
        coluna = j;
        
        tabuada[linha][coluna] = i * j;
      }
    } 
  }
  
  void imprimir(){
    for(int i =0; i < 10; i++){
      for(int j = 0; j <= 10; j++){
        System.out.println("tabuada[" + i + "][" + j + "] = " + tabuada[i][j]);
      }  
    }
  
  }
}