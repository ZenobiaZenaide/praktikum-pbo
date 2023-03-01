// Nama : Zenobia Wirand Zenaide
// NIM : 24060121140164
// Deskripsi : pembuatan metode overloading


public class MTitik {

	public static void main(String[] args) {
		Titik t1;
		Titik t2;
		Titik t3;

		t1 = new Titik();
		t2 = new Titik();
		t3 = new Titik();

		t1.setAbsis(1.0);
		t1.setOrdinat(2.0);

		t2.setAbsis(4.0);
		t2.setOrdinat(9.0);

		t3.setAbsis(5.0);
		t3.setOrdinat(6.0);

		System.out.println("Titik pertama");
		System.out.println("t1.x = " + t1.getAbsis());
		System.out.println("t1.y = " + t1.getOrdinat());
		System.out.println(" \n");
	
		System.out.println("Titik kedua");
		System.out.println("t2.x = " + t2.getAbsis());
		System.out.println("t2.y = " + t2.getOrdinat());
		System.out.println(" \n");

		System.out.println("Titik ketiga");
		System.out.println("t3.x = " + t3.getAbsis());
		System.out.println("t3.y = " + t3.getOrdinat());
		System.out.println(" \n");

		System.out.println("Jumlah Titik adalah = "+ t1.getCounterTitik());
	}
}