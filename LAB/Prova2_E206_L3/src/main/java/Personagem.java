public abstract class Personagem {

    private double vida;
    private String nome;
    private String classe;
    private static int personagensCriados = 0;

    public Personagem (double vida, String nome, String classe){
        this.classe = classe;
        this.vida = vida;
        this.nome = nome;
        personagensCriados++;
    }

    public abstract void entrarEmRaid();
    public abstract void entrarEmPvP();
    public abstract void mostraInfo();

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public static int getPersonagensCriados() {
        return personagensCriados;
    }
}
