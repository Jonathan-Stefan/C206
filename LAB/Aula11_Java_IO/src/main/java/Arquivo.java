import java.io.*;
import java.util.ArrayList;

public class Arquivo {

    public void escrever(Funcionario f1){
        OutputStream os = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;

        try{

            os = new FileOutputStream("Funcionarios.txt", true);
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);

            bw.write("Funcionario");
            bw.newLine();
            bw.write(f1.nome+"\n");
            bw.write(f1.idade+"\n");
            bw.write(f1.cpf+"\n");

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

    public ArrayList<Funcionario> ler()
    {
        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        String linhaLer;

        ArrayList<Funcionario> acheiNoArquivo = new ArrayList<>();

        try {

            is = new FileInputStream("Funcionarios.txt");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);


            linhaLer = br.readLine();
            while (linhaLer != null)
            {
                if (linhaLer.contains("Funcionario"))
                {
                    Funcionario aux = new Funcionario();
                    aux.nome = br.readLine();
                    aux.idade = Integer.parseInt(br.readLine());
                    aux.cpf = br.readLine();
                    acheiNoArquivo.add(aux);
                }
                linhaLer = br.readLine();
            }

        }catch (Exception e){

            System.out.println(e);

        }finally {

            try {
                br.close();
            }catch (Exception e){
                System.out.println(e);
            }
        }
        return acheiNoArquivo;
    }
}
