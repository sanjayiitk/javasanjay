package mca23;
import java.sql.*;
public class Combine
{
    static final String DB_URL="jdbc:mysql://localhost:3306/mysql";
    static final String USER="root";
    static final String PASS="root";
    static final String QUERY1="CREATE table School2(id int, name varchar(25),age int(25));";
    static final String QUERY2="INSERT into School2 values(101,'Aaru',15),(102,'Aadhya',14);";
    static final String QUERY3="SELECT id,name,age FROM School1";
    static final String QUERY4="DELETE from School2 where id=109;";
    public static void main(String[] args)
    {
        try
        {
            System.out.println("Start program");
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection(DB_URL,USER,PASS);
            System.out.println(conn);
            Statement stmt=conn.createStatement();
            boolean a= stmt.execute(QUERY1);            
            System.out.println(a);
            System.out.println("Table created");
            int b= stmt.executeUpdate(QUERY2);
            System.out.println("Data Entered");
            System.out.println("Show Data");
            ResultSet rs=stmt.executeQuery(QUERY3);        
            while(rs.next())
            {
                System.out.println("ID=" +rs.getInt("id"));
                System.out.println(",NAME=" +rs.getString("name"));
                System.out.println(",AGE=" +rs.getString("age"));          
            }
            int c= stmt.executeUpdate(QUERY4);
            System.out.println("Data Deleted");        
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

