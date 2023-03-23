/*NIM	: 13020210066
Nama	: Nurul Azmi
Hari/tgl:Rabu/15 Maret 2023
Waktu	: 01:10*/

import java.util.Scanner;

public class PrintXRepeat {
	public static void main(String[] args) {
		int Sum;
		int x;
		Scanner masukan=new Scanner(System.in);
		System.out.print ("Masukkan nilai x (int), akhiri dg 999 : ");
		x = masukan.nextInt(); 

		if (x == 999){
			System.out.print("Kasus kosong \n");
		}else {
		Sum = 0;
		do{
			Sum = Sum + x; 
			System.out.print ("Masukkan nilai x (int), akhiri dg 999 : ");
			x = masukan.nextInt(); 
		} while (x != 999); 
			System.out.println ("Hasil penjumlahan = "+Sum);

		}
	}
}