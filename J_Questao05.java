package listaTres;
import java.util.Scanner;
public class CINCO {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			
		System.out.println("Digite o valor da divida: ");
        float divida = scanner.nextFloat();
		
        System.out.println("Digite a quantidade de meses foi dividido: ");
        int meses = scanner.nextInt();
        
        System.out.print("Digite o valor do juros: ");
        float juros = scanner.nextFloat();
        
        float jurosP = juros/100;
        float valorJuros =  divida * jurosP;
        float totalJuros = valorJuros * meses;
        float totalPagar = totalJuros + divida;
        
        //System.out.println(divida);
        //System.out.println(meses);
        //System.out.println(juros);
        
        
        //System.out.println(jurosP);
        //System.out.println(valorJuros);
        //System.out.println(totalJuros);
        //System.out.println(totalPagar);
        
        System.out.println("O valor total a pagar e R$: " + totalPagar);
        
		
		scanner.close();
	}

}
