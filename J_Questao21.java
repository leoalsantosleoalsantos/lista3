package listaTres;
import java.util.Scanner;
public class VINTEUM {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o 1 para Diretor ,2 para gerencia e 3 para operacional: ");
        int numero = scanner.nextInt();
        
        System.out.println("Digite o seu salario: ");
        float salario = scanner.nextFloat();
        
        float emprestimo = 0;
        
        switch (numero){
        case 1:
        	emprestimo = salario * 0.3f;
        	System.out.println("o valor do seu emprestimo e: "+ emprestimo);
        	break;
        
        case 2:
        	emprestimo = salario * 0.25f;
        	System.out.println("o valor do seu emprestimo e: "+ emprestimo);
        	break;
        
        case 3:
        	emprestimo = salario * 0.2f;
        	System.out.println("o valor do seu emprestimo e: "+ emprestimo);
        	break;
        
        default:
        	
        	System.out.println("o numero nao foi 1 2 ou 3");
        	break;
        }
        scanner.close();
	}

}
