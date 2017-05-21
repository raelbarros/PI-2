import java.util.*;
class Biblioteca {
 Livro[] listaLivros = new Livro [5];
 
 Livro criarLivro(){
   Livro novoLivro = new Livro();
   
   Scanner sc = new Scanner(System.in);
   
   
   System.out.println("Digite o titulo do livro: ");
   novoLivro.setTitulo(sc.next());
   
   System.out.println("Digite o nome do autor: ");
   novoLivro.setAutor(sc.next());
   
   System.out.println("Digite as quantidades de paginas do livro: ");
   novoLivro.setQuantidadePaginas(sc.nextInt());
   
   System.out.println("Digite o ISBN do livro: ");
   novoLivro.setISBN(sc.nextInt());
   
   return novoLivro;
}
 void inserirLivro(){
   Livro novo = this.criarLivro();
 
   for(int i =0; i < listaLivros.length; i++ ){
     if (listaLivros[i] == null){
       listaLivros[i] = novo;
       return;
     }   
   }
   System.out.println("Não é possivel inserir o livro"); 
 }

 void imprimirLivros(){
   for(int i = 0; i < listaLivros.length; i++ ){
     if (listaLivros[i] == null)
       System.out.println("Livro nao cadastrado");
     
     else{
       System.out.println("Livro[" + (i+1)+ "]");
       System.out.println("Titulo: "+ listaLivros[i].getTitulo());
       System.out.println("Autor: " + listaLivros[i].getAutor());
       System.out.println("Quantidade de paginas: "+ listaLivros[i].getQuantidade());
       System.out.println("ISBN: "+ listaLivros[i].getISBN());
     }
   }
 }

 
}