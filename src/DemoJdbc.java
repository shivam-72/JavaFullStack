//import package
//load and register
//create connection
//create statement
//process the results
//execute statement
//close connection
import java.sql.*;
public class DemoJdbc {
    public static void main(String []args) throws Exception{
        String uname="postgres";
        String url="jdbc:postgresql://localhost:5432/Javalearning";
        String pass="Rangercoder@7633";

        String query="select name from students where pid=1";
        String query2="select * from students";
        String query3="INSERT INTO students (pid, name, marks) \n" +
                "VALUES\n" +
                "    (9, 'John Doe', 85),\n" +
                "    (7, 'Jane Smith', 92),\n" +
                "    (6, 'Alice Johnson', 78)";
        String query4="insert into students values (?,?,?)";
       // Class.forName("org.postgresql.Driver");
    Connection con=DriverManager.getConnection(url,uname,pass);
        System.out.println("connection Established");
   // Statement st=con.createStatement();
        //create
       // ResultSet resultSet = st.executeQuery(query2);
//       System.out.println(resultSet.next());
//       System.out.println(resultSet.getString("name"));
//        while(resultSet.next()){
//            System.out.print(resultSet.getInt(1)+" ");
//            System.out.print(resultSet.getString(2)+ " ");
//            System.out.println(resultSet.getInt(3)+ " ");
//        }
 //       st.execute(query3);
//        use of prepared statement for parameter passing in query
        PreparedStatement st=con.prepareStatement(query4);
        st.setInt(1,11);
        st.setString(2,"subh");
        st.setInt(3,55);
        st.execute();
        con.close();
        System.out.println("connection Closed");
    }
}
