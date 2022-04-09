import interfaces.CombateDistancia;
import interfaces.Horda;

public class Troll extends Personagem implements Horda, CombateDistancia {

    private String tamanhoDaPresa;

    public Troll(double vida, String nome, String classe) {
        super(vida, nome, classe);
        super.setClasse("Xama");
    }

    @Override
    public void entrarEmRaid() {
        System.out.println(this.getNome()+" Entrando em raid ");
    }
    public String regenerar(){
        return "Regenereando";
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
    public void castarSpell() {
        System.out.println("Castanto totem. ");
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
