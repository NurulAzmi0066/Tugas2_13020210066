/*NIM 	: 13020210066
Nama	: Nurul Azmi
Hari/tgl: Selasa/14 maret 2023
Jam	: 15.03*/

import java.util.Scanner;

public class PriFor{
	public static void main(String[] args){
		int i, N;
		Scanner masukan = new Scanner (System.in);
		System.out.print("Baca N, Print 1 s/d N \n");
		System.out.print ("N = ");
		N = masukan.nextInt();

		for (i = 1; i <= N; i++){
		System.out.println(i);
		}
		System.out.println ("Akhir Program\n");
	}
}