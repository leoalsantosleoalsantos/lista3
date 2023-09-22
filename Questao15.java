import java.util.Scanner;

public class Questao15 {


    public static void main(String[] args) {

        int dia;
        int mes;
        Scanner sc = new Scanner(System.in);


        System.out.println("informe o dia");
        dia = sc.nextInt();
        System.out.println("informe o mês");
        mes = sc.nextInt();


        if (mes >= 1 & mes <= 12) {
            switch (mes) {
                case 1:
                    if (dia >= 1 & dia <= 31) {
                        System.out.println("data valida " + dia + " de Janeiro");
                    } else {
                        System.out.println("dia do mês ivalido");
                    }
                    break;
                case 2:
                    if (dia >= 1 & dia <= 28) {
                        System.out.println("data valida " + dia + " de Fevereiro");
                    } else {
                        System.out.println("dia do mês inválido");
                    }
                    break;
                case 3:
                    if (dia >= 1 & dia <= 31) {
                        System.out.println("data valida " + dia + " de Março");
                    } else {
                        System.out.println("dia do mês ivalido");
                    }
                    break;
                case 4:
                    if (dia >= 1 & dia <= 30) {
                        System.out.println("data valida " + dia + " de Abril");
                    } else {
                        System.out.println("dia do mês ivalido");
                    }
                    break;
                case 5:
                    if (dia >= 1 & dia <= 31) {
                        System.out.println("data valida " + dia + " de Maio");
                    } else {
                        System.out.println("dia do mês ivalido");
                    }
                    break;
                case 6:
                    if (dia >= 1 & dia <= 30) {
                        System.out.println("data valida " + dia + " de Junho");
                    } else {
                        System.out.println("dia do mês ivalido");
                    }
                    break;
                case 7:
                    if (dia >= 1 & dia <= 31) {
                        System.out.println("data valida " + dia + " de Julho");
                    } else {
                        System.out.println("dia do mês ivalido");
                    }
                    break;
                case 8:
                    if (dia >= 1 & dia <= 31) {
                        System.out.println("data valida " + dia + " de Agosto");
                    } else {
                        System.out.println("dia do mês ivalido");
                    }
                    break;
                case 9:
                    if (dia >= 1 & dia <= 30) {
                        System.out.println("data valida " + dia + " de Setembro");
                    } else {
                        System.out.println("dia do mês ivalido");
                    }
                    break;
                case 10:
                    if (dia >= 1 & dia <= 31) {
                        System.out.println("data valida " + dia + " de Outubro");
                    } else {
                        System.out.println("dia do mês ivalido");
                    }
                    break;
                case 11:
                    if (dia >= 1 & dia <= 30) {
                        System.out.println("data valida " + dia + " de Novembro");
                    } else {
                        System.out.println("dia do mês ivalido");
                    }
                    break;
                case 12:
                    if (dia >= 1 & dia <= 31) {
                        System.out.println("data valida " + dia + " de Dezembro");
                    } else {
                        System.out.println("dia do mês ivalido");
                    }
                    break;
                default:
                    break;
            }
            }
                    else{
                System.out.println("mês invalido");
            }
            }
        }




