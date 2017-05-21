 /*------------------------------------------------------------[]
 /* Centro Universitario Senac - 1o semestre 2017                        
 /* Projeto Integrador II
 /* Nomes : Israel Barros                           
 /*         Mauro Costa   
 /*         Paulo Navarro
 /*------------------------------------------------------------[]

 TROCAR O ENDEREÇO DO ARQUIVO "Contatos.txt" NO METODO "lerDoArquivo" ANTES DE EXECUTAR
 */

import java.util.Scanner;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import javax.swing.JOptionPane;

class Agenda {
  //cria um vetor da classe contatos.
  Contato [] agenda = new Contato[5];
  
  //insere elementos os elementos na classe contato
  Contato criarContato(){
    Contato novoContato = new Contato();
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Digite o nome do contato: ");
    novoContato.setNome(sc.next());
    
    System.out.println("Digite o sobrenome do contato: ");
    novoContato.setSobrenome(sc.next());
     
    System.out.println("Digite o endereco do contato: ");
    novoContato.setEndereco(sc.next());
     
    System.out.println("Digite o e-mail do contato: ");
    novoContato.setEmail(sc.next());
     
    System.out.println("Digite o numero de celular do contato: ");
    novoContato.setTelCelular(sc.next());
     
    System.out.println("Digite a data de aniversario do contato: ");
    novoContato.setAniversario(sc.next());
    
    return novoContato;
  }
  
  void inserirContato(){
    Contato novoContato = this.criarContato();
    
    for(int i =0; i < agenda.length; i++ )
      if (agenda[i] == null){
        agenda[i] = novoContato;
        return;
      }  
    System.out.println("A agenda esta cheia"); 
  }
  
  
  void inserirContatoNoInicio(){
    Contato novoContato = this.criarContato();
    
    boolean cheio = true;
    int x = 0;
    Contato aux;
    
    //procura se ha espaco na agenda
    for(int i = 0; i < agenda.length; i++)
      if(agenda[i] == null){
        cheio = false;
        x = i;
        break;
      }
    
    if(cheio == true)
      System.out.println("A agenda esta cheia");
    
    //se estiver espaço, ele joga os elementos para direita
    else if(cheio == false)
      for(int i = x; i >= 0; i--)
        for(int j = i-1; j >= 0; j--)
          if(agenda[i] == null){
            aux = agenda[i];
            agenda[i] = agenda[j];
            agenda[j] = aux;
          }   
    
    agenda[0] = novoContato;   
  }
  
  boolean excluirContato(){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Qual contato vc deseja excluir: ");
    int num = sc.nextInt() - 1;
    
    int x = 0;
    Contato aux;
    
    //contador para verificar se a agenda esta vazia
    for(int i = 0; i < agenda.length; i++)
      if(agenda[i] == null)
      x++;
    
    //verifica se a agenda esta vazia
    if(x == agenda.length){
      System.out.println("A agenda esta vazia");
      return false;
    } 
    
    //verifica se ha algum contato na posicao informada
    else if(agenda[num] == null){
      System.out.println("Nao ha contatos na posicao "+ (num + 1) +" da agenda");
      return false;
    } 
    
    //exclui o contato informado e joga os seguintes para esquerda
    else{
      agenda[num] = null;
      for(int i = num; i < agenda.length-1 ; i++)
        for(int j = i+1; j < agenda.length; j++)
        if (agenda[i] == null){
        aux = agenda[i];
        agenda[i] = agenda[j];
        agenda[j] = aux;
      }
    }
    
    return true;
  }

  void consultarContato(){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Qual contato vc deseja consultar: ");
    int num = sc.nextInt() - 1;
    
    //verifica se o ha algum contato no indice informado
    if(agenda[num] == null)
      System.out.println("Contato vazio");
    
    else
      imprimePorIndice(num);
    
  }
  
  //metodo auxiliar para imprimir a agenda por indice
  void imprimePorIndice(int i){
    
    System.out.println(" --- Contato " + (i+1)+ " ---");
    System.out.println("Nome: "+ agenda[i].getNome());
    System.out.println("Sobrenome: "+ agenda[i].getSobrenome());
    System.out.println("Endereco: " + agenda[i].getEndereco());
    System.out.println("E-mail: "+ agenda[i].getEmail());
    System.out.println("Numero do celular: "+ agenda[i].getTelCelular());
    System.out.println("Data de aniversario: "+ agenda[i].getAniversario());
  }
  
  void substituirContato(){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Qual contato vc deseja substituir: ");
    int num = sc.nextInt() - 1;
    
    //verifica se ha algum contato no indice informado
    //caso nao, ele ja insere um novo
    if(agenda[num] == null){
      System.out.println("Nao existe nenhum contato neste indice");
      System.out.println("Entre com um novo contato: ");      
      Contato novoContato = this.criarContato();
      agenda[num] = novoContato;      
    }    
    else if(agenda[num] != null){
      Contato novoContato = this.criarContato();
      agenda[num] = novoContato;
    }
    
  }
  
  void contatosComTermo(){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Digite o nome que procura: ");
    String  letra = sc.next();
    
    boolean encontrou = false;
    
    //procura o contato pela letra informada pelo usuario
    for(int i = 0; i < agenda.length; i++)
      if( (agenda[i] != null) && (agenda[i].getNome().contains(letra)) ){
        imprimePorIndice(i);
        encontrou = true;
      }
    
    //caso nao encontre ele informa ao usuario
    if(encontrou != true)
      System.out.println("Nao foi encontrado"); 
  }
  
  void imprimirAgenda(){
    for(int i = 0; i < agenda.length; i++ ){
      System.out.println();
      System.out.println(" --- Contato " + (i+1)+ " ---");
      System.out.println("Nome: "+ agenda[i].getNome());
      System.out.println("Sobrenome: "+ agenda[i].getSobrenome());
      System.out.println("Endere?o: " + agenda[i].getEndereco());
      System.out.println("E-mail: "+ agenda[i].getEmail());
      System.out.println("Numero do celular: "+ agenda[i].getTelCelular());
      System.out.println("Data de aniversario: "+ agenda[i].getAniversario());
    }
  }
  
  //quantidade de contatos na agenda
  int quantidadeElementos(){
    int aux = 0;
    for(int i =0; i < agenda.length; i++ )
      if (agenda[i] != null)
        aux++;
               
    System.out.println("A agenda tem " +aux+ " contato(s) criados.\n");
    return aux;
  }
  
  //quantidade de espacos disponiveis na agenda
  int capacidadeAgenda(){
    int aux = 0;
    for(int i =0; i < agenda.length; i++ )
      if (agenda[i] == null)
        aux++;   
        
    System.out.println("A agenda tem " +aux+ " contato(s) disponiveis para serem criados.\n");
    return aux;   
  }

  //ordena os nomes dos contatos por ordem alfabetica
  void ordenaAgenda(){
    Contato aux;
      for (int i = 0; i < agenda.length; i++) 
      for (int j = i+1; j < agenda.length; j++) 
        if ((agenda[i].getNome().compareToIgnoreCase(agenda[j].getNome()) > 0)){
          aux = agenda[i];
          agenda[i] = agenda[j];
          agenda[j] = aux;
        } 
  }
  
  //le do arquivo .txt na pasta do trabalho
  void lerDoArquivo(){  
    
    //alterar o endereço arquivo .txt
    Path caminho = Paths.get("C:/Users/israel/Downloads/JAVA/Contatos.txt");
    
    try{
      byte[] texto = Files.readAllBytes(caminho);
      String leitor = new String(texto);
      
      //imprime os contatos atravez do interactions
      System.out.println(leitor);
      
      //imprime em uma janela
      //JOptionPane.showMessageDialog(null, leitor);
      
    }catch(Exception erro){
      
    }  
  }
  
  //menu visual do usuario
  void menuDoUsuario(){
    System.out.println(" ---------------------- MENU DO USUÁRIO ---------------------- \n");
    System.out.println("Selecione um item abaixo: \n");
    
    System.out.println("1 - Incluir elementos na próxima posição disponível da agenda.");
    System.out.println("2 - Incluir elementos no início da agenda.");
    System.out.println("3 - Exclusão de elementos na agenda.");
    System.out.println("4 - Consultar o contato de um índice da agenda.");
    System.out.println("5 - Consultar o contato pelo nome.");
    System.out.println("6 - Substituir o contato de um índice da agenda.");
    System.out.println("7 - Impressão de todos os contatos da agenda.");
    System.out.println("8 - Impressão da quantidade de contatos inseridos.");
    System.out.println("9 - Impressão da capacidade total de contatos disponiveis.");
    System.out.println("10 - Ordenação ascendente pelo nome.");
    System.out.println("11 - Ler de arquivo.");
    System.out.println("12 - Sair.");
  }
  
  public static void main(String [] args){
    
    Agenda exe = new Agenda();
    
    Scanner sc = new Scanner(System.in);
    
    exe.menuDoUsuario();
    
    System.out.println();
    
    int select = sc.nextInt();
    
    //executa o menu do usuario até ele digitar (12) para sair
    while(select != 12) {
      
      switch (select){
        
        case 1:        
          exe.inserirContato();
          break;
          
        case 2:
          exe.inserirContatoNoInicio();
          break;
          
        case 3:
          exe.excluirContato();
          break;
          
        case 4:
          exe.consultarContato();
          break;
          
        case 5:
          exe.contatosComTermo();
          break;
          
        case 6:
          exe.substituirContato();
          break;
          
        case 7:
          exe.imprimirAgenda();
          break;
          
        case 8:
          exe.quantidadeElementos();
          break;
          
        case 9:
          exe.capacidadeAgenda();
          break;
          
        case 10:
          exe.ordenaAgenda();
          break;
          
        case 11:
          exe.lerDoArquivo();
          break;
          
        default:
          select = 12;
          
      }
      
      exe.menuDoUsuario();
      System.out.println();
      select = sc.nextInt();
    }    
  }
}