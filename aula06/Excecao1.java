class Excecao1 {
 public static void main(String[] args)
 {
  int i=0;
  try {
   i = i/i;
  } catch (Exception e) {
   //System.out.println("Erro: " +e);
    System.out.println("Erro na classe: " + e.getClass() + " mensagem: " + e.getMessage());
  }
  System.out.println("Fim.");
 }

}
