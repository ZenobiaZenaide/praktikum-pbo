/**
 * Penulis : Zenobia Wirandi Zenaide
 * File : MySQLPersonDAO.java
 * Deskripsi : implementasi PersonDAO untuk MySQL
 * tanggal : 06/06/2023
**/
import java.sql.*;

public class MySQLPersonDAO implements PersonDAO{
    public void SavePerson(Person person) throws Exception{
        String name = person.getName();
        //membuat koneksi,nama db,user,password menyesuaikan
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(
						"jdbc:mysql://localhost/pbo","root","fira1212");
    //kerjakan mysql query
    String query = "INSERT INTO person(name) VALUES ('"+name+"')";
    System.out.println(query);
    Statement s = con.createStatement();
    s.executeUpdate(query);
    //tutup koneksi database
    con.close();
    }
}
