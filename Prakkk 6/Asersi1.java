/*
Nama : Zenobia Wirandi Zenaide
NIM : 24060121140164
Nama file : Asersi1.java
*/

public class Asersi1{
	public static void main(String[] args){
		int x = 0;
		if(x>0){
			System.out.println("x bilangan postif");
		}else{
			assert(x<0):"ada kesalahan kode";
			System.out.println("x bilangan negatif");
		}
	}
}