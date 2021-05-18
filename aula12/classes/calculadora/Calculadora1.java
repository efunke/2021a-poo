import java.io.*;
public class Calculadora1
{
  public static void main(String args[])
    throws java.io.IOException{
    int numero1, numero2 = 0;
    float resultado = 0.0f;
    BufferedReader teclado = 
    new BufferedReader(new InputStreamReader (System.in));
    System.out.println("Calculadora Basica"); 
    System.out.println("Informe o primeiro numeros para a Soma");
    numero1 = Integer.parseInt(teclado.readLine());
    System.out.println("Informe o segundo numeros para a Soma");
    numero2 = Integer.parseInt(teclado.readLine());
  /*System.out.println("Subtracao:"+ (numero1-numero2)); 
   System.out.println("Multiplicacao: "+ (numero1*numero2)); 
   System.out.println("Divisao: "+ (numero1/numero2)); */
    System.out.println("Resultados das operacoes"); 
    System.out.println("Soma: "+ (numero1+numero2)); 
    resultado = numero1+numero2;
    System.out.println("Soma: "+ resultado); 
    //System.out.printn(""); 
    
  }
}