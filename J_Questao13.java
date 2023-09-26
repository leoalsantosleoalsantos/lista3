package listaTres;
import java.util.Scanner;
public class TREZE {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o valor da primeira nota: ");
        float nota1 = scanner.nextFloat();
    
        System.out.println("Digite o valor da segunda nota: ");
        float nota2 = scanner.nextFloat();
        
        System.out.println("Digite o valor da terceira nota: ");
        float nota3 = scanner.nextFloat();
        
        
        float media = (nota1 + nota2 + nota3)/ 3 ;
        	if (media >= 7.0f ){
        		System.out.println("Aluno aprovado!");
        	}
        	if (media >= 5.0f && media < 7.0f ) {
        		System.out.println("Aluno em recuperação");
        		System.out.println("digite a nota da recuperação ");
        		float notaRec = scanner.nextFloat();
        			if (notaRec >= 5) {
        				System.out.println("Aluno aprovado!");
        			}else {
        				System.out.println("Aluno reprovado!");
        			}
        	}if(media < 5) {
        		System.out.println("Aluno reprovado!");
        	}
	}

}
