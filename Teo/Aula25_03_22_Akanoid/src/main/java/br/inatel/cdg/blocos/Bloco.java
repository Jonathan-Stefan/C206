package br.inatel.cdg.blocos;

public class Bloco {

    private static int contBlocos = 0;

    public Bloco(){
        contBlocos++;
    }

    public static int getContBlocos() {
        return contBlocos;
    }

    public static void setContBlocos(int contBlocos) {
        Bloco.contBlocos = contBlocos;
    }
}
