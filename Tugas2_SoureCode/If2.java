/*NIM 	: 13020210066
Nama	: Nurul Azmi
Hari/tgl: Selasa/14 maret 2023
Jam	: 12.52*/

import java.util.Scanner;

public class If2 {
	public static void main(String[] args){
		int a;
		Scanner masukan = new Scanner (System.in);
		System.out.print ("Contoh IF dua Kasus\n");
		a = masukan.nextInt();

		if (a>=0){
			System.out.println("Nilai a positif " + a);
		}else{
			System.out.println("Nilai a negatif " + a);
		}
		
	}
}