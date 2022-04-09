import interfaces.Alianca;
import interfaces.CombateCorpoACorpo;

public class Humano extends Personagem implements Alianca, CombateCorpoACorpo {

    private String corDoCabelo;

    public String getCorDoCabelo() {
        return corDoCabelo;
    }

    public void setCorDoCabelo(String corDoCabelo) {
        this.corDoCabelo = corDoCabelo;
    }

    public Humano(double vida, String nome, String classe, String cordocabelo) {
        super(vida, nome, classe);
        super.setNome(nome);
        super.setVida(vida);
        super.setClasse("Paladino");
        this.setCorDoCabelo(cordocabelo);

    }

    public String motivar(){
        return "motivando";
    }

    @Override
    public void entrarEmRaid() {
        System.out.println(this.getNome()+" Entrando em raid ");
    }

    @Override
    public void entrarEmPvP() {
        System.out.println(this.getNome()+" Entrando em Arena PvP. ");
    }

    @Override
    public void mostraInfo() {
        System.out.println("nome: "+this.getNome());
        System.out.println("Classe: "+this.getClasse());
        System.out.println("Vida: "+this.getVida());
        System.out.println("Cor do cabelo: "+this.getCorDoCabelo());
        System.out.println();
    }

    @Override
    public void ForTheAlliance() {
        System.out.println("“Pela Aliança! ");
    }

    @Override
    public void InvadirHorda() {
        System.out.println("“Invadindo Orgrimmar. ");
    }

    @Override
    public void sacarArma() {
        System.out.println("Desembainhando espada!");
    }
}
