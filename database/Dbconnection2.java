package database;
import java.sql.*;

public class Dbconnection2 {

    public Connection con;
    Statement st;
    ResultSet rows;
    int val;

    public Dbconnection2() {
        // register the driver class
        try {
            String username = "root";
            String password = "fairytail23";
            Class.forName("com.mysql.cj.jdbc.Driver");
            // create the connection object
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/Ghumantey?characterEncoding=utf8&useSSL=false&autoReconnect=true",
                    username, password);
            if (con != null) {
                System.out.println("Connected to Ghumantey Database");
            } else {
                System.out.println("Error connecting Database");
            }

            // creating statement object
            st = con.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // method to insert data using prepared statement
  public int maniulate(PreparedStatement st2) {

    try {
        val = st.executeUpdate(null);
        // con.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }

    return val;
}
    // Used for insert, update, delete
    public int maniulate(String query) {
        try {
            val = st.executeUpdate(query);
            con.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return val;
    }


// Used for select
public ResultSet retrieve(String query) {
    try {
        rows = st.executeQuery(query);
        // con.close();
    } catch (SQLException throwables) {
        throwables.printStackTrace();
    }
    return rows;
}
public static void main(String[] args) {
    new Dbconnection2();
}


}
