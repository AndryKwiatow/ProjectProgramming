
package projectprogramming;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Andry Kwiatow
 */
public class sqlConnection {
    Connection connect=null;
    InternetConnection InternetException = new InternetConnection();
    public Connection connectionSql(){
    try {
        Class.forName("com.mysql.jdbc.Driver");
        connect=DriverManager.getConnection("jdbc:mysql://sql9.freesqldatabase.com/sql9263321","sql9263321","dfx1VTGCjm");
        System.out.println("Database connected!");
    } catch (Exception e) {
        System.out.print(e.getMessage());
         InternetException.setVisible(true);
    }
    return connect;
    }
}
