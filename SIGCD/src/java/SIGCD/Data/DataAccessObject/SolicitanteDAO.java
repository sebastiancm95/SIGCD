package SIGCD.Data.DataAccessObject;

import SIGCD.Logic.Persona.Solicitante;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SolicitanteDAO {
   
//    public Solicitante read(int idSolicitante) throws Exception {
//        String sql = "select * from Solicitante where idSolicitante=?";
//        PreparedStatement preparedStatement = Database.instance().prepareStatement(sql);
//        preparedStatement.setInt(1, idSolicitante);
//        ResultSet resultSet = Database.instance().executeQuery(preparedStatement);
//        if (resultSet.next()) {
//            return from(resultSet);
//        } else {
//            return null;
//        }
//    }

//    public Solicitante from(ResultSet resultSet) {
//        try {
//            Solicitante solicitante = new Solicitante();
//            solicitante.setIdPersona(resultSet.getInt("idSolicitante"));
//            solicitante.setCedula(resultSet.getString("cedula"));
//            solicitante.setNombre(resultSet.getString("nombre"));
//            solicitante.setPrimerApellido(resultSet.getString("primerApellido"));
//            solicitante.setSegundoApellido(resultSet.getString("segundoApellido"));
//            
//            ayudaTemporal.setIdFormulario(resultSet.getInt("idAyudaTemporal"));
//            ayudaTemporal.setEstado(resultSet.getInt("estado"));
//            ayudaTemporal.setSolicitante(resultSet.getInt("solicitante"));
//            ayudaTemporal.setMotivoAyuda(resultSet.getString("motivoAyuda"));
//            ayudaTemporal.setFechaCreacion(resultSet.getTimestamp("fechaCreacion"));
//            return ayudaTemporal;
//        } catch (SQLException ex) {
//            return null;
//        }
//    }
//
//    public boolean create(AyudaTemporal ayudaTemporal) throws SQLException {
//        String ayudaTemporalSQL = "insert into AyudaTemporal (estado,solicitante,motivoAyuda,fechaCreacion) values(?,?,?,?)";
//        Database database = Database.instance();
//        PreparedStatement preparedStatement = null;
//        preparedStatement = database.getConnection().prepareStatement(ayudaTemporalSQL);
//        preparedStatement.setInt(1, ayudaTemporal.getEstado());
//        preparedStatement.setInt(2, ayudaTemporal.getSolicitante());
//        preparedStatement.setString(3, ayudaTemporal.getMotivoAyuda());
//        preparedStatement.setTimestamp(4, ayudaTemporal.getFechaCreacion());
//        if (preparedStatement.executeUpdate() > 0) {
//            return true;
//        }
//        return false;
//    }
//
//    public AyudaTemporal findById(int idAyudaTemporal) {
//        String sql = "select idAyudaTemporal from AyudaTemporal where idAyudaTemporal=?;";
//        PreparedStatement preparedStatement = null;
//        Database database = Database.instance();
//        ResultSet resultSet = null;
//        AyudaTemporal temp = null;
//        try {
//            preparedStatement = database.getConnection().prepareStatement(sql);
//            preparedStatement.setInt(1, idAyudaTemporal);
//            resultSet = preparedStatement.executeQuery();
//            while (resultSet.next()) {
//                temp = new AyudaTemporal(
//                        resultSet.getInt(1),
//                        resultSet.getInt(2),
//                        resultSet.getTimestamp(3),
//                        resultSet.getInt(4),
//                        resultSet.getString(5)
//                );
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(AyudaTemporalDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return temp;
//    }
//
//    public ArrayList<AyudaTemporal> readAll() throws Exception {
//        String sql = "select * from AyudaTemporal;";
//        PreparedStatement preparedStatement = Database.instance().prepareStatement(sql);
//        ResultSet resultSet = Database.instance().executeQuery(preparedStatement);
//        ArrayList<AyudaTemporal> listaAyudaTemporal = new ArrayList<>();
//        while (resultSet.next()) {
//            listaAyudaTemporal.add(from(resultSet));
//        }
//        return listaAyudaTemporal;
//    }

    public void close() {
    }
}
