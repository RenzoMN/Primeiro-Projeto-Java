public class Main {
    public static void main(String[] args) {

        Object string;
        int anoDeLancamento = 2022;
        double notaDoFilme = 8.1;
        boolean incluidoNoPlano = true;
        double media = (9.8 + 6.3 + 8.0) / 3;         //Média calculada atráves de 3 notas aleátorias
        String sinopse;
        sinopse = """
                Top Gun: Maverick é a sequência de 2022 de Top Gun: Ases Indomáveis,
                ambientada mais de 30 anos após o original.  A trama acompanha o Capitão Pete "Maverick" Mitchell (Tom Cruise),
                um piloto de testes ousado e insubordinado que se recusa a avançar na carreira para permanecer voando.
                """;

        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println(media);
        System.out.println(sinopse);

        //Agora vou usar o .format para testar a usabilidade dessa função
        System.out.println(String.format("O filme lançou no ano de %d sua nota é %.2f", anoDeLancamento, notaDoFilme));

        //Testando identificador e classificando filme
        int classificacao;
        classificacao = (int) (media/2);
        System.out.println(classificacao);  //existe uma tabela de Casting e as linhas 26 e 27 poderiam estar na mesma linha
    }
}
