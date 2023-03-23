/*
	Nama : Zenobia Wirandi Zenaide
	NIM : 24060121140164
	Deskripsi : objek bujur sangkar, turunan poligon
*/

package org.bangundatar;

import.org.poligon.Poligon;

public class BujurSangkar extends Poligon {
	private double panjangSisi;

	public BujurSangkar(double panjangSisi){
		this.jumlahSisi = 4;
		this.panjangSisi = panjangSisi;
	}

	public double hitungLuas(){
		return panjangSisi * panjangSisi;
	}
	public double getPanjangSisi(){
		return this.panjangSisi;
	}
}