package DAO;
import Model.Instrumento;
import java.sql.SQLException;
import java.util.ArrayList;

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

    public ArrayList<Instrumento> buscarInstrumentosSemFiltro() {
        ArrayList<Instrumento> listaDeInstrumentos = new ArrayList<>();
        connectToDB();
        String sql = "SELECT * FROM instrumentos";
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            System.out.println("Lista de Instrumentos: ");
            while (rs.next()) {
                Instrumento instrumentoAux = new Instrumento();
                instrumentoAux.nome = rs.getString("nome");
                instrumentoAux.marca = rs.getString("marca");
                instrumentoAux.idade = rs.getInt("idade");
                System.out.println("nome = " + instrumentoAux.nome);
                System.out.println("marca = " + instrumentoAux.marca);
                System.out.println("idade = " + instrumentoAux.idade);
                System.out.println("--------------------------------");
                listaDeInstrumentos.add(instrumentoAux);
            }
            sucesso = true;
        } catch(SQLException e) {
            System.out.println("Erro: " + e.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                st.close();
            } catch(SQLException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
        return listaDeInstrumentos;
    }
    public Instrumento buscarInstrumentoPorId(int id) {
        connectToDB();
        Instrumento instrumentoAux = null;
        String sql = "SELECT * FROM instrumentos WHERE id = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            rs = pst.executeQuery();
            while (rs.next()) {
                String aux = rs.getString("nome");
                if(aux.isEmpty())
                {
                    sucesso = false;
                } else {
                    instrumentoAux = new Instrumento();
                    instrumentoAux.nome = rs.getString("nome");
                    instrumentoAux.idade = rs.getInt("idade");
                    instrumentoAux.marca = rs.getString("marca");
                    System.out.println("nome = " + instrumentoAux.nome);
                    System.out.println("marca = " + instrumentoAux.marca);
                    System.out.println("idade = " + instrumentoAux.idade);
                    System.out.println("--------------------------------");
                }
            }
            sucesso = true;
        } catch(SQLException e) {
            System.out.println("Erro: " + e.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch(SQLException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
        return instrumentoAux;
    }
}