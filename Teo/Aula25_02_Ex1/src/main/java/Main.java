public class Main {
    public static void main(String[] args) {
        float primeiraRodada = 130;
        float segundaRodada = 240;
        float terceiraRodada = 320;
        float qtdMortos = primeiraRodada + segundaRodada + terceiraRodada;
        float media = qtdMortos/3;

        System.out.println("A quantidade total de mortos foram: " + qtdMortos);
        System.out.println("A media foi de: "+ media);
    }
}
