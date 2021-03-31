public class TrocaValores {
  public TrocaValores() { }
 
  public static void main(String[] args) { 
    int x = 10;
    int y = 20;
    int temp = x;
    System.out.println("Valor original \nX = " + x + " Y = " + y);
    x = y;
    y = temp;
    System.out.println("Valor apos a troca\nX = " + x + " Y = " + y);
  }
}
