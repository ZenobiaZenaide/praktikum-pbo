/*
	Nama : Zenobia Wirandi Zenaide
	NIM : 24060121140164
	Deskripsi : Main class Kubus.java
*/

package org.main;

import org.bangundatar;
import org.bangunruang;

public class MKubus{
	public static void main(String[] args){
		BujurSangkar bujurSangkar = new BujurSangkar(4);
		Kubus kubus = new Kubus(bujurSangkar);

		int jumlahSisi = bujurSangkar.getJumlahSisi();
		
		double luasAlas = kubus.hitungLuasAlas();
		System.out.println("Luas Permukaan kubus dengan panjang masing - masing sisi " + jumlahSisi + " + 		luasAlas);

		double volumeKubsu = kubus.hitungVolume();
		System.out.println("Volume Kubus dengan panjang sisi " + jumlahSisi + " satuan : " + volumeKubus);
		}
}
