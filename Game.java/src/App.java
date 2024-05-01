import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      // declarando e atribuindo variaveis
      int lado_jogador = 0;
      int num_jogador = 0;
      int lado_maquina = 0;
      int num_maquina = 0;
      
        // atribuindo método de input 
      Scanner scan = new Scanner(System.in);

      // entradas lado
      System.out.println("BEM VINDO AO IMPAR OU PAR.");
      System.out.println("Escolha um lado, digite 1 para IMPAR ou 2 para PAR.");
      lado_jogador =scan.nextInt();

      // validação lado 
      while (lado_jogador != 1 && lado_jogador !=2) {
        System.out.println("algo deu errado, por favor digite somente 1 ou 2, tente novamente!");
        lado_jogador =scan.nextInt();
    }
       if (lado_jogador == 1 ){
        lado_maquina = 2;
        System.out.println("JOGADOR IMPAR X MAQUINA PAR");
    }
       else if (lado_jogador == 2){
        lado_maquina = 1;
        System.out.println("JOGADOR PAR X MAQUINA IMPAR");
    }
      
     
          

      
System.out.println(lado_jogador);
System.out.println(lado_maquina);

    
       

    }     
    
}
