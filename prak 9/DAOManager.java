/**
 * Penulis : Zenobia Wirandi Zenaide
 * File : DAOManager.java
 * Deskripsi : pengelola DAO dalam program
 * Tanggal : 06/06/2023
**/

public class DAOManager{
    private PersonDAO personDAO;

    public void setPersonDAO(PersonDAO person){
        personDAO = person;
    }
    public PersonDAO getPersonDAO(){
        return personDAO;
    }
}