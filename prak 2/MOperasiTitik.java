class MOperasiTitik{
	public static void main(String[]args){
		Titik t1 = new Titik(4.0, 4.0);
		OperasiTitik op = new OperasiTitik();
		
		System.out.println("Titik pertama");
		System.out.println("T1 x = " + t1.getAbsis());
		System.out.println("T1 y = " + t1.getOrdinat());

		
		op.refleksiX(t1);
		System.out.println("\nTitik setelah refleksi sumbu X");
		System.out.println("T1 x = " + t1.getAbsis());
		System.out.println("T1 y = " + t1.getOrdinat());
		
		op.refleksiY(t1);
		System.out.println("\nTitik setelah refleksi sumbu Y");
		System.out.println("T1 x = " + t1.getAbsis());
		System.out.println("T1 y = " + t1.getOrdinat());
	}
}