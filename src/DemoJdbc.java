import java.sql.*;

public class DemoJdbc {
    public static void main(String[] args) throws SQLException {

        String url="jdbc:postgresql://localhost:5432/DemoDataBase";
        String uname="postgres";
        String pass="1234";

        int sid=101;
        String sname="Shreya";
        int marks=49;
        //String sql = "select * from student";
        //String sql = "insert into student values (7,'john',56)";
        //String sql = "update student set sname="Max" where sid=7";
        //String sql="delete from student where sid=7";

        String sql="insert into student values (?,?,?)";
        //Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(url,uname,pass);
        System.out.println("Connection Established");
        //       Statement st= con.createStatement();
//        ResultSet rs = st.executeQuery(sql );
//        rs.next();
//        String name = rs.getString("sname");
//        System.out.println(name);
//        while(rs.next())
//        {
//            System.out.print(rs.getInt(1)+" - ");
//            System.out.print(rs.getString(2)+" - ");
//            System.out.println(rs.getInt(3));
//        }

  //      boolean status=st.execute(sql);
   //     System.out.println(status);

        PreparedStatement st = con.prepareStatement(sql);
        st.setInt(1,sid);
        st.setString(2,sname);
        st.setInt(3,marks);
        System.out.println("Connection closed");
    }
}
