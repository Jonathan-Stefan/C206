import DAO.InstrumentoDAO;
import DAO.LivroDAO;
import Model.Instrumento;
import Model.Livro;

public class Main {
    public static void main(String[] args) {


        InstrumentoDAO iDAO = new InstrumentoDAO();
        LivroDAO lDAO = new LivroDAO();

        Instrumento i1 = new Instrumento();
        i1.nome = "Violao";
        i1.marca = "Fender";
        i1.idade = 2;

        Instrumento i2 = new Instrumento();
        i2.nome = "Piano";
        i2.marca = "Top";
        i2.idade = 200;

        Instrumento i3 = new Instrumento();
        i3.nome = "Bateriaa";
        i3.marca = "Takamine";
        i3.idade = 5;

        Livro livro1 = new Livro();
        livro1.nome = "Cronicas de Narnia";
        livro1.autor = "Josephi";
        livro1.editora = "Abril";
        livro1.publicacao = 2016;

        iDAO.inserirInstrumento(i1);
        iDAO.inserirInstrumento(i2);
        iDAO.inserirInstrumento(i3);
        iDAO.atualizarInstrumento(1,i3);
        iDAO.deletarInstrumento(5);

        lDAO.inserirLivro(livro1);

        iDAO.buscarInstrumentosSemFiltro();
        iDAO.buscarInstrumentoPorId(2);
    }
}