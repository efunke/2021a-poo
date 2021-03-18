public class Exa401{
  public static void main(String[] args){
    System.out.println("Tecle \"Enter\" para terminar.");
    try{
        System.in.read();
    } catch (Exception erro) {
       erro.printStackTrace();
    }
  }
}
