/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kakykustore;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Koneksi {
    public static Connection getConnection() throws SQLException{
        Connection connection = null;
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql:d//localhost:3306/db_sop";
        String user = "root";
        String password = "";
        if (connection == null){
            try {
                Class.forName(driver);
                connection = (Connection) DriverManager.getConnection(url, user, password);
            }
            catch (ClassNotFoundException | SQLException error){
                System.exit(0);
            }
          }
        return connection;
    }
}
