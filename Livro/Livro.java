class Livro {
 String titulo, autor;
 int isbn, quantidadePaginas;

 void setTitulo(String novoTitulo){ // Metodo Set para livro
   titulo = novoTitulo;
 }
 
 void setAutor(String novoAutor){
   autor = novoAutor;
 }
 
 void setISBN(int novoISBN){
   isbn = novoISBN;
 }
 
 void setQuantidadePaginas(int novaQuantidade){
   quantidadePaginas = novaQuantidade;
 }
 
 String getTitulo(){
   return titulo;
 }
 
 String getAutor(){
   return autor;
 }
  
 int getQuantidade(){
   return quantidadePaginas;
 }
 
 int getISBN(){
   return isbn;
 }
}
 

 
