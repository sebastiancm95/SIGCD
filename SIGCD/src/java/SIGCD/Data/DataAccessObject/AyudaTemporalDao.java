package SIGCD.Data.DataAccessObject;

import SIGCD.Logic.Formulario.AyudaTemporal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class AyudaTemporalDao {

//    public AyudaTemporal read(int id) throws Exception {
//        String sql = "select * from t_ayuda_temporal where id_ayuda_temporal=?";
//        PreparedStatement stm = Database.instance().prepareStatement(sql);
//        stm.setInt(1, id);
//        ResultSet resultSet = Database.instance().executeQuery(stm);
//        if (resultSet.next()) {
//            return from(resultSet);
//        } else {
//            return null;
//        }
//    }
//    public AyudaTemporal from(ResultSet resultSet) {
//        try {
//            AyudaTemporal ayudaTemporal = new AyudaTemporal();
//            OAyudaTemporal.setCedula(resultSet.getString(""));
//            OAyudaTemporal.setNombre(resultSet.getString(""));
//            OAyudaTemporal.setPrimer_Apellido(resultSet.getString(""));
//            OAyudaTemporal.setSegundo_Apellido(resultSet.getString(""));
//            OAyudaTemporal.setDistrito(resultSet.getString(""));
//            OAyudaTemporal.setBarrio(resultSet.getString(""));
//            OAyudaTemporal.setDireccion(resultSet.getString(""));
//            OAyudaTemporal.setTelefono_Habitacion(resultSet.getString(""));
//            OAyudaTemporal.setTelefono_Celular(resultSet.getString(""));
//            OAyudaTemporal.setMotivo_Ayuda(resultSet.getString(""));
//            OAyudaTemporal.setEstado(resultSet.getString(""));
//            OAyudaTemporal.setFecha((LocalDateTime) resultSet.getObject(""));
//            return ayudaTemporal;
//        } catch (SQLException ex) {
//            return null;
//        }
//    }
//    public boolean create(AyudaTemporal OAyudaTemporal) throws SQLException {
//        String sql = "insert into pelicula (id_pelicula,nombre) values(?,?)";
//        PreparedStatement ps = null;
//        Database db = Database.instance();
//        ps = db.getConnection().prepareStatement(sql);
//        ps.setInt(1, OAyudaTemporal.getId());
//        ps.setString(2, OAyudaTemporal.getCedula());
//        ps.setString(3, OAyudaTemporal.getNombre());
//        ps.setString(4, OAyudaTemporal.getPrimer_Apellido());
//        ps.setString(5, OAyudaTemporal.getSegundo_Apellido());
//        ps.setString(6, OAyudaTemporal.getDistrito());
//        ps.setString(7, OAyudaTemporal.getBarrio());
//        ps.setString(8, OAyudaTemporal.getDireccion());
//        ps.setString(9, OAyudaTemporal.getTelefono_Habitacion());
//        ps.setString(10, OAyudaTemporal.getTelefono_Celular());
//        ps.setString(11, OAyudaTemporal.getMotivo_Ayuda());
//        ps.setObject(12, (LocalDateTime) OAyudaTemporal.getFecha());
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
