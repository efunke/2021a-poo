public class Conta_Instancias { 
  private int tamanho; 
  private static int conta = 0; //IMPRIME A CONTAGEM DE 4 VALORES 
  //private int conta = 0; //IMPRIME A CONTAGEM DE 1 VALOR 
  
  /** Realiza a impressao das contas */
  public Conta_Instancias(){ 
    conta++; 
    System.out.println("Valor = "+conta); 
  } 
 public static void teste(String texto)
 {
    System.out.println("Recebi: " + texto);  
 }
 
 private static void teste(String texto, int num)
 {
    System.out.println("Recebi: " + texto + " o numero foi: "+ num);  
 }
 
 protected static void teste(String texto, int num, String token)
 {
    System.out.println("Recebi: " + texto + " o numero foi: "+ num + "\n{ Assinatura : "+ token + "}");  
 }

  public static void main(String[] args) { 
     /** Criar as contas (objetos) 1 - 4*/
    String nome = "Univates";
    Conta_Instancias c1 = new Conta_Instancias(); 
    Conta_Instancias c2 = new Conta_Instancias(); 
    Conta_Instancias c3 = new Conta_Instancias();
    Conta_Instancias c4 = new Conta_Instancias();    
    //Definir o novo formato do objeto
    System.out.printf("O nome da empresa = %s\n",nome);
    
    //Conta_Instancias ( new Conta_Instancias()); 
       teste("Linha1");
    c1.teste("Linha2");
    c2.teste("Linha3");
    c1.teste("Linha4");
    teste("Univates", 2021);
    teste("Peso", 50);
    teste("Peso", 50, "PUYTh765423huyrdes");
    
  } 
}