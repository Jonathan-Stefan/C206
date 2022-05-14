public class Principal {

    public static void main(String[] args) {
        Conta c1 = new Conta(158, 100);
        Cliente cl1 = new Cliente("jose", "136.458.852-12");
        Cliente cl2 = new Cliente("Adolfo", "165.785.485-12");
        Cliente cl3 = null;

        c1.adiconaCliente(cl1);
        c1.adiconaCliente(cl2);
        c1.adiconaCliente(cl3);

        c1.mostraInfo();



        System.out.println("Fim do metodo Main");
    }
}
