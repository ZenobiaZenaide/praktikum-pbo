/*
Nama : Zenobia Wirandi Zenaide
Nama file : PegawaiDanGaji.java
Deskripsi : Kelas main
*/

public class PegawaiDanGaji{
	public static void main(String[] args){
		Pegawai pegawai = new Programmer("Mira");
		Pegawai pegawai2 = new Manajer("Joko");
		Pegawai Pegawai3 = new Manajer('Argo");

		Payroll payroll = new Payroll();
		payroll.cetakGaji(pegawai);
		payroll.cetakGaji(pegawai2);
		payroll.cetakGaji(pegawai3);
		}
}