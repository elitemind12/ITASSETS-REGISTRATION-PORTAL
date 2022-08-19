
package itassets.registration.portal;

import java.sql.Connection;
import java.sql.DriverManager;

public class connection {
    static Connection conn;
    public static Connection getConnection(){
    try{
       Class.forName("com.mysql.jdbc.Driver");
       conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/itassetsdb","root","");
       //connect with item database:
    }catch(Exception ex){
        System.out.println(""+ex);
    }
    return conn;
    }
    
}
