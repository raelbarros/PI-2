import java.util.Scanner;
class ListaRegistros {

  RegistroAluno [] listaAlunos = new RegistroAluno[5];
  int quantidadeAlunos = 0;

  RegistroAluno novoRegistro(){
    RegistroAluno novoAluno = new RegistroAluno();
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Digite o nome do Aluno");
    String n = sc.next();
    
    System.out.println("Digite a idade do Aluno");
    int i = sc.nextInt();
    
    System.out.println("Digite o curso do Aluno");
    String c = sc.next();
    
    novoAluno.inicializarAluno(n, i, c);
    //novoAluno.imprimirAluno();
    
    return novoAluno;   
  }
  
  void adicionarRegistro(RegistroAluno novoRegistro){
    
    if (quantidadeAlunos < 5){
      listaAlunos[quantidadeAlunos] = novoRegistro;
      quantidadeAlunos++;
    }
    else{
      System.out.println("A LISTA DE ALUNO ESTA CHEIA");
    }
  }
  
  void imprimirLista(){
    if (quantidadeAlunos == 0){
        System.out.println("Lista de aluno vazia");
    }
      
    else{
      for (int i = 0; i < quantidadeAlunos; i++){
        listaAlunos[i].imprimirAluno();      
      }
    }
  }
  
  
  public static void main(String[] args){
  
    ListaRegistros l1 = new ListaRegistros();
    RegistroAluno r;
    
    for (int i = 0; i < 7; i++){
      r = l1.novoRegistro();
      l1.adicionarRegistro(r);
      l1.imprimirLista();
    }
  }
  
}