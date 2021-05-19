class Argumentos{
  public static void main(String [] args){//vetor dinamico
    String p1 = args[0];// ip
    String p2 = args[1];// porta
    String p3 = args[2];// usuario
    String p4 = args[3];// senha
    String p5 = args[4];// tipo banco
    String p6 = args[5];
    String concat = "";
    System.out.println("Recebi [" + args.length + "] parametros.");
    //vetor -> lista [indice0, indice1..., indicex]
    
    for (int i =0; i<args.length; i++){
       //System.out.println("Conteudo:["+(i+1)+"] " +args[i]);
       if ((i == 0)||(i == 3)){
         //concat = args[i] + " ";
         //if (i == 0) { temp1 = args[i];}
         //System.out.println("concat" + concat);
         concat = concat + args[i] + " ";
       }else{
         concat = concat + args[i];
       }
       /* Teste de mesa
       //0 e 1 => espaço OK
       //4 e 5 => espaço
       //ssh root@192.168.1.10 -p34
      //    0 ->   1  2  3  ->   4 5 
       0 ssh
       1 root
       2 @
       3 192....
       4 -p
       5 34
       concat (ssh root@192.... -p34)
       */
       if(i == (args.length -1)){
          System.out.println("Concat: " + concat);
       }
    }
    System.out.println("\nComando: " +p1 + " "+ p2+p3+p4+" "+p5+p6);

  }
 }