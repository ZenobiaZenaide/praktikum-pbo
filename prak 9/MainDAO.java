/**
 * Penulis : Zenobia Wirandi Zenaide
 * File : MainDAO.java
 * Deskripsi : Main program untuk akses DAO
 * tanggal : 06/06/2023
**/

public class MainDAO{
    public static void main(String args[]){
        Person person = new Person ("Indra");
        DAOManager m = new DAOManager();
        m.setPersonDAO (new MySQLPersonDAO());
        try{
            m.getPersonDAO().SavePerson(person);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}