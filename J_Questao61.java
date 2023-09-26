package listaTres;
import java.util.Scanner;
public class SESSENTAUM {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o número de linhas da pirâmide: ");
        int numLinhas = scanner.nextInt();
        
        for (int linha = 1; linha <= numLinhas; linha++) {
            // Imprime espaços em branco à esquerda para alinhar os asteriscos
            for (int espaco = 1; espaco <= numLinhas - linha; espaco++) {
                System.out.print(" ");
            }
            
            // Imprime asteriscos
            for (int asterisco = 1; asterisco <= linha; asterisco++) {
                System.out.print("*");
            }
            
            // Mova para a próxima linha
            System.out.println();
        }
        
        scanner.close();
	}

}
