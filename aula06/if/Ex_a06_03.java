public class Ex_a06_03{
  public static void main(String[] args){
    int valor = 8;
    int resultado = 0;
    int num = 2;
    
    //valor ++;
    //--valor;
     
    if (valor > num){
     
     System.out.println("O valor da variavel original: " + valor);
     System.out.println("O valor da resultado original: " + resultado);
     //resultado = valor++;
     //resultado = ++valor;     
     //resultado = valor--;
     //resultado = --valor;
     
     resultado -= valor;
     //valor ++   -> 8
     //++ valor   -> 9
    }
    
    System.out.println("O valor da variavel alterada: " + valor);
    System.out.println("O valor da resultado alterada: " + resultado);
    
  }
}
