//import java.io.*;
//Formatar as casas decimais
import java.text.DecimalFormat;
public class Cadastro2{
  public static void main (String args[])throws java.io.IOException
  {
   String nome = "";
   String sexo = "M";
   //char sexo = 'M';
   String cpf = "999999";
   int idade = 0;
   Double altura = 0.0d;
   Double peso = 0.0d;
   Double imc = 0.0d;
   //Criando um objeto para utilizar na formatacao
   
  //import java.text.DecimalFormat;
   DecimalFormat df = new DecimalFormat();
   df.applyPattern("0.00");
   
   DecimalFormat dfMetro = new DecimalFormat();
   dfMetro.applyPattern("0.00 metros");
   
   DecimalFormat dfIdade = new DecimalFormat("# anos");
   DecimalFormat dfCentimetro = new DecimalFormat("# centimetros");
   
   nome = Entrada.leiaString("Informe o seu nome: ");
   sexo = Entrada.leiaString("Informe o seu sexo:[M/F] ");
   cpf = Entrada.leiaString("Informe o seu cpf: ");
   
   try
   {
     idade = Entrada.leiaInt("Informe a sua idade: ");
     if(idade < 0){
       System.out.println("A idade nao pode ser menor que zero !");
       idade = Entrada.leiaInt("Informe novamente a sua idade: ");
     }else{
       System.out.println("A idade digitada esta OK");
     }if(idade == 140){
       System.out.println("Fala serio, informe a idade correta!!");
        idade = Entrada.leiaInt("Informe novamente a sua idade (140): ");
     }
     
   }catch(Exception e){
     System.out.println("Erro na idade !");
     idade = Entrada.leiaInt("Informe novamente a sua idade (erro): ");
   }
  
   try
   {
     altura = Entrada.leiaDouble("Informe a sua altura: ");
   }catch(Exception e){
     System.out.println("Erro na altura !");
   }
   
   try
   {
   
     peso = Entrada.leiaDouble("Informe o peso: ");
   }catch(Exception e){
     System.out.println("Erro no peso !");
   }
   //Calculo do IMC

   if ((peso > 0.0) & (altura > 0.0)){
        imc = peso / (altura * altura);
    
   }

   //impressao dos dados
   System.out.println();
   System.out.println("\t\tRelatorio dos dados cadastrados");
   System.out.println("------------------------------------------------------");
  //Aplicando um padrao de formatacao
   
   System.out.println("Nome .............: " + nome);
   System.out.println("Sexo .............: " + sexo);
   System.out.println("CPF ..............: " + cpf);
   System.out.println("Idade ............: " + dfIdade.format(idade));
   System.out.println("Altura ...........: " + dfMetro.format(altura));
   System.out.println("IMC    ...........: " + df.format(imc));
   System.out.println("------------------------------------------------------");
   System.out.println("dados gerados com sucesso !");
   
  }
}