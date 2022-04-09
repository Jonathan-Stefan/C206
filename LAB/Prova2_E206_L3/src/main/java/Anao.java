import interfaces.Alianca;
import interfaces.CombateDistancia;

public class Anao extends Personagem implements Alianca, CombateDistancia {

    private String tamanhoDaBarba;

    public Anao(double vida, String nome, String classe, String tamanhodabarba) {
        super(vida, nome, classe);
        super.setClasse("Cacador");
        this.tamanhoDaBarba = tamanhodabarba;
    }


    public String endurecer(){
        return "Endurecendo";
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
        System.out.println("Tamanho da barba: "+this.getTamanhoDaBarba());
        System.out.println();
    }

    @Override
    public void ForTheAlliance() {
        System.out.println("“Pela Aliança! ");
    }

    @Override
    public void InvadirHorda() {
        System.out.println("“Invadindo Orgrimmar.");
    }

    @Override
    public void castarSpell() {
        System.out.println("Atirando. ");
    }

    public String getTamanhoDaBarba() {
        return tamanhoDaBarba;
    }

    public void setTamanhoDaBarba(String tamanhoDaBarba) {
        this.tamanhoDaBarba = tamanhoDaBarba;
    }
}
