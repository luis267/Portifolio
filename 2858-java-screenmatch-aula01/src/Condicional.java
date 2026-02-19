public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2003;
        boolean incluidoNoPlano = true;
        double notaDeFilme = 8.2;
        String tipoDoPlano = "premium";

        if (anoDeLancamento > 2025) {
            System.out.println("O filme é um lançamento recente. ");
        } else {
            System.out.println("O filme é um classico. ");

        }

        if (incluidoNoPlano && tipoDoPlano.equals("premium")) {
            System.out.println("Disponivel para assistir. ");
        } else {
            System.out.println("Filme não disponivel para o seu plano. ");
        }

        /*
         * ALTERNATIVA PARA USO DE IF-ELSE: SWITCH-CASE :
         * 
         * switch (expressão) {
         * case valor1:
         * // código a ser executado se a expressão for igual a valor1
         * break;
         * case valor2:
         * // código a ser executado se a expressão for igual a valor2
         * break;
         * case valor3:
         * // código a ser executado se a expressão for igual a valor3
         * break;
         * ...
         * default:
         * // código a ser executado se a expressão não for igual a nenhum valor
         * break;
         * }
         * 
         */

        int dia = 3;
        String nomeDia;

        switch (dia) {
            case 1:
                nomeDia = "domingo";
                break;
            case 2:
                nomeDia = "segunda-feira";
                break;
            case 3:
                nomeDia = "terça-feira";
                break;
            case 4:
                nomeDia = "quarta-feira";
                break;
            case 5:
                nomeDia = "quinta-feira";
                break;
            case 6:
                nomeDia = "sexta-feira";
                break;
            case 7:
                nomeDia = "sábado";
                break;
            default:
                nomeDia = "Dia inválido";
                break;
        }
        

        System.out.println("O dia " + dia + " é " + nomeDia);
    }
}
