import java.io.*;
public class Exercicio01_v1 {
public static void main(String[] args)
  throws java.io.IOException{
 int num1=0;
 int num2=0;
 String leitura = "";
 BufferedReader teclado = new BufferedReader
 (new InputStreamReader (System.in));
 System.out.println("Programa que testa dois numeros"); 
 try
 {
   System.out.println("Informe o primeiro numero");
   leitura = teclado.readLine();
  //conversao para inteiro
   num1 = Integer.parseInt(leitura);
   System.out.println("Informe o segundo numero");
   num2 = Integer.parseInt(teclado.readLine());
  //teste de variaveis
   if(num1 > num2){
       System.out.println("O 1o numero [" +num1
                            +"] e maior que o 2o");
   }
   if (num1 < num2){  
     System.out.println("O 2o numero [" +num2
                         +"]e maior que o 1o");
   }
   if(num1 == num2){//senao
      System.out.println("Os numeros sao iguais");
   }
}catch(Exception erroLeitura){
    System.out.println("Voce informou um valor errado!"); 
}//finaliza o catch
}//finaliza o metodo main
}//finaliza a classe
