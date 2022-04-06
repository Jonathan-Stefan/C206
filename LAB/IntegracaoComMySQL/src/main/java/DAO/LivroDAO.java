package DAO;
import Model.Livro;
import java.sql.SQLException;

public class LivroDAO extends connectionDAO {

    //DAO - Data Access Object

    boolean sucesso = false; //Para saber se funcionou


    public boolean inserirLivro(Livro livro) {
        connectToDB();
        String sql = "INSERT INTO livro (nome,autor,editora, publicacao) values(?,?,?,?)";


        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, livro.nome);
            pst.setString(2, livro.autor);
            pst.setString(3, livro.editora);
            pst.setInt(4, livro.publicacao);
            pst.execute();
            sucesso = true;
        } catch (SQLException exc) {
            System.out.println("Erro: " + exc.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch (SQLException exc) {
                System.out.println("Erro: " + exc.getMessage());
            }
        }


        return sucesso;
    }


    public boolean atualizarInstrumento(int id, Livro livro) {
        connectToDB();
        String sql = "UPDATE livro SET nome=?, autor=?, editora=?, publicacao,  where id=?";


        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, livro.nome);
            pst.setString(2, livro.autor);
            pst.setString(3, livro.editora);
            pst.setInt(4, livro.publicacao);
            pst.setInt(5, id);
            pst.execute();
            sucesso = true;


        } catch (SQLException ex) {
            System.out.println("Erro = " + ex.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch (SQLException exc) {
                System.out.println("Erro: " + exc.getMessage());
            }
        }
        return sucesso;
    }


    public boolean deletarInstrumento(int id) {
        connectToDB();
        String sql = "DELETE FROM livro where id=?";


        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            pst.execute();
            sucesso = true;


        } catch (SQLException ex) {
            System.out.println("Erro = " + ex.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch (SQLException exc) {
                System.out.println("Erro: " + exc.getMessage());
            }
        }
        return sucesso;
    }

}
