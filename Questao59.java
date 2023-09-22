public class Questao59 {

    public static void main(String[] args) {

        // Loop externo para as tabuadas de 1 a 10
        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabuada do " + i + ":");

            // Loop interno para multiplicar de 1 a 10
            for (int j = 1; j <= 10; j++) {
                int resultado = i * j;
                System.out.println(i + " x " + j + " = " + resultado);
            }
            
        }
    }
}
