/**
 * Penulis : Zenobia Wirandi Zenaide
 * File : LambdaList.java
 * Deskripsi : implementasi lambda pada list, digunakan sebagai parameter pada method
 * tanggal : 06/06/2023
**/

public class LambdaList{
    public static void main(String[] args){
        ArrayList<String> mahasiswaList = new ArrayList<>();
        mahasiswaList.add("Adi");
        mahasiswaList.add("Bambang");
        mahasiswaList.add("Cici");
        mahasiswaList.add("Didi");

        //lambda digunakab sebagai parameter
        mahasiswaList.forEach((nama) -> System.out.println(nama));
    }
}