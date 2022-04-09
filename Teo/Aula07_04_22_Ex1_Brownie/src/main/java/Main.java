import br.inatel.cdg.brownie.Brownie;
import br.inatel.cdg.brownie.bownieCafe.BrownieCafe;
import br.inatel.cdg.brownie.brownieDoceDeLeite.BrownieDoceDeLeite;
import br.inatel.cdg.brownie.brownieNutella.BrownieNutella;

public class Main {

    public static void main(String[] args) {
        Brownie cafe = new BrownieCafe("cafe", 12, "Amargo");
        Brownie nutella = new BrownieNutella("Nutella", 15, "Doce");
        Brownie doceDeLeite = new BrownieDoceDeLeite("Doce de Leite", 16, "Caseiro");

        cafe.mostraInfo();
        nutella.mostraInfo();
        doceDeLeite.mostraInfo();

    }
}
