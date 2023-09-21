package mca23;
import java.sql.*;
public class Prepare
{
    public static void main(String[] args)
    {
        try
        {
            System.out.println("Start program");
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","root");
            System.out.println(conn);
            PreparedStatement ps = conn.prepareStatement("insert into college values(?,?,?)");
            ps.setInt(1,109);
            ps.setString(2,"Jawan");
            ps.setString(3,"Bollywood");
            int i=ps.executeUpdate();
            System.out.println("Record inserted");
            ResultSet rs =ps.executeQuery("select * from college");
            while(rs.next())
            {
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+"  "+rs.getString(3));
            }
        }
        catch(ClassNotFoundException e)
        {
                System.out.println("Unable to load driver"+e);
        }
        catch(SQLException e)
        {
                System.out.println(e);
        }
    }
}