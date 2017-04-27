import java.util.Scanner;
class Exercicio1{
  
  Scanner sc = new Scanner(System.in);
  
  void carregaMatriz(int[][] mat){
    for(int i = 0; i < mat.length; i++){
      for(int j = 0; j < mat.length; j++){
        System.out.println("Insira os elementos M[" + i + "][" + j + "]");
        mat[i][j] = sc.nextInt();
      }
    }
  }
  void imprimeMatriz(int[][] mat){
    System.out.println("A Matriz ficou");
    
    for(int i = 0; i < mat.length; i++){
      for(int j = 0; j < mat.length; j++){
        System.out.print(mat[i][j] + " ");
      }
      System.out.println();
    }
  }
  
  
  public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Quantas linhas vao ter na matriz: ");
    int l = sc.nextInt();
    
    System.out.println("Quantas colunas vao ter na matriz: ");
    int c = sc.nextInt();
    
    int [][] matriz = new int [l][c];
    
    Exercicio1 x = new Exercicio1();
    x.carregaMatriz(matriz);
    x.imprimeMatriz(matriz);
  }
  
}