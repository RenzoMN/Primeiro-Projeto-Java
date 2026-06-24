public class Condicional {
    static void main(String[] args) {
        int anoDeLancamento = 2022;
        double notaDoFilme = 8.1;
        boolean incluidoNoPlano = true;
        String tipoPLano = "plus";

        if (anoDeLancamento >= 2022){
            System.out.println("Lançamento que os clientes estão curtindo");
        } else {
            System.out.println("Filme retrô que vale a pena assistir!");
        }

        if (incluidoNoPlano && tipoPLano.equals("plus")){
            System.out.println("Filme liberado");
        } else {
            System.out.println("Filme não liberado");
        }
    }
}
