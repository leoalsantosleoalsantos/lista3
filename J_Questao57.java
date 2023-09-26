package listaTres;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CINQUENTASETE {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        
        System.out.print("Digite a data inicial (dd/MM/yyyy): ");
        String dataInicialStr = scanner.nextLine();
        LocalDate dataInicial = LocalDate.parse(dataInicialStr, formatter);

        
        System.out.print("Digite a data final (dd/MM/yyyy): ");
        String dataFinalStr = scanner.nextLine();
        LocalDate dataFinal = LocalDate.parse(dataFinalStr, formatter);

        
        if (dataFinal.isBefore(dataInicial)) {
            System.out.println("A data final deve ser maior ou igual à data inicial.");
        } else {
            System.out.println("Datas entre " + dataInicial.format(formatter) + " e " + dataFinal.format(formatter) + ":");

            
            LocalDate dataAtual = dataInicial;
            while (!dataAtual.isAfter(dataFinal)) {
                System.out.println(dataAtual.format(formatter));
                dataAtual = dataAtual.plusDays(1); 
            }
        }

        scanner.close();
    }

	}

