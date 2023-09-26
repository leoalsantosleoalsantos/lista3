package listaTres;
import java.util.Scanner;
public class VINTECINCO {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a hora: ");
        int hora = scanner.nextInt();
        
        System.out.println("Digite o minuto: ");
        int minuto = scanner.nextInt();
        
        System.out.println("Digite o segundo: ");
        int segundo = scanner.nextInt();
        
        int h = 0;
        int m = 0;
        int s = 0;
     
     if (hora > 0 && hora <= 24) {
         h = hora ;

	}else {
		System.out.println("hora invalida ");
	}
     
     if (minuto > 0 && minuto <= 60) {
          m = minuto ;

 	}else {
 		System.out.println("minuto invalido ");
 	}
    
     if (segundo > 0 && segundo <= 60) {
          s = segundo ;

 	}else {
 		System.out.println("segundo invalido ");
 	}
     System.out.println("hora digitada : "+ h +":"+m+":"+s);
     scanner.close();
}
}