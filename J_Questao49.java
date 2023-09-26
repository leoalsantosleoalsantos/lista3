package listaTres;

public class QUARENTANOVE {

	public static void main(String[] args) {
		int n = 50; // O número de termos da sequência de Fibonacci a serem exibidos
        long[] fibonacci = new long[n];

        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        System.out.println("Os primeiros 50 nueros da sequencia de Fibonacci sao:");

        for (int i = 0; i < n; i++) {
            System.out.println(fibonacci[i]);

	}

}
}