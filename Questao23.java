import java.util.Scanner;

public class Questao23 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o nome da primeira pessoa:");
        String nome1 = sc.nextLine();
        System.out.println("Informe o dia de nascimento da primeira pessoa:");
        int dia1 = sc.nextInt();
        System.out.println("Informe o mês de nascimento da primeira pessoa:");
        int mes1 = sc.nextInt();

        System.out.println("Informe o nome da segunda pessoa:");
        sc.nextLine(); // Limpar a quebra de linha pendente
        String nome2 = sc.nextLine();
        System.out.println("Informe o dia de nascimento da segunda pessoa:");
        int dia2 = sc.nextInt();
        System.out.println("Informe o mês de nascimento da segunda pessoa:");
        int mes2 = sc.nextInt();

        if (mes1 < mes2 || (mes1 == mes2 && dia1 < dia2)) {
            System.out.println(nome1 + " faz aniversário primeiro.");
        } else if (mes1 > mes2 || (mes1 == mes2 && dia1 > dia2)) {
            System.out.println(nome2 + " faz aniversário primeiro.");
        } else {
            System.out.println(nome1 + " e " + nome2 + " fazem aniversário no mesmo dia.");
        }

        sc.close();
    }
}
