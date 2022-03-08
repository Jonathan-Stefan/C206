public class Main {

    public static void main(String[] args) {
        //Um array de tipos primitivos quarda valores, um array de objetos guarda referencias

        Conta[] contas = new Conta[3];
        Conta c1 = new Conta(); // Cria uma conta chamada c1
        contas [0] = c1; // Aloca essa conta na posição 0 do array
        c1.saldo = 200;
        c1.nome = "Jonathan";

        //Cria elementos em uma conta na posição 2 do array
        contas[2] = new Conta();
        contas[2].saldo = 20000;
        contas[2].nome = "Jonatas";

        // Printa os elementos presente em cada conta, desde que não seja null
        for (int i = 0; i< contas.length; i++){ // Esse for acessa as posição de vetores
            if (contas[i] != null)
            {
                contas[i].mostraInfo();
            }
        }

        for(Conta item : contas){ // Esse for varre os valores
            if (item != null)
                item.mostraInfo();
        }

    }
}
