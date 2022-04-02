package br.inatel.cdg.banda;

import br.inatel.cdg.empresario.Empresario;
import br.inatel.cdg.membro.Membro;
import br.inatel.cdg.musica.Musica;

public class Banda {

    private String nome;
    private String genero;
    private Empresario empresario;

    Membro [] membros = new Membro[4];
    Musica [] musicas = new Musica[4];

    public void mostraInfo(){
        System.out.println("Nome da banda: "+nome);
        System.out.println("Genero: "+genero);
        System.out.println("Membros: ");
        for (Membro membro : membros){
            if (membro != null){
                System.out.println("nome: "+membro.getNome()+" função: "+membro.getFuncao());
            }
        }
        System.out.println("Musicas que a banda possui: ");
        for (Musica musica : musicas){
            if(musica != null){
                System.out.println("Nome da musica: "+ musica.getNome()+" duração: "+musica.getDuracao());
            }
        }

    }

    public void addMusicaNova (Musica musica){
        boolean flag = true;
        for (int i = 0; i< musicas.length; i++){
            if (musicas[i] == null && flag){
                musicas[i] = musica;
                flag = false;
            }
        }

    }

    public void addMembroNovo (Membro membro){
        boolean flag = true;
        for (int i = 0; i < membros.length; i++){
            if (membros[i] == null && flag){
                membros[i] = membro;
                flag = false;
            }
        }

    }

    public Empresario getEmpresario() {
        return empresario;
    }

    public void setEmpresario(Empresario empresario) {
        this.empresario = empresario;
    }

   public Banda (String nome, String genero){
        this.nome = nome;
        this.genero = genero;
    }
}
