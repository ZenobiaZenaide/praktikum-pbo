/* 
	Nama : Zenobia Wirandi Zenaide
	NIM : 24060121140164
	Deskripsi : implementasi IArea = menghitung luas 
*/

import static java.lang.math.PI;

class Lingkaran implements IArea{
	private double jejari;

	public Lingkaran(double r){
		jejari = r;
	}
	public douuble hitungluas(){
		return PI*jejari*jejari;
	}
}