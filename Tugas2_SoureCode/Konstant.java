/*NIM	: 13020210066
Nama	: Nurul Azmi
Hari/tgl: Rabu/14 Maret 2023
Jam	: 14:36 */

import java.util.Scanner;

public class Konstant{
	public static void main(String[] args){
		final float PHI = 3.1415f;
		float r ;
		Scanner masukan = new Scanner(System.in);
		System.out.print ("Jari-jari lingkaran = " );
		r = masukan.nextFloat();
		System.out.print("Luas Lingkaran = "+ (PHI * r * r) + "\n");
		System.out.print ("Akhir program \n");

	}
}