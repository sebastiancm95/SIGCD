package SIGCD.Data.DataAccessObject;

import SIGCD.Logic.Formulario.Ayuda_Temporal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Ayuda_Temporal_Dao {

    public Ayuda_Temporal read(int id) throws Exception {
        String sql = "select * from t_ayuda_temporal where id_ayuda_temporal=?";
        PreparedStatement stm = Database.instance().prepareStatement(sql);
        stm.setInt(1, id);
        ResultSet rs = Database.instance().executeQuery(stm);
        if (rs.next()) {
            return from(rs);
        } else {
            return null;
        }
    }

    public Ayuda_Temporal from(ResultSet rs) {
        try {
            Ayuda_Temporal OAyuda_Temporal = new Ayuda_Temporal();
            OAyuda_Temporal.setCedula(rs.getString(""));
            OAyuda_Temporal.setNombre(rs.getString(""));
            OAyuda_Temporal.setPrimer_Apellido(rs.getString(""));
            OAyuda_Temporal.setSegundo_Apellido(rs.getString(""));
            OAyuda_Temporal.setDistrito(rs.getString(""));
            OAyuda_Temporal.setBarrio(rs.getString(""));
            OAyuda_Temporal.setDireccion(rs.getString(""));
            OAyuda_Temporal.setTelefono_Habitacion(rs.getString(""));
            OAyuda_Temporal.setTelefono_Celular(rs.getString(""));
            OAyuda_Temporal.setMotivo_Ayuda(rs.getString(""));
            OAyuda_Temporal.setEstado(rs.getString(""));
            OAyuda_Temporal.setFecha((LocalDateTime) rs.getObject(""));
            return OAyuda_Temporal;
        } catch (SQLException ex) {
            return null;
        }
    }

    public boolean create(Ayuda_Temporal OAyuda_Temporal) throws SQLException {
        String sql = "insert into pelicula (id_pelicula,nombre) values(?,?)";
        PreparedStatement ps = null;
        Database db = Database.instance();
        ps = db.getConnection().prepareStatement(sql);
        ps.setInt(1, OAyuda_Temporal.getId());
        ps.setString(2, OAyuda_Temporal.getCedula());
        ps.setString(3, OAyuda_Temporal.getNombre());
        ps.setString(4, OAyuda_Temporal.getPrimer_Apellido());
        ps.setString(5, OAyuda_Temporal.getSegundo_Apellido());
        ps.setString(6, OAyuda_Temporal.getDistrito());
        ps.setString(7, OAyuda_Temporal.getBarrio());
        ps.setString(8, OAyuda_Temporal.getDireccion());
        ps.setString(9, OAyuda_Temporal.getTelefono_Habitacion());
        ps.setString(10, OAyuda_Temporal.getTelefono_Celular());
        ps.setString(11, OAyuda_Temporal.getMotivo_Ayuda());
        ps.setObject(12, (LocalDateTime) OAyuda_Temporal.getFecha());
        if (ps.executeUpdate() > 0) {
            return true;
        }
        return false;
    }

//    public Pelicula findById(int id_pelicula) {
//        String sql = "select id_pelicula from pelicula where id_pelicula=?;";
//        PreparedStatement ps = null;
//        Database db = Database.instance();
//        ResultSet rs = null;
//        Pelicula u = null;
//        try {
//            ps = db.getConnection().prepareStatement(sql);
//            ps.setInt(1, id_pelicula);
//            rs = ps.executeQuery();
//            while (rs.next()) {
//                u = new Pelicula(
//                        rs.getInt(1),
//                        rs.getString(2)
//                );
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(PeliculaDao.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return u;
//    }
    public ArrayList<Ayuda_Temporal> readAll() throws Exception {
        String sql = "SELECT * from pelicula;";
        PreparedStatement stm = Database.instance().prepareStatement(sql);
        ResultSet rs = Database.instance().executeQuery(stm);
        ArrayList<Ayuda_Temporal> OLista_Ayuda_Temporal = new ArrayList<Ayuda_Temporal>();
        while (rs.next()) {
            OLista_Ayuda_Temporal.add(from(rs));
        }
        return OLista_Ayuda_Temporal;
    }

    public void close() {
    }
}
