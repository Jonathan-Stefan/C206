public class Main {
    public static void main(String[] args) { //calcula a quantidade de zumbis mortos nas 3 ultima rodade e fz uma media
        float primeiraRodada = 130;
        float segundaRodada = 240;
        float terceiraRodada = 320;
        float qtdMortos = primeiraRodada + segundaRodada + terceiraRodada;
        float media = qtdMortos/3;

        System.out.println("A quantidade total de mortos foram: " + qtdMortos);
        System.out.println("A media foi de: "+ media);
    }
}
