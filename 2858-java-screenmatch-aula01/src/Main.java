public class Main {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao placeholderflix");
        System.out.println("Filme: Kill Bill");

        int anoDeLancamento = 2003;
        System.out.println("Ano de lançamento : " + anoDeLancamento); 
        //Concatenação = juntar uma string e uma variavel(neste caso o  anoDeLancamento)

        boolean incluidoNoPlano = true;
        double notaDeFilme = 8.2;

        double media = (8.2 + 9.0) /2;
        System.out.println("A média da nota do filme é : " + media);

        String sinopse;
        sinopse = 
        """
        A ex-assassina conhecida apenas como Noiva acorda de um coma de quatro anos decidida a se vingar de Bill, seu ex-amante e chefe, que tentou matá-la no dia do casamento. Ela está motivada a acertar as contas com cada uma das pessoas envolvidas com a perda da filha, da festa de casamento e dos quatro anos de sua vida. Na jornada, a Noiva é submetida a dores físicas agonizantes ao enfrentar a inescrupulosa gangue de Bill, o Esquadrão Assassino de Víboras Mortais.   
        """;
        System.out.println(sinopse);

    }
}