package SIGCD.Data.DataAccessObject;

import SIGCD.Logic.Direccion.Direccion;
import SIGCD.Logic.Formulario.AyudaTemporal;
import SIGCD.Logic.Persona.Solicitante;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class AyudaTemporalDao {

    public AyudaTemporal read(int idAyudaTemporal) throws Exception {
        String sql = "select * from AyudaTemporal where idAyudaTemporal=?";
        PreparedStatement preparedStatement = Database.instance().prepareStatement(sql);
        preparedStatement.setInt(1, idAyudaTemporal);
        ResultSet resultSet = Database.instance().executeQuery(preparedStatement);
        if (resultSet.next()) {
            return from(resultSet);
        } else {
            return null;
        }
    }

    public AyudaTemporal from(ResultSet resultSet) {
        try {
            AyudaTemporal ayudaTemporal = new AyudaTemporal();
            Solicitante solicitante = new Solicitante();
            Direccion direccion = new Direccion();
            ayudaTemporal.setIdFormulario(resultSet.getInt(""));
            ayudaTemporal.setEstado(resultSet.getInt(""));
            solicitante.setCedula(resultSet.getString(""));
            solicitante.setNombre(resultSet.getString(""));
            solicitante.setPrimerApellido(resultSet.getString(""));
            solicitante.setSegundoApellido(resultSet.getString(""));
            solicitante.setTelefonoHabitacion(resultSet.getString(""));
            solicitante.setTelefonoCelular(resultSet.getString(""));
            direccion.setDistrito(resultSet.getString(""));
            direccion.setBarrio(resultSet.getString(""));
            direccion.setDireccionExacta(resultSet.getString(""));
            solicitante.setDireccion(direccion);
            ayudaTemporal.setSolicitante(solicitante);
            ayudaTemporal.setMotivoAyuda(resultSet.getString(""));
            ayudaTemporal.setFechaCreacion(resultSet.getTimestamp(""));
            return ayudaTemporal;
        } catch (SQLException ex) {
            return null;
        }
    }

    public boolean create(AyudaTemporal ayudaTemporal) throws SQLException {
        String ayudaTemporalSQL = "insert into AyudaTemporal (idAyudaTemporal,estado,solicitante,motivoAyuda,fechaCreacion) values(?,?,?,?,?)";
        String solicitanteSQL = "insert into solicitante (idSolicitante,cedula,nombre,primerApellido,segundoApellido,telefonoHabitacion,telefonoCelular,distrito,barrio,direccionExacta) values(?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement preparedStatementS = null;
        PreparedStatement preparedStatementAT = null;
        Database database = Database.instance();
        Solicitante solicitante = ayudaTemporal.getSolicitante();
        preparedStatementS = database.getConnection().prepareStatement(solicitanteSQL);
        preparedStatementAT = database.getConnection().prepareStatement(ayudaTemporalSQL);

        preparedStatementS.setInt(1, solicitante.getIdPersona());
        preparedStatementS.setString(2, solicitante.getCedula());
        preparedStatementS.setString(3, solicitante.getNombre());
        preparedStatementS.setString(4, solicitante.getPrimerApellido());
        preparedStatementS.setString(5, solicitante.getSegundoApellido());
        preparedStatementS.setString(6, solicitante.getTelefonoHabitacion());
        preparedStatementS.setString(6, solicitante.getTelefonoCelular());
        preparedStatementS.setString(7, solicitante.getDireccion().getDistrito());
        preparedStatementS.setString(8, solicitante.getDireccion().getBarrio());
        preparedStatementS.setString(9, solicitante.getDireccion().getDireccionExacta());

        preparedStatementAT.setInt(1, ayudaTemporal.getIdFormulario());
        preparedStatementAT.setInt(2, ayudaTemporal.getEstado());
        preparedStatementAT.setInt(3, solicitante.getIdPersona());
        preparedStatementAT.setString(4, ayudaTemporal.getMotivoAyuda());
        preparedStatementAT.setTimestamp(5, ayudaTemporal.getFechaCreacion());
        if ((preparedStatementS.executeUpdate() > 0) && (preparedStatementAT.executeUpdate() > 0)) {
            return true;
        }
        return false;
    }

//    public Pelicula findById(int id_pelicula) {
//        String sql = "select id_pelicula from pelicula where id_pelicula=?;";
//        PreparedStatement preparedStatement = null;
//        Database database = Database.instance();
//        ResultSet resultSet = null;
//        Pelicula u = null;
//        try {
//            preparedStatement = database.getConnection().prepareStatement(sql);
//            preparedStatement.setInt(1, id_pelicula);
//            resultSet = preparedStatement.executeQuery();
//            while (resultSet.next()) {
//                u = new Pelicula(
//                        resultSet.getInt(1),
//                        resultSet.getString(2)
//                );
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(PeliculaDao.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return u;
//    }
    public ArrayList<AyudaTemporal> readAll() throws Exception {
        String sql = "SELECT * from AyudaTemporal;";
        PreparedStatement preparedStatement = Database.instance().prepareStatement(sql);
        ResultSet resultSet = Database.instance().executeQuery(preparedStatement);
        ArrayList<AyudaTemporal> listaAyudaTemporal = new ArrayList<AyudaTemporal>();
        while (resultSet.next()) {
            listaAyudaTemporal.add(from(resultSet));
        }
        return listaAyudaTemporal;
    }

    public void close() {
    }
}
