package aula06.carro;
public class Aplicacao {
public static void main(String args[]) {
Carro corsa = new Carro();
corsa.modelo = "Corsa";//permite atribuir valor pois o atributo está publico na classe Carro
corsa.marca = "Chevrolet";
corsa.chassi = "ABC123";
corsa.fabricante = "Chevrolet";
corsa.ligar();
corsa.acelerar();
corsa.frear();
corsa.desligar();
System.out.println("Nome do carro: " + corsa.modelo);
    Carro gol = new Carro();
      gol.modelo = "Gol";
      gol.marca = "Volkswagen";
      gol.chassi = "DEF456";
      gol.fabricante = "Volkswagen";
      gol.ligar();
      gol.acelerar();
      gol.frear();
      gol.desligar();
      System.out.println("Nome do carro: " + gol.modelo);
      
   Carro obj2 = new Carro();
   obj2.setModelo("Palio ie 1.5");
   System.out.println("O modelo deste carro he: "+obj2.getModelo());
   System.out.println("O nome do carro 2 he: " +obj2.getNome());
     
      
    }
}
