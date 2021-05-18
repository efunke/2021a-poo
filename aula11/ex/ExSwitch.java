public class ExSwitch
{
  public static void main(String [] args){
   int num;
   num = Entrada.leiaInt("Informe um numero inteiro de 1 a 10");
   switch(num){
     case 1: case 3: case 5: case 7: case 9:
       System.out.println("o numero e numero impar");
       break;
     case 2: case 4: case 6: case 8: case 10:
       System.out.println("o numero e numero par");
       break;
     case 20:
       System.out.println("Voce informou valores maiores de 10");
       break;
     default:
       System.out.println("O numero nao esta entre 1 e 10");
   }
  }
}