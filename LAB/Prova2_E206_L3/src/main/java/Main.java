public class Main {

    public static void main(String[] args) {

        Personagem humano = new Humano(100.2, "Chaves", "", "castanho");
        Personagem anao = new Anao(150.2, "Chiquinha", "", "Longa");
        Personagem orc = new Orc(98.2, "Seu Barriga", "", "Verde");
        Personagem troll = new Troll(96.5, "Seu Madruga", "", "Grande");

        Personagem [] personagens = new Personagem[4];


        personagens [0] = humano;
        personagens [1] = anao;
        personagens [2] = orc;
        personagens [3] = troll;

        for(Personagem personagem : personagens){
            if(personagem instanceof Humano){
                Humano h = (Humano) personagem;
                h.mostraInfo();

            }else if (personagem instanceof Anao){
                Anao a = (Anao) personagem;
                a.mostraInfo();
            }else if (personagem instanceof Orc){
                Orc o = (Orc) personagem;
                o.mostraInfo();
            }else {
                Troll t = (Troll) personagem;
                t.mostraInfo();
            }
        }
        System.out.println("Quantidade de personagens: "+Personagem.getPersonagensCriados());

    }
}
