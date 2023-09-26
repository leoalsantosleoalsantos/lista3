package listaTres;
import java.util.Scanner;
class UM {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o ano do seu nascimento: ");
        int ano = scanner.nextInt();
		
        int idade = 2023 - ano;
        System.out.println(idade);
        scanner.close();
	}
	
}
