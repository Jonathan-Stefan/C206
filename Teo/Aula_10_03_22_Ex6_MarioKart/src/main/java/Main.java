public class Main {

    public static void main(String[] args) {

        Piloto piloto1 = new Piloto();
        Piloto piloto2 = new Piloto();

        Kart kart1 = new Kart();
        Kart kart2 = new Kart();

        kart1.nome = "Kart1";
        kart2.nome = "Kart2";



        kart1.motor.cilindridas = "150";
        kart1.motor.velocidadeMaxima = 150;
        kart2.motor.cilindridas = "150";
        kart2.motor.velocidadeMaxima = 150;

        piloto1.nome = "Chapolin";
        piloto1.vilao = false;
        piloto2.nome = "Chaves";
        piloto2.vilao = false;


    }
}
