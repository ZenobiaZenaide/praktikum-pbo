/*     Nama : Zenobia Wirandi Zenaide
	 NIM : 24060121140164
	 Deskripsi : menghitung luas bangun datar segitiga
*/

package org.bangundatar;

import org.poligon.Poligon;

public class Segitiga extends Poligon{
	private double alas,tinggi;

	public Segitiga(double alas, double tinggi, int JumlahSisi){
	this.alas = alas;
	this.tinggi = tinggi;
	this.jumlahSisi = jumlahSisi;
}

// masukkan rumus luas segitiga

public double hitungluas(){
	return (alas * tinggi)/2;

public void printInfo(){
	System.out.println("Jumlah sisi Segitia = " + this.getJumlahSisi());
}
	

