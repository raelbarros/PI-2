import java.util.*;
class Exercicio2{
  
  Random rdn = new Random();
  
  void carregaMatriz(double[][] mat1, double[][] mat2){
    for(int i = 0; i < mat1.length; i++){
      for(int j = 0; j < mat1.length; j++){
        mat1[i][j] = rdn.nextInt(10)+1;
        mat2[i][j] = rdn.nextInt(10)+1;
      }
    }
  }

  void imprimeMatriz(double[][] mat){
    System.out.println("Matriz:");
    
    for(int i = 0; i < mat.length; i++){
      for(int j = 0; j < mat.length; j++){
        System.out.print(mat[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println();
  }
  
  void somaMatriz(double[][] mat1, double[][] mat2, double[][] mat3){
    for(int i = 0; i < mat1.length; i++){
      for(int j = 0; j < mat1.length; j++){
        mat3[i][j] = mat1[i][j] + mat2[i][j];
      }
    }
  }
  
  void produtoMatriz(double[][] mat1, double[][] mat2, double[][] mat3){
    for(int i = 0; i < mat1.length; i++){
      for(int j = 0; j < mat1.length; j++){
        mat3[i][j] = mat1[i][j] * mat2[i][j];
      }
    }
  }
  
   double somaTotal(double[][] mat1, double[][] mat2){
     double aux = 0; 
     for(int i = 0; i < mat1.length; i++){
      for(int j = 0; j < mat1.length; j++){
        aux += (mat1[i][j] + mat2[i][j]);
      }
    }
    return aux;
  }

  double produtoTotal(double[][] mat1, double[][] mat2){
    double aux = 1;     
    for(int i = 0; i < mat1.length; i++){
      for(int j = 0; j < mat1.length; j++){
        aux *= (mat1[i][j] * mat2[i][j]);
      }
    }
    return aux;
  }   

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Quantas linhas vao ter na matriz: ");
    int l = sc.nextInt();
    
    System.out.println("Quantas colunas vao ter na matriz: ");
    int c = sc.nextInt();
    
    double somaT = 0;
    double prodT = 0;
    double [][] mat1 = new double [l][c];
    double [][] mat2 = new double [l][c];
    double [][] mat3 = new double [l][c];
    
    Exercicio2 x = new Exercicio2();
    
    x.carregaMatriz(mat1, mat2);
    x.imprimeMatriz(mat1);
    x.imprimeMatriz(mat2);
    
    x.somaMatriz(mat1, mat2, mat3);
    System.out.println("--- SOMA ---");
    x.imprimeMatriz(mat3);
    
    x.produtoMatriz(mat1, mat2, mat3);
    System.out.println("--- PRODUTO ---");
    x.imprimeMatriz(mat3);
    
    somaT = x.somaTotal(mat1, mat2);
    System.out.println("A Soma total dos elementos eh: " + somaT);    

    prodT = x.produtoTotal(mat1, mat2);
    System.out.println("O Produto total dos elementos eh: " + prodT);        

    
    
  }
}