import java.util.*;
class Matriz{

  void carregaMatriz(int [][]mat){
    for (int i = 0; i < mat.length; i++){
      for (int j = 0; j < mat[0].length; j ++){
        mat[i][j] = 20;
      }
    }
  }
  
  void imprimeMatriz(int[][] mat){
    System.out.println("A matriz ficou: ");
    for (int i = 0; i < mat.length; i++){
      for (int j = 0; j < mat[0].length; j ++){
        System.out.print(mat[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println();
  }

  void preencheMatriz(int[][] mat){
    for (int i = 0; i < mat.length; i++){
      for (int j = 0; j < mat[0].length; j ++){
        mat[i][j] = i;
      }
    }
  }
  
  void somaMatriz(int[][] mat){
    for (int i = 0; i < mat.length; i++){
      for (int j = 0; j < mat[0].length; j ++){
        mat[i][j] = i + j;
      }
    }
  }

  void somaLinha(int[][] mat){
    for (int i = 0; i < mat.length; i++){
      int somaL = 0;
      for (int j = 0; j < mat[0].length; j ++){
        somaL += mat[i][j];        
      }
      System.out.println("Soma da "+ (i+1) +" linha eh igual: " + somaL);
    }
  }  
  
  void somaColuna(int[][] mat){
    for (int i = 0; i < mat[0].length; i++){
      int somaC = 0;       
      for (int j = 0; j < mat.length; j++){
        somaC += mat[j][i];              
      }
      System.out.println("Soma da "+ (i+1) +" coluna eh igual: " + somaC);      
    }
  }
  
  void somaTotal(int[][] mat){
    int somaT = 0;
    for (int i = 0; i < mat.length; i++){
      for (int j = 0; j < mat[0].length; j++){
        somaT += mat[i][j];     
      }    
    }
    System.out.println("A Soma Total eh: "+ somaT);
  }
  
  void mediaPositivo(int[][] mat){
    int total = 0;
    int soma = 0;
    for (int i = 0; i < mat.length; i++){
      for (int j = 0; j < mat[0].length; j++){
        if (mat[i][j] > 0){
          soma += mat[i][j];
          total++;
        }    
      }    
    }
    System.out.println("A media dos numeros positivos eh: "+ (soma/total));
  }
  
  
  void imprimeDiagonalPrincipal(int[][] mat){
    System.out.println("Diagonal principal eh: ");
    for (int i = 0; i < mat.length; i++){
      for (int j = 0; j < mat.length; j++){
        if(j == i){
          System.out.print(mat[i][j]+ " ");
        }
      }
    }
    System.out.println();
  }
  
  void imprimeDiagonalSuperior(int[][] mat){
    System.out.println("Superior principal eh: ");
    for (int i = 0; i < mat.length; i++){
      for (int j = 0; j < mat.length; j++){
        if(j >= i){
          System.out.print(mat[i][j]+ " ");
        }
      }
    }
  }
  
    
  public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   
   System.out.println("Digite o numero de linhas da Matriz:");
   int l = sc.nextInt();
   
   System.out.println("Digite o numero de colunas da Matriz:");
   int c = sc.nextInt();   
   
   int somaL;
   int [][] mat = new int[l][c];
   
   Matriz x = new Matriz();
   
   x.carregaMatriz(mat);
   x.imprimeMatriz(mat);
   
   x.preencheMatriz(mat);
   x.imprimeMatriz(mat);
   
   x.somaMatriz(mat);
   x.imprimeMatriz(mat);
   
   x.somaLinha(mat);
   System.out.println();
   
   x.somaColuna(mat);
   System.out.println();
   
   x.somaTotal(mat);
   System.out.println();
   
   x.mediaPositivo(mat);
   System.out.println();
   
   x.imprimeDiagonalPrincipal(mat);
   System.out.println();
   
   x.imprimeDiagonalSuperior(mat);
     
     
  } 

}