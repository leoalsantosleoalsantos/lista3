package listaTres;

import java.util.Random;
import java.util.Scanner;


public class QUARENTAUM {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSorteado = random.nextInt(100) + 1; 
        int tentativas = 0;
        boolean acertou = false;

        System.out.println("Bem-vindo ao jogo de adivinhação!");
        System.out.println("Tente adivinhar o número entre 1 e 100.");

        while (!acertou) {
            System.out.print("Digite o seu palpite: ");
            int palpite = scanner.nextInt();
            tentativas++;

            if (palpite < numeroSorteado) {
                System.out.println("O número e maior. Tente novamente.");
            } else if (palpite > numeroSorteado) {
                System.out.println("O número e menor. Tente novamente.");
            } else {
                acertou = true;
                System.out.println("Parabens! Você acertou o numero " + numeroSorteado + " em " + tentativas + " tentativas.");
            }
        }

        scanner.close();

	}

}
