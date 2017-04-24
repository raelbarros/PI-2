class Aluno{

  double p1;
  double p2;
  double p3;
  double p4;
  
  void carregaNotas(double n1, double n2, double n3, double n4){
    p1 = n1;
    p2 = n2; 
    p3 = n3;
    p4 = n4;
  }
  
  double media (){
    double notaTotal = (p1 + p2 + p3 + p4) / 4;
    
    if (notaTotal >= 6)
      System.out.println("Aprovado");
    
    else if (notaTotal >= 4 && notaTotal < 6)
      System.out.println("Recuperacao");
    
    else if (notaTotal < 4)
      System.out.println("Reprovado");
    
    return notaTotal;
  }
}