import javax.swing.JOptionPane;
public class ExDoWhile2{
  public static void main(String[] args) {
    int valor;
    int soma = 0;
    do{
      String str = JOptionPane.showInputDialog(null,
        "Informe um valor inteiro:\n(ou 0 para sair)",
         "Do..While", JOptionPane.QUESTION_MESSAGE);
      valor = Integer.parseInt(str);
      soma += valor;
    }while(valor != 0);

    JOptionPane.showMessageDialog(null, "A soma he: " + soma,
       "Do..While", JOptionPane.INFORMATION_MESSAGE);
    
     JOptionPane.showMessageDialog(null,"A soma e: "+soma);
    
  }
}