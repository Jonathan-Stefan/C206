public class Main {

    public static void main(String[] args) {
        Nave n1 = new Nave();
        Nave n2 = new Nave();
        Nave n3 = new Nave();
        Nave n4 = new Nave("Nave1");
        n3.setVida(250);

        n2.trocaVida(n3);
        System.out.println(n2.cont);
        n1.mostraInfo();
        n2.mostraInfo();
        System.out.println(n1.vida);
    }
}
