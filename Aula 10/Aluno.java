import java.util.Scanner;
class Aluno {
 
  String nome; 
  int idade;
  String curso;
  
  void definirNome(String n){
    nome = n;  
  }
  
  void definirIdade(int x){
    idade = x;
  }
  
  void definirCurso(String c){
    curso = c;
  }
  
  String obterNome(){
    return nome;
  }
  
  int obterIdade(){
    return idade;
  }
  
  String obterCurso(){
    return curso;
  }
}