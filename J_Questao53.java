package listaTres;
import java.util.Scanner;
public class CINQUENTATRES {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("digite um numero: " );
		int num = scanner.nextInt();
		
		for (int i = 0; i <=10; i++ ) {
			int result = num * i ;
			System.out.println(num +" x "+ i +" = "+ result );
		}
		
		scanner.close();
	}

}
