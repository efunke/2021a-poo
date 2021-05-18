/* Faca um programa que leia 3 nomes de pessoas 
 * com suas respectivas idades. 
 * Efetuar a media das idades lidas e exiba o resultado 
 */

public class Ex11_02
{
    public static void main(String args[]) 
    {
      int idade1, idade2, idade3;
      String nome1, nome2, nome3;
      
      nome1 = Entrada.leiaString("Digite o nome da primeira pessoa");
      idade1 = Entrada.leiaInt("Digite a idade da primeira pessoa");
      
      nome2 = Entrada.leiaString("Digite o nome da segunda pessoa");
      idade2 = Entrada.leiaInt("Digite a idade da segunda pessoa");
      
      nome3 = Entrada.leiaString("Digite o nome da terceira pessoa");
     // idade3 = Entrada.leiaInt("Digite a idade da terceira pessoa");
      
      
      float fidade1 = new Float(idade1).floatValue();
      float fidade2 = new Float(idade2).floatValue();
      float fidade3 = new Float(Entrada.leiaInt("Digite a idade da terceira pessoa")).floatValue();
      
      float resultado = (fidade1 + fidade2 + fidade3) / 3;
      
      System.out.println("Media das idades: " + resultado);
      
    }
}
