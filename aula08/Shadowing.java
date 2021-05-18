class Shadowing { 
  static int a;// = 4;
 
  public static final String CNPJ = "45.567.234/0001-34";

  public static void main (String[] args){ 
    //String a = "abc"; 
   
    System.out.println(CNPJ); // "abc" 
    
    
  } 
  
}