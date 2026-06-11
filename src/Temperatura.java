public class Temperatura {
    public static void main(String[] args) {
        double temperaturaEmCelsius = 50;
        double temperaturaEmFahrenheit = (temperaturaEmCelsius * 1.8) + 32;
        String mensagem = String.format("A temperatura em %f°C equivale a %f°F", temperaturaEmCelsius, temperaturaEmFahrenheit);
        System.out.println(mensagem);

        int temperaturaEmFahrenheitInteira = (int) temperaturaEmFahrenheit;
        System.out.println("A temperatura em Fahrenheit inteira é: " + temperaturaEmFahrenheitInteira);
    }
}
