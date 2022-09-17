package test;



import Beans.Herramientas;
import connection.DBConnection;
import java.sql.ResultSet;
import java.sql.Statement;


public class OperacionesDB {
    
    public static void main(String[] args) {
        listarHerramientas();
        //actualizarPelicula(1,"Romance");
    }
    
    public static void actualizarHerramientas(int id, String tipo){
        DBConnection con = new DBConnection();
        String sql = "UPDATE herramientas SET tipo = '"+ tipo +"' WHERE id = " + id;
        try {
        Statement st = con.getConnection().createStatement();
        st.executeUpdate(sql);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        finally{
            con.desconectar();
        }
        
    }
    
    public static void listarHerramientas(){
        DBConnection con = new DBConnection();
        String sql = "SELECT * FROM herramientas LIMIT 100;";
        try {
        Statement st = con.getConnection().createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()){
            int id = rs.getInt("id");
            String nombre = rs.getString("nombre");
            String tipo = rs.getString("tipo");
            int cantidad = rs.getInt("cantidad");
            boolean novedad = rs.getBoolean("novedad");
            
            Herramientas herramientas = new Herramientas(id, nombre, tipo, cantidad, novedad);
            System.out.println(herramientas.toString());
        }
        st.executeQuery(sql);
        
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        finally{
            con.desconectar();
        }
        
    }
    
    
    
}

