public class Main {

    public static void main(String[] args) {

        Piloto piloto = new Piloto();
        Kart kart = new Kart();

        kart.piloto = piloto;

        kart.motor.cilindridas = "150";
        kart.motor.velocidadeMaxima = 150;

        piloto.nome = "Jonathan";
        piloto.vilao = false;

        kart.nome = "Audi";
        kart.motor.mostrarInfo();


    }
}
