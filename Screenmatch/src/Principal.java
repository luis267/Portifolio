public class Principal {

    public static void main(String[] args) {
        Filme favorito = new Filme();

        favorito.nome = "A identidade Bourne";
        favorito.anoDeLancamento = 2002;
        favorito.duracaoEmMinutos = 119;
        favorito.incluidoNoPlano = true;

        favorito.exibeFichaTecnica();
        favorito.avalia(9);
        favorito.avalia(8);
        favorito.avalia(9);

        System.out.println("Média de avaliações do filme: " +favorito.pegaMedia());
    }

}