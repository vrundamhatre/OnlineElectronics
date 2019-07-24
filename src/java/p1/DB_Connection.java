
package p1;

import java.sql.*;

public class DB_Connection 
{
    public static String SENDERS_EMAILID="@gmail.com";
    public static String SENDERS_PASSWORD="";
    
    public static Connection get_DBConnection()
    {
        Connection conn=null;
        try
        {
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           conn=DriverManager.getConnection("jdbc:sqlserver://172.23.79.11; databaseName=electronics_db; user=sa;password=P@ssw0rd;");
           
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return conn;
    }
    
}
