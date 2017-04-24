class TesteConversor{

  int testa(){
    Conversor c1 = new Conversor();
    
    if(c1.celparafah() == 104){
      System.out.println("Funcionou");
    }
    else {
      System.out.println("Nao funcionou");
    }
    
    return 0;
  }
}