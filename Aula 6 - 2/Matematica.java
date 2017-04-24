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
  
  double pot(double x, int y){
    double pot;
    
    if ( (x == 0) || ( x == 1) || (y == 1) )
      return x;
    
    else if(y == 0)
      return 1;
    
    else
    pot = Math.pow(x,y);
    
    return pot;
  }
  
  double fatorial(int x){
     int num = x;
     int aux = num;
     int fat = 1;

      if (num < 0){
       return -1;
      }
    
      else {
        while(num > 1 ){
        fat = fat * (num);
        num--;
        }
        return fat;
      } 
    }
  
   double cos(double x){
    int k = 2; 
    double termo = 0;
    double cos = 0;
    double sinal = -1; 
    
    do{
      termo = pot(x, k) / fatorial(k); 
      sinal = -sinal; 
      cos = cos + sinal * termo; 
      k+=2; 
    }
    while (pot(termo, 2) > pot(epsilon, 2)) ;
    
    return 1-cos; 
  }
   
   double ln(double x){
    x= 1-x;
    int k=2; 
    double termo = 0;
    double ln = x;
    double sinal = 1; 
    
    do{
      termo = ( pot(-1, k - 1) * pot(x, k) ) / k; 
      sinal = - sinal; 
      ln = ln + sinal * termo; 
      k++; 
    }
    while (pot(termo, 2) > pot(epsilon, 2)) ;
    
    return -1*ln; 
  }
 
}