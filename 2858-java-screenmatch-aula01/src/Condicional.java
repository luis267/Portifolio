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
            
    }
}
