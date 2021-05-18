import java.io.*;
//Formatar as casas decimais
import java.text.DecimalFormat;
public class Cadastro{
  public static void main (String args[])throws java.io.IOException
  {
   String nome = "";
   String sexo = "M";
   //char sexo = 'M';
   String cpf = "999999";
   int idade = 0;
   float altura = 0.0f;
   float peso = 0.0f;
   float imc = 0.0f;
   //Criando um objeto para utilizar na formatacao
   
  //import java.text.DecimalFormat;
   DecimalFormat df = new DecimalFormat();
   df.applyPattern("0.00");
   
   DecimalFormat dfMetro = new DecimalFormat();
   dfMetro.applyPattern("0.00 metros");
   
   //df.format(variavel);
   BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
   //Leitura dos dados 

   System.out.print("Informe o seu nome: ");
   nome = teclado.readLine();
   System.out.print("Informe o seu sexo:[M/F] ");
   sexo = teclado.readLine();
   System.out.print("Informe o seu cpf: ");
   cpf = teclado.readLine();
   
   try{
     
     System.out.print("Informe a sua idade: ");
     idade = Integer.parseInt(teclado.readLine());
          
     if(idade < 0){
       System.out.println("A idade nao pode ser menor que zero !");
       System.out.print("Informe novamente a sua idade: ");
       idade = Integer.parseInt(teclado.readLine());
     }else{
       System.out.println("A idade digitada esta OK");
     }
     
   }catch(Exception e){
     System.out.println("Erro na idade !");
   }
  
   try{
     System.out.print("Informe a sua altura: ");
     altura = Float.parseFloat(teclado.readLine());
   }catch(Exception e){
     System.out.println("Erro na altura !");
   }
   try{
     System.out.print("Informe o peso: ");
     peso = Float.parseFloat(teclado.readLine());
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
   System.out.println("Idade ............: " + idade + " anos");
   System.out.println("Altura ...........: " + dfMetro.format(altura));
   System.out.println("IMC    ...........: " + df.format(imc));
   System.out.println("------------------------------------------------------");
   System.out.println("dados gerados com sucesso !");
   
  }
}