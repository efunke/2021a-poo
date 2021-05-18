public class Ex11_01
{
    public static void main(String args[]) 
    {
      String nome, cidade;
      int idade;
      
      nome = Entrada.leiaString("Digite o nome: ","Eu");
      idade = Entrada.leiaInt("Digite a idade: ");
      cidade = Entrada.leiaString("Digite a cidade: ");
      
      System.out.println(nome+", tem "+idade+" anos e reside na cidade de "+cidade+".");
      
    }
}
