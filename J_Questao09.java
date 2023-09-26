package listaTres;
import java.util.Scanner;
public class NOVE {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a sua idade: ");
        int idade = scanner.nextInt();
        	if (idade >= 18 ) {
        		System.out.print("voce e maior de idade");
	}else {
		System.out.print("voce e menor de idade");
	}
        scanner.close();
}
}