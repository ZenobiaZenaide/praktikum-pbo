/*
	Nama : Zenobia Wirandi Zenaide
	NIM : 24060121140164
	Deskripsi : objek kubus, turunan dari bujursangkar
*/

package org.bangunruang;

import org.bangundatar.BujurSangkar;

public class Kubus {
	private BujurSangkar permukaan;
	
	public Kubus(BujurSangkar permukaan){
		this.permukaan = permukaan;
	}
	
	public double hitungVolume(){
		double sisi = permukaan.getPanjangSisi();
		double volume = sisi * sisi * sisi;
		return volume;
	}

	public double hitungLuasAlas(){
		double luasAlas = permukaan.hitungLuas();
		return luasAlas;
	}
}