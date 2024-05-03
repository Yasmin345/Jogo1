import java.util.Random;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws Exception {
    // declarando e atribuindo variaveis
    int lado_jogador = 0;
    int num_jogador = 0;
    int lado_maquina = 0;
    int num_maquina = 0;
    int soma = 0;
    int placar_jogador = 0;
    int placar_maquina = 0;
    int cont = 0;

    // inicializando métodos ?
    Scanner scan = new Scanner(System.in);
    Random random = new Random(); // ramdom é com parametro?

    // entradas lado
    System.out.println("BEM VINDO AO IMPAR OU PAR.");
    while (true) {
      System.out.print("Escolha um lado, digite 0 para PAR ou 1 para IMPAR: ");
      lado_jogador = scan.nextInt();

      // validação lado
      while (lado_jogador != 0 && lado_jogador != 1) {
        System.out.print("Algo deu errado! Por favor, digite apenas 0 ou 1 e tente novamente: ");
        lado_jogador = scan.nextInt();
      }
      // declaração de lado
      if (lado_jogador == 0) {
        lado_maquina = 1;
        System.out.println("JOGADOR PAR X MÁQUINA IMPAR.");
      } else if (lado_jogador == 1) {
        lado_maquina = 0;
        System.out.println("JOGADOR IMPAR X MÁQUINA PAR.");
      }
      // entrada de valor jogador 
      System.out.print("Escolha um número entre 0 e 5, Digite somente números: ");
      num_jogador = scan.nextInt();
      
      // validação de valor do jogador 
      while (num_jogador != 0 && num_jogador != 1 && num_jogador != 2 && num_jogador != 3 && num_jogador != 4
          && num_jogador != 5) {
        System.out.print("Algo deu errado! Digite somente números de 0 a 5, Por favor tente novamente: ");
        num_jogador = scan.nextInt();
       }
      // atribuição de numero da máquina ?
      num_maquina = random.nextInt(6);
      
      // apresentando numeros sorteados 
      System.out.println("Número sorteado pelo jogador: " + num_jogador);
      System.out.println("Número sorteado pela máquina: " + num_maquina);

      // apresentando a soma dos numeros
      soma = num_jogador + num_maquina;
      System.out.println("Soma dos números: " + soma);

      // calculando e apresentando  vencedor 
      if (soma % 2 == lado_jogador) {
        System.out.println("------------ Vencedor: JOGADOR ------------");
        placar_jogador++;
      }
      else  {
        System.out.println("------------ Vencedor: MÁQUINA ------------");
        placar_maquina++;
      }
      
      // apresentando placar 
      System.out.println("PONTUAÇÃO");
      System.out.println("Jogador: " + placar_jogador + " pontos.");
      System.out.println("Máquina: " + placar_maquina + " pontos.");
      
      // loop para continuação do jogo
      System.out.print("Deseja continuar jogando? Digite 1 para continuar ou 2 para finalizar. ");
      cont = scan.nextInt();
     // validação 
     while (cont != 1 && cont != 2) {
        System.out.print("Algo deu errado! Por favor, digite apenas 1 ou 2 e tente novamente: ");
         cont = scan.nextInt();
        }
     if (cont == 2) {
     break;
      }
      
    }
    System.out.println("Programa finalizado.");
   scan.close();

}
}

