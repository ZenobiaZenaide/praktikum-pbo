/*
Nama : Zenobia Wirandi Zenaide
Nama file : Manajer.java
Deskripsi : subclass berupa manajer turunan superclass pegawai
*/

public class Manajer extends Pegawai{
	private int tunjangan = 700000;

	public Manajer(String nama){
		setNama(nama);
	}

	public void tampilData(){
		super.tampilData();
		System.out.println("Tunjangan: " + tunjangan);
	}
}