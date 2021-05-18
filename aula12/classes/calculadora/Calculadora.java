import java.io.*;
class Calculadora{
public static void main (String args[]){
  int dividendo, divisor, quociente;
  System.out.println("Informe valores para realizar a divisao");
  BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
  try{
      System.out.println("Infome o dividendo");
      dividendo = Integer.parseInt(teclado.readLine());
  } catch(Exception e){
    System.out.println("Erro no dividendo");
    dividendo = 0;
  }

  try{
       System.out.println("Infome o divisor");
       divisor = Integer.parseInt(teclado.readLine());
   } catch(Exception e){
        System.out.println("Erro divisor");
        divisor = 0;
     }
  try{
      // realizando o calculo
       quociente = dividendo /divisor;
       if (divisor == 0)
 //caso o divisor for zero vou criar um erro para ser tratado
         throw new Exception();        
         System.out.println("Resultado = " + quociente);
     } catch(Exception e){
       System.out.println("Erro foi de divisao por zero");
    }
     finally{
     System.out.println("Executando uma validacao final ! ");
     }
}
}