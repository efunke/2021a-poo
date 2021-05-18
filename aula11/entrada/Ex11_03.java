//import javax.swing.JOptionPane;

//import javax.swing.*;
class Ex11_03
{
 public static void main (String args[])
 {
   int a = 0;
   System.out.println("Programa que testa dois numeros");

   a = Entrada.leiaInt("Informe o valor do primeiro numero");
   int b = Entrada.leiaInt("Informe o valor do segundo numero");
//Agora vamos testar os dois valores
  if (a == b)
  {

    System.out.println("Os dois numeros sao iguais => 1º: " + a + " o 2º: "+ b);
    javax.swing.JOptionPane.showMessageDialog(null, "Os dois numeros sao iguais" ,
       "Testa numeros", javax.swing.JOptionPane.ERROR_MESSAGE);
    // ERROR_MESSAGE, 
    //  INFORMATION_MESSAGE,   
    // WARNING_MESSAGE, 
   //  QUESTION_MESSAGE,  
   //  PLAIN_MESSAGE
    //
//verificar se o primeiro e maior
  }else{
        if (a > b)
        {
          System.out.println("O primeiro numero he maior => 1º: " + a + " o 2º: "+ b);
          javax.swing.JOptionPane.showMessageDialog(null, "O primeiro numero he maior2" ,
       "Testa numeros", javax.swing.JOptionPane.INFORMATION_MESSAGE);
//verificar se o segundo e maior
        }else{//a < b
          System.out.println("O segundo numero he maior => 1º: " + a + " o 2º: "+ b);
           javax.swing.JOptionPane.showMessageDialog(null, "O segundo numero he maior" ,
       "Testa numeros", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }
  }
 }
}
