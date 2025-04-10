import java.sql.*;

public class DemoJdbc {
    public static void main(String[] args) throws SQLException {
        
        String url="jdbc:postgresql://localhost:5432/DemoDataBase";
        String uname="postgres";
        String pass="1234";
        String sql = "select * from student";
        //Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(url,uname,pass);
        System.out.println("Connection Established");
        Statement st= con.createStatement();
        ResultSet rs = st.executeQuery(sql );
//        rs.next();
//        String name = rs.getString("sname");
//        System.out.println(name);
        while(rs.next())
        {
            System.out.print(rs.getInt(1)+" - ");
            System.out.print(rs.getString(2)+" - ");
            System.out.println(rs.getInt(3));
        }
        con.close();
        System.out.println("Connection closed");
    }
}
