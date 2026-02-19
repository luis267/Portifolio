import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite qual o seu filme favorito: ");
        String filme = leitura.nextLine();

        System.out.println("Qual o ano de lançamento do filme? ");
        int anoDeLancamento = leitura.nextInt();
        
        System.out.println("Escreva sua avaliação: ");
        Double avaliacao = leitura.nextDouble();
        
        
        System.out.println(filme);
        System.out.println(anoDeLancamento);
        System.out.println(avaliacao);

    }
}
