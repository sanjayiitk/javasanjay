package mca23;
import java.sql.*;
public class Ins
{
    static final String DB_URL="jdbc:mysql://localhost:3306/mysql";
    static final String USER="root";
    static final String PASS="root";
    static final String QUERY1="INSERT into college values(106,'Aaru','Makeup'),(105,'Aadhya','HR');";
    public static void main(String[] args)
    {
        try
        {
            System.out.println("Start program");
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection(DB_URL,USER,PASS);
            System.out.println(conn);
            Statement stmt=conn.createStatement();
            int a= stmt.executeUpdate(QUERY1);
            System.out.println("Data Entered");
            /*ResultSet rs=stmt.executeUpdate(QUERY2);
            while(rs.next())
            {
                System.out.println("ID=" +rs.getInt("id"));
                System.out.println(",NAME=" +rs.getString("name"));
                System.out.println(",COURSE=" +rs.getString("course"));          
            } */       
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

