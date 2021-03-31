import java.util.Scanner;
class Ex_a06_02
{
 public static void main (String args[])
 {
 int a=0;
 Scanner teclado = new Scanner(System.in);
 System.out.println("Programa que testa dois numeros");
 System.out.println("Informe o valor do primeiro numero");
 a = teclado.nextInt();
 System.out.println("Informe o valor do segundo numero");
 int b = teclado.nextInt();
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
 }
}



