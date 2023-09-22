import java.util.Scanner;

public class Questao27 {

    public static void main(String[] args) {

        int x;
        int y;
        int z;

        Scanner sc = new Scanner(System.in);

        System.out.println("digite o primeiro numero");
        x = sc.nextInt();
        System.out.println("digite o segundo numero");
        y = sc.nextInt();
        System.out.println("digite o terceiro numero");
        z = sc.nextInt();

        // x > y >= z  mostre x maior
        if (x > y && x > z){
            System.out.println("o numero "+ x +" é maior que os numeros "+ y + " e "+ z);
        }
        // y > x >= z mostre y maior
        else if (y > x && y > z) {
            System.out.println("o numero "+ y +" é maior que os numeros "+ x + " e "+ z);
        }
        // z > x >= y mostre z maior
         else if (z > x && z > y){
            System.out.println("o numero "+ z +" é maior que os numeros "+ x + " e "+ y);
        }
        // x = y = z mostre x y z iguais
        else{
            System.out.println("todos os numeros sao iguais");
        }







    }
}
