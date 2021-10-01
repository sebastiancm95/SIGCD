package SIGCD.Data.DataAccessObject;

import SIGCD.Logic.Formulario.Formulario;

public class AyudaTemporalDao {

//    public Formulario read(int id) throws Exception {
//        String sql = "select * from formularioA where id_Formulario=?";
//        PreparedStatement stm = Database.instance().prepareStatement(sql);
//        stm.setInt(1, id);
//        ResultSet rs = Database.instance().executeQuery(stm);
//        if (rs.next()) {
//            return from(rs);
//        } else {
//            return null;
//        }
//    }
//
//    public Pelicula from(ResultSet rs) {
//        try {
//            Pelicula r = new Pelicula();
//            r.setId_pelicula(rs.getInt("id_pelicula"));
//            r.setNombre(rs.getString("nombre"));
//            return r;
//        } catch (SQLException ex) {
//            return null;
//        }
//    }
//
//    public boolean create(Pelicula u) throws SQLException {
//        String sql = "insert into pelicula (id_pelicula,nombre) values(?,?)";
//        PreparedStatement ps = null;
//        Database db = Database.instance();
//        ps = db.getConnection().prepareStatement(sql);
//        ps.setInt(1, u.getId_pelicula());
//        ps.setString(2, u.getNombre());
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
//
//    public ArrayList<Pelicula> readAll() throws Exception {
//        String sql = "SELECT * from pelicula;";
//        PreparedStatement stm = Database.instance().prepareStatement(sql);
//        ResultSet rs = Database.instance().executeQuery(stm);
//        ArrayList<Pelicula> listaPeliculas = new ArrayList<Pelicula>();
//        while (rs.next()) {
//            listaPeliculas.add(from(rs));
//        }
//        return listaPeliculas;
//    }
//
//    public void close() {
//    }
}