package calculonum;


public class CalculoNum {

    public static double funcao(double x,double a){    //Função para calcular a função de x
    
         return (a*Math.pow(2.71828182846, x))-(4*Math.pow(x, 2));
  
     }
    
     public static double dfuncao(double x){        //Função para calcular a derivada da função
    
         return Math.pow(2.71828182846, x)-(8*x);
  
     }
  
 
}
