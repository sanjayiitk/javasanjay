package mca23;
import java.sql.*;
public class MCA23
{
    static final String DB_URL="jdbc:mysql://localhost:3306/mysql";
    static final String USER="root";
    static final String PASS="root";
    static final String QUERY="SELECT id,name,course FROM student";
    public static void main(String[] args)
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection(DB_URL,USER,PASS);
            System.out.println(conn);
            Statement stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery(QUERY);
        
        {
            while(rs.next())
            {
                System.out.println("ID=" +rs.getInt("id"));
                System.out.println(",NAME=" +rs.getString("name"));
                System.out.println(",COURSE=" +rs.getString("course"));          
            }
        }
        }
        catch(ClassNotFoundException e)
        {
                e.printStackTrace();
        }
        catch(SQLException e)
        {
                e.printStackTrace();
        }
    }
}

