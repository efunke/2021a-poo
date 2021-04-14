class Exa0801 { 
  String a = "Univates"; 
  static String a1 = "Lajeado" ; 
  public static void main (String [] args){ 
    new Exa0801().a = "34567"; 
//Como a JVM saberia qual 'a' ela deve acessar? // Erro de compilação 
    System.out.println("O valor de a: "+ new Exa0801().a);
  } 
}