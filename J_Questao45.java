package listaTres;
import java.util.Scanner;
public class QUARENTACINCO {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		int numMaior = 0;
		for (int i = 0; i <=100; i++ ) {
			System.out.println("DIGITE UM NUMERO: ");
			num = scanner.nextInt();
			if (num > numMaior) {
				numMaior = num;
			}
	}
System.out.print(numMaior);
}
}