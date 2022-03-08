public class Principal {

    public static void main(String[] args) {

        Ashen ashen = new Ashen(); //Criando e instanciando o objeto Ashen
        Arma arma = new Arma(); // Criando e instanciando o objeto Arma

        // Atribuindo elementos à classe Arma
        arma.nome = "AK47";
        arma.poder = 36;
        arma.resistencia = 25;
        arma.descricao = "Sai 2 tiros por vez";

        // Atribuindo elementos a classe Ashen
        ashen.vida = 10;
        ashen.nome = "Mamonas";

        ashen.arma = arma;

        arma.mostrainfoArma();


        ashen.usarArma();
        ashen.tomarDano();

        arma.mostrainfoArma();




    }
}
