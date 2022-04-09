public class Main {

    public static void main(String[] args) {

        Personagem humano = new Humano(100.2, "Chaves", "Paladino");
        Personagem anao = new Anao(150.2, "Chiquinha", "cacador");
        Personagem orc = new Orc(98.2, "Seu Barriga", "Guerreiro");
        Personagem troll = new Troll(96.5, "Seu Madruga", "Xama");

        Personagem [] personagens = new Personagem[4];

        personagens[0] = humano;
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

    }
}
