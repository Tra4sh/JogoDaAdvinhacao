import java.util.Random;
import java.util.Scanner;

public class JogoDaAdvinhacao {
    public static void main(String[] args) {
        System.out.println("*******************");
        System.out.println("JOGO DA ADVINHAÇÃO");
        System.out.println("*******************");
        Jogar();
    }
    public static int Jogar() {
            Scanner leitor = new Scanner(System.in);
            Random gerador = new Random();

            int sorteado = gerador.nextInt(100) + 1;
            int tentativa = 0;
            int contador = 0;

            while (contador < 10) {
                System.out.println("Escolha um numero de 1 a 100");
                tentativa = leitor.nextInt();

                contador = contador + 1;

                if (tentativa == sorteado) {
                    System.out.println("PARABENS VOCÊ ACERTOU");
                    System.out.printf("Numero sorteado foi %s \n", sorteado);
                contador = contador + 10;

                } else if (tentativa != sorteado) {
                    System.out.println("VOCE ERROU DENOVO");
                }
            }
            return tentativa;
    }
}
