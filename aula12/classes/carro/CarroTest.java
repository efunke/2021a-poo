public class CarroTest
{
 public static void main(String args[])
 { 
 //inicializando o objeto de carro
 Carro auto = new Carro();
 System.out.println("Iniciando...");
 auto.setMarca("Fiat");
 System.out.println("A marca do carro e: " + auto.marca);
 auto.setMarca("GM");
 System.out.println("A marca do carro e: "
                       + auto.getMarca());
 Carro c1 = new Carro(2010);
 System.out.println("Meu carro he do ano:" + c1.ano);
  System.out.println("Meu carro he do ano:" + c1.getAno());
 }
}
