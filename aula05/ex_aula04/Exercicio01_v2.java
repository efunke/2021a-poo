import java.io.*;
class Exercicio01_v2
{
 public static void main (String args[])
 {
  int a,b;
  a=0;
  b=0;
  System.out.println("Programa que testa dois numeros");
  BufferedReader teclado = new BufferedReader(
   new InputStreamReader(System.in));
  try
  {
   System.out.println("Informe o valor do primeiro numero");
   a = Integer.parseInt(teclado.readLine());
   System.out.println("Informe o valor do segundo numero");
   b = Integer.parseInt(teclado.readLine());
//Agora vamos testar os dois valores
  if (a == b)
  {
    System.out.println("Os dois numeros sao iguais");
//verificar se o primeiro e maior
  }else{
        if (a > b)
        {
          System.out.println("Os primeiro numero he maior");
//verificar se o segundo e maior
        }else{
          System.out.println("Os segundo numeros he maior");
        }
  }
 } catch (IOException e)
   {
     System.out.println("Houve erro na entrada de dados");
   }
   catch (NumberFormatException e)
   {
        System.out.println("Houve erro na conversao, digite apenas caracteres numericos");
       
   }
 }
}

