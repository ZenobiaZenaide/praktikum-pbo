/*
Nama : Zenobia Wirandi Zenaide
Nama file : Programmer.java
Deskripsi : subclass programmer turunan superclass pegawai
*/

public class Programmer extends Pegawai{
	private int bonus = 450000;

	public Programmer(String nama){
		setNama(nama);
	}


	public void tampildata(){
		super.tampilData();
		System.out.println("Bonus: " +bonus);
	}
}