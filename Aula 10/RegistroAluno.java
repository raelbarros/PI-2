class RegistroAluno {
 
  Aluno umAluno = new Aluno();
  
  void inicializarAluno(String nome, int idade, String curso){
    
    umAluno.definirNome(nome);
    umAluno.definirIdade(idade);
    umAluno.definirCurso(curso);  
  }
  
  void imprimirAluno(){
  
    System.out.println("Nome: "+ umAluno.obterNome());
    System.out.println("Idade: "+ umAluno.obterIdade());
    System.out.println("Curso: "+ umAluno.obterCurso());
  }

 
  
  
}