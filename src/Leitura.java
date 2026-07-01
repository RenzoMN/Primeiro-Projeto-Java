import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in).useLocale(java.util.Locale.US);

        System.out.println("Digite o seu filme favorito: ");
        String filme = leitura.nextLine();
        System.out.println("Qual o ano de lançamento? ");
        int ano = leitura.nextInt();
        System.out.println("Qual a sua avaliação para esse filme?");
        double aval = leitura.nextDouble();

        System.out.println("O seu filme favorito é " + filme + ", lançou no ano " + ano + ", e sua avaliação é de " + aval);
    }
}
