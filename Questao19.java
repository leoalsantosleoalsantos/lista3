import java.util.Scanner;

public class Questao19 {

    public static void main(String[] args) {

        int x;
        int y;

        Scanner sc = new Scanner(System.in);

        System.out.println("insira o primeiro numero");
        x = sc.nextInt();
        System.out.println("insira o segundo numero");
        y = sc.nextInt();

        // se X>Y mostre X maior que Y
        if (x > y) {
            System.out.println("o numero " + x + " é maior que o numero " + y);

        } else if (x < y) {
            System.out.println("o numero " + y + " é maior que o numero " + x);
        } else {
            System.out.println("os numeros sao iguais");
        }
    }
}
