import java.util.Scanner;
public class Excecao
{
 public static void main(String args[])
 { 
     int d=0, a=0;
     
     Scanner teclado = new Scanner(System.in);
   try
   {
     System.out.println("Dentro do bloca de excecao");
     a=42/d;
   }catch(Exception e)
 {
   System.out.println("Err: "+ e);
   System.out.println("Favor informar um numero inteiro");
   d = teclado.nextInt();
   if (d > 0)
   {
     a=42/d;
   }
 }
 System.out.println("O valor final do a ="+a);
 }
}