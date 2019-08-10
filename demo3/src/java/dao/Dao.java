package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dao {
    
    private Connection cn;

    public void conectar() throws SQLException, ClassNotFoundException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://35.212.108.52:3306/demo1", "root", "Loayzarojas1697#");
            System.out.println("Conectado");
        } catch (ClassNotFoundException e) {
            System.out.println("Error: " + e);
        }

    }

    public void Cerrar() throws SQLException {      //Cerrar la coneccion
        if (cn != null) {
            if (cn.isClosed() == false) {
                cn.close();
            }
        }
    }    

    public Connection getCn() {
        return cn;
    }

    public void setCn(Connection cn) {
        this.cn = cn;
    }
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        try {
            Dao dao = new Dao();
            dao.conectar();

        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        }
    }
}
