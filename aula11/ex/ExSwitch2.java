import javax.swing.JOptionPane;
public class ExSwitch2{
  public static void main(String [] args){
   int num;
   num = Entrada.leiaInt("Informe um valor entre 1 e 5");
   switch(num){
     case 1: 
       System.out.println("Voce escolheu o 1");
       
//import javax.swing.JOptionPane;
       JOptionPane.showMessageDialog(null, "Voce escolheu o 1" ,
       "Switch", JOptionPane.INFORMATION_MESSAGE);
      
       break;
     case 2: 
       System.out.println("Voce escolheu o 2");
       javax.swing.JOptionPane.showMessageDialog(null, "Voce escolheu o 2" ,
       "Switch", JOptionPane.INFORMATION_MESSAGE);
       break;
     case 3: 
       System.out.println("Voce escolheu o 3");
       break;
     case 4: 
       System.out.println("Voce escolheu o 4");
       break;
     case 5: 
       System.out.println("Voce escolheu o 5");
       break;
     default:
       System.out.println("A opcao selecionada nao he valida ! ");
   }
  }
}