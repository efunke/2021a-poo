import java.util.*;
class Ex_a06_01{
  public static void main(String args[]){
   Scanner teclado = new Scanner(System.in);
    System.out.println("Tipo de Combustível (a/g)");
    char tipo = teclado.next().charAt(0);
    if (tipo == 'a') {
       System.out.println("Álcool");
    } else {
            if (tipo == 'g'){
               System.out.println("Gasolina");
            } else {
              System.out.println("Tipo não identificado");
            }// final do segundo if (mais interno)
    }//final do primeiro if
  } // final da classe main
} //final do classe
