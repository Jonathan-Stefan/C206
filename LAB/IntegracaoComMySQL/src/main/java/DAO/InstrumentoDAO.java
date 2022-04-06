package DAO;
import Model.Instrumento;
import java.sql.SQLException;

public class InstrumentoDAO extends connectionDAO {

    //DAO - Data Access Object

    boolean sucesso = false; //Para saber se funcionou


    public boolean inserirInstrumento(Instrumento instrumento) {
        connectToDB();
        String sql = "INSERT INTO instrumentos (nome,marca,idade) values(?,?,?)";


        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, instrumento.nome);
            pst.setString(2, instrumento.marca);
            pst.setInt(3, instrumento.idade);
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


    public boolean atualizarInstrumento(int id, Instrumento instrumento) {
        connectToDB();
        String sql = "UPDATE instrumentos SET nome=?, marca=?, idade=? where id=?";


        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, instrumento.nome);
            pst.setString(2, instrumento.marca);
            pst.setInt(3, instrumento.idade);
            pst.setInt(4, id);
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
        String sql = "DELETE FROM instrumentos where id=?";


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