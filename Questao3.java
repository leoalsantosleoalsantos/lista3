public class Questao3 {

    public static void main(String[] args) {

        turma(11, 15);

    }

    static void turma(int Homens, int Mulheres ) {

        System.out.println(Homens+Mulheres + " é o total de alunos da turma");
        int total = (Homens + Mulheres );

        double percentualHomens = ((double)Homens / total) * 100.0;
        System.out.println("Percentual de homens: " + String.format("%.2f",percentualHomens));
        double percentualMulheres = ((double)Mulheres / total) * 100.0;
        System.out.println("Percentual de mulheres: " + String.format("%.2f",percentualMulheres));




    }




}
