public  class Bola{//primerio exemplo de java
 //atributos
 int raio;
 boolean oca;
 String material;
 String cor;
 String msg;

 public Bola()//Construtor de objetos - Criando uma Bola...
 {
  raio = 0;
  oca = false; 
  material = null; 
  cor = null;
}


 public Bola(int praio,  boolean poca)
 { 
   if (praio>0 || praio <10)
   {
   raio = praio; 
   oca = poca;
   }else{
     System.out.println("Erro de valor para o raio");
 }
 }
public void setRaio(int raio)
 {
  if (raio >10 && raio > 0)
  {
     this.raio = raio;
  }else{
     this.raio = 1;
     msg = "Erro: Valor do raio informado incorretamente !"; 
     escreveLog("setRaio",raio,msg);
     //System.out.println("Erro de valor para o raio, o mesmo foi alterado para ");
 }
}
public void escreveLog(String metodo, int raio, String msg)
{
  System.out.println(" Estou no ["+ metodo + "] Valor do raio = [" 
                       + raio + "] - " + msg+"\n");
  
}

 public void setcor(String cor)
 {
  this.cor = cor;
 }
public int getraio(){
  return raio;
 }

 public String getcor(){
  return cor;
 }


}











