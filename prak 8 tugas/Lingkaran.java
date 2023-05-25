/*
Nama : Zenobia Wirandi Zenaide
NIM : 24060121140164
Deskripsi : implementasi kelas lingkaran
*/

public class Lingkaran extends BangunDatar{
	private double jejari;
	
	public Lingkaran(double jejari){
		this.jejari = jejari;
	}
	public double hitungKeliling(){
		return 2*jejari*3.14;
	}
}