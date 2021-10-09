package SIGCD.Data.DataAccessObject;

import SIGCD.Logic.Formulario.BecaMunicipal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class BecaMunicipalDao {
//
//    public BecaMunicipal read(int id) throws Exception {
//        String sql = "select * from t_beca_municipal where id_beca_municipal=?";
//        PreparedStatement stm = Database.instance().prepareStatement(sql);
//        stm.setInt(1, id);
//        ResultSet resultSet = Database.instance().executeQuery(stm);
//        if (resultSet.next()) {
//            return from(resultSet);
//        } else {
//            return null;
//        }
//    }
//
//    public BecaMunicipal from(ResultSet resultSet) {
//        try {
//            BecaMunicipal OBecaMunicipal = new BecaMunicipal();
//            OBecaMunicipal.setCedula(resultSet.getString(""));
//            OBecaMunicipal.setNombre(resultSet.getString(""));
//            OBecaMunicipal.setPrimer_Apellido(resultSet.getString(""));
//            OBecaMunicipal.setSegundo_Apellido(resultSet.getString(""));
//            OBecaMunicipal.setDistrito(resultSet.getString(""));
//            OBecaMunicipal.setBarrio(resultSet.getString(""));
//            OBecaMunicipal.setDireccion(resultSet.getString(""));
//            OBecaMunicipal.setTelefono_Habitacion(resultSet.getString(""));
//            OBecaMunicipal.setTelefono_Celular(resultSet.getString(""));
//            OBecaMunicipal.setFecha_Nacimiento(resultSet.getString(""));
//            OBecaMunicipal.setEdad(resultSet.getInt(""));
//            OBecaMunicipal.setGrado_CuresultSetando(resultSet.getString(""));
//            OBecaMunicipal.setCedula_Madre(resultSet.getString(""));
//            OBecaMunicipal.setNombre_Madre(resultSet.getString(""));
//            OBecaMunicipal.setPrimer_Apellido_Madre(resultSet.getString(""));
//            OBecaMunicipal.setSegundo_Apellido_Madre(resultSet.getString(""));
//            OBecaMunicipal.setCedula_Padre(resultSet.getString(""));
//            OBecaMunicipal.setNombre_Padre(resultSet.getString(""));
//            OBecaMunicipal.setPrimer_Apellido_Padre(resultSet.getString(""));
//            OBecaMunicipal.setSegundo_Apellido_Padre(resultSet.getString(""));
//            OBecaMunicipal.setFecha((LocalDateTime) resultSet.getObject(""));
//            return OBecaMunicipal;
//        } catch (SQLException ex) {
//            return null;
//        }
//    }
//
//    public boolean create(BecaMunicipal OBecaMunicipal) throws SQLException {
//        String sql = "insert into pelicula (id_pelicula,nombre) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
//        PreparedStatement ps = null;
//        Database db = Database.instance();
//        ps = db.getConnection().prepareStatement(sql);
//        ps.setInt(1, OBecaMunicipal.getId());
//        ps.setString(1, OBecaMunicipal.getCedula());
//        ps.setString(2, OBecaMunicipal.getNombre());
//        ps.setString(3, OBecaMunicipal.getPrimer_Apellido());
//        ps.setString(4, OBecaMunicipal.getSegundo_Apellido());
//        ps.setString(6, OBecaMunicipal.getDistrito());
//        ps.setString(7, OBecaMunicipal.getBarrio());
//        ps.setString(8, OBecaMunicipal.getDireccion());
//        ps.setString(9, OBecaMunicipal.getTelefono_Habitacion());
//        ps.setString(10, OBecaMunicipal.getTelefono_Celular());
//        ps.setString(11, OBecaMunicipal.getFecha_Nacimiento());
//        ps.setString(12, OBecaMunicipal.getGrado_CuresultSetando());
//        ps.setInt(13, OBecaMunicipal.getEdad());
//        ps.setString(14, OBecaMunicipal.getNombre_Madre());
//        ps.setString(15, OBecaMunicipal.getCedula_Madre());
//        ps.setString(16, OBecaMunicipal.getNombre_Padre());
//        ps.setString(17, OBecaMunicipal.getCedula_Padre());
//        ps.setObject(18, (LocalDateTime) OBecaMunicipal.getFecha());
//        if (ps.executeUpdate() > 0) {
//            return true;
//        }
//        return false;
//    }
//
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
//
//    public ArrayList<BecaMunicipal> readAll() throws Exception {
//        String sql = "SELECT * from pelicula;";
//        PreparedStatement stm = Database.instance().prepareStatement(sql);
//        ResultSet resultSet = Database.instance().executeQuery(stm);
//        ArrayList<BecaMunicipal> listaBecaMunicipal = new ArrayList<BecaMunicipal>();
//        while (resultSet.next()) {
//            listaBecaMunicipal.add(from(resultSet));
//        }
//        return listaBecaMunicipal;
//    }
//
//    public void close() {
//    }
}
