 public class Ex_a06_11 {  
      public static void main(String[] args) {  
 int a, b,r;
        System.out.println("Imprime valores 2, 5 e 8 ");        
      
 for (a=1, b =1; a+b<=10; a+=2, b++) {
   //Teste de mesa
     System.out.println("A: " +a);        
   System.out.println("B: "+b);
   System.out.println("A+B: "+(a+b));
   System.out.println("A+=2: "+(a+=2));
   System.out.println("*** Resultado *** ");
   
   r = a + b;  
          System.out.println("Os valores sao " + r);  
        }  
       
      }  
    }  
