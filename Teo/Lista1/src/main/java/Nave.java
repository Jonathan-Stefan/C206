public class Nave {

    public static int cont = 0;
    public int vida;
    private int numNaves;
    private String nome;
    public Nave(){
         this.vida = 100;
         cont++;
         }
    public Nave(String nome){
         this.nome = nome;
         this.numNaves++;
         }
    public void mostraInfo(){
         System.out.println(vida);
         }
    public void trocaVida(Nave nave) {
     this.vida = nave.getVida();
     nave.setVida(this.vida);
 }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
}
