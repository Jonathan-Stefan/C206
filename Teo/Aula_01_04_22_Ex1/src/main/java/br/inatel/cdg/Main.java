package br.inatel.cdg;

import br.inatel.cdg.banda.Banda;
import br.inatel.cdg.empresario.Empresario;
import br.inatel.cdg.membro.Membro;
import br.inatel.cdg.musica.Musica;

public class Main {

    public static void main(String[] args) {

        Empresario empresario = new Empresario("Seu Madruga", 123456789);

        Banda banda = new Banda("Link Park", "Rock");

        banda.setEmpresario(empresario);

        //Criando
        Membro membro = new Membro("chaves", "guitarrista");
        Membro membro1 = new Membro("Kiko", "Baterista");

        //Criando as musicas
        Musica musica = new Musica("November Rain", 10.25);
        Musica musica1 = new Musica("Faroeste Caboclo", 9.48);



        banda.addMembroNovo(membro);
        banda.addMembroNovo(membro1);
        banda.addMusicaNova(musica);
        banda.addMusicaNova(musica1);

        banda.mostraInfo();
    }
}
