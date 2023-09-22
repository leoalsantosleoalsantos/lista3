public class Questao11 {

    public static void main(String[] args) {

        idade(15);
    }


    static void idade(int idade){
        System.out.println(idade);

             if (idade < 16) {
            System.out.println("Não pode votar.");
        }
             else if (idade >= 16 & idade < 18 | idade >= 65) {
            System.out.println("Voto facultativo.");
        }
             else {
            System.out.println("Voto obrigatório.");
        }




    }



}
