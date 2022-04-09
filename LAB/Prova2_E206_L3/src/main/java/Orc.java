import interfaces.CombateCorpoACorpo;
import interfaces.Horda;

public class Orc extends Personagem implements Horda, CombateCorpoACorpo {

    private String corDaPele;

    public Orc(double vida, String nome, String classe) {
        super(vida, nome, classe);
        super.setClasse("Guerreiro");
    }

    public String enfurecer(){
        return "Enfurecendo";
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
        System.out.println();
    }

    @Override
    public void sacarArma() {
        System.out.println("Pegando machado de duas mãos! ");
    }

    @Override
    public void forTheHorder() {

        System.out.println("Pela Horda! ");
    }

    @Override
    public void invadirAlliance() {

        System.out.println("Invadindo Stormwind.");

    }
}
