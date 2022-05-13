import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Arquivo {

    public void escrever (Pedido pedido){
        OutputStream os = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;

        String linhaEscrever;

        try {
            os = new FileOutputStream("arquivoDePedidos.txt", true);
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);

            bw.write("Primeiro pedido\n");
            bw.newLine();

        }catch (Exception e){
            System.out.println(e);
        }finally {
            try {
                bw.close();
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
