package listaTres;

import java.util.Scanner;

public class SESSENTACINCO {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o número de linhas da pirâmide: ");
        int numLinhas = scanner.nextInt();
        
        for (int linha = 1; linha <= numLinhas; linha++) {
            
            for (int espaco = 1; espaco <= numLinhas - linha; espaco++) {
                System.out.print(" ");
            }
            
            
            for (int asterisco = 1; asterisco <= linha; asterisco++) {
                System.out.print("*");
            }
            
            
            System.out.println();
        }
        
        
		
		for (int linha = 1; linha <= numLinhas; linha++) {
            
            for (int espaco = 1; espaco < linha; espaco++) {
                System.out.print(" ");
            }

            
            for (int asterisco = 1; asterisco <= 2 * linha - 1; asterisco++) {
                System.out.print("*");
            }

            
            System.out.println();
        }
		scanner.close();
	}

}
