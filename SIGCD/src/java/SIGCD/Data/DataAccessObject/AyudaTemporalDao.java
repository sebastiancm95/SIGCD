package SIGCD.Data.DataAccessObject;

import SIGCD.Logic.Direccion.Direccion;
import SIGCD.Logic.Formulario.AyudaTemporal;
import SIGCD.Logic.Persona.Solicitante;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AyudaTemporalDao {

    public AyudaTemporal read(int id) throws Exception {
        String sql = "select * from AyudaTemporal where idAyudaTemporal=?";
        PreparedStatement stm = Database.instance().prepareStatement(sql);
        stm.setInt(1, id);
        ResultSet resultSet = Database.instance().executeQuery(stm);
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
            ayudaTemporal.setSolicitante(solicitante);
            ayudaTemporal.setMotivoAyuda(resultSet.getString(""));
            ayudaTemporal.setFechaCreacion(resultSet.getTimestamp(""));
            return ayudaTemporal;
        } catch (SQLException ex) {
            return null;
        }
    }

//    public boolean create(AyudaTemporal ayudaTemporal) throws SQLException {
//        String sql = "insert into pelicula (id_pelicula,nombre) values(?,?)";
//        PreparedStatement ps = null;
//        Database db = Database.instance();
//        ps = db.getConnection().prepareStatement(sql);
//        ps.setInt(1, ayudaTemporal.getIdFormulario());
//        
//        
//        ps.setInt(1, ayudaTemporal.getId());
//        ps.setString(2, ayudaTemporal.getCedula());
//        ps.setString(3, ayudaTemporal.getNombre());
//        ps.setString(4, ayudaTemporal.getPrimer_Apellido());
//        ps.setString(5, ayudaTemporal.getSegundo_Apellido());
//        ps.setString(6, ayudaTemporal.getDistrito());
//        ps.setString(7, ayudaTemporal.getBarrio());
//        ps.setString(8, ayudaTemporal.getDireccion());
//        ps.setString(9, ayudaTemporal.getTelefono_Habitacion());
//        ps.setString(10, ayudaTemporal.getTelefono_Celular());
//        ps.setString(11, ayudaTemporal.getMotivo_Ayuda());
//        ps.setObject(12, (LocalDateTime) ayudaTemporal.getFecha());
//        if (ps.executeUpdate() > 0) {
//            return true;
//        }
//        return false;
//    }
    
//    public Pelicula findById(int id_pelicula) {
//        String sql = "select id_pelicula from pelicula where id_pelicula=?;";
//        PreparedStatement ps = null;
//        Database db = Database.instance();
//        ResultSet resultSet = null;
//        Pelicula u = null;
//        try {
//            ps = db.getConnection().prepareStatement(sql);
//            ps.setInt(1, id_pelicula);
//            resultSet = ps.executeQuery();
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
//    public ArrayList<AyudaTemporal> readAll() throws Exception {
//        String sql = "SELECT * from pelicula;";
//        PreparedStatement stm = Database.instance().prepareStatement(sql);
//        ResultSet resultSet = Database.instance().executeQuery(stm);
//        ArrayList<AyudaTemporal> listaAyudaTemporal = new ArrayList<AyudaTemporal>();
//        while (resultSet.next()) {
//            listaAyudaTemporal.add(from(resultSet));
//        }
//        return listaAyudaTemporal;
//    }
//
//    public void close() {
//    }
}
