package org.main;

import org.bangundatar.*;

public class MPoligon{
	public static void main(String[] args){
		PersegiPanjang persegi = new PersegiPanjang(10,10,4);
		System.out.println("Perhitungan Persegi Panjang");
		persegi.printInfo();
		System.out.println("Luas Persegi Panjang : " + persegi.hitungLuas());

		Segitiga segtiga = new Segitiga(8,8,3);
		System.out.println("Perhitungan Segitiga");
		segitiga.printInfo();
		System.out.println("Luas Segitiga = " + segitiga.hitungluas());
	}
}

