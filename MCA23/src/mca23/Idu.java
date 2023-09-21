package mca23;
import java.sql.*;
public class Idu
{
    static final String DB_URL="jdbc:mysql://localhost:3306/mysql";
    static final String USER="root";
    static final String PASS="root";
    static final String QUERY="CREATE table college(id int, name varchar(25), course varchar(25));";
    public static void main(String[] args)
    {
        try
        {
            System.out.println("Start program");
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection(DB_URL,USER,PASS);
            System.out.println(conn);
            Statement stmt=conn.createStatement();
            boolean a= stmt.execute(QUERY);
            System.out.println(a);
            System.out.println("Table created");
            /*ResultSet rs=stmt.executeUpdate(SQL);
        {
            while(rs.next())
            {
                System.out.println("ID=" +rs.getInt("id"));
                System.out.println(",NAME=" +rs.getString("name"));
                System.out.println(",COURSE=" +rs.getString("course"));          
            }
        }*/
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

