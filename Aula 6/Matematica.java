class Matematica{

  double epsilon = 1.0e-8;
  
  double sen(double x){
    int k = 1;
    double termo = x;
    double seno = termo;
    
    do{
      k = k + 2;
      termo = -termo * x * x / (k - 1) / k;
      seno = seno + termo;    
    }
    while(termo * termo > epsilon * epsilon);
    
    return seno;  
  }
}