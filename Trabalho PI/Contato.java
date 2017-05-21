 /*------------------------------------------------------------[]
 /* Centro Universitario Senac - 1o semestre 2017                        
 /* Projeto Integrador II
 /* Nomes : Israel Barros                           
 /*         Mauro Costa   
 /*         Paulo Navarro
 /*------------------------------------------------------------[]
 */


class Contato{ 
  
  String nome, sobrenome, endereco, email, telCelular, aniversario;  
  
  //insere elementos
  void setNome(String novoNome){
    nome = novoNome;
  }
  
  void setSobrenome(String novoSobrenome){
    sobrenome = novoSobrenome;
  }
  
  void setEndereco(String novoEndereco){
    endereco = novoEndereco;
  }
    
  void setEmail(String novoEmail){
    email = novoEmail;
  }
  
  void setTelCelular(String setTelCelular){
    telCelular = setTelCelular;
  }
    
  void setAniversario(String novoAniversario){
    aniversario = novoAniversario;
  }
  
  //pega elementos
  String getNome(){
    return nome;
  }
  
  String getSobrenome(){
    return sobrenome;
  }
  
  String getEndereco(){
    return endereco;
  }
  
  String getEmail(){
    return email;
  }
    
  String getTelCelular(){
    return telCelular;
  }   
  
  String getAniversario(){
    return aniversario;
  }
  
 
}
