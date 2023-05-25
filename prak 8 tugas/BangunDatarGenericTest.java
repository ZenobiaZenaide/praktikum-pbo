/*
Nama : Zenobia Wirandi Zenaide
NIM : 24060121140164
Deskripsi : kelas main untuk generik dari bangun datar
*/

public class BangunDatarGenericTest{
	public static void main(String[] args){
		Lingkaran 1 = new Lingkaran(2);
		BangunDatarGeneric<Lingkaran> bdg = 
				new BangunDatarGeneric<Lingkaran>();
		bdg.set(1);
		System.out.println("keliling lingkaran : "
									+bdg.hitungKeliling());
		System.out.println("tipe generic : "
							+bdg.get().getClass().getName());
	}
}