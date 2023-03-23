/*NIM 	: 13020210066
Nama	: Nurul Azmi
Hari/tgl: Selasa/14 maret 2023
Jam	: 12.41*/

import java.util.Scanner;

public class If1{
	public static void main(String[] args){
		Scanner masukan =new Scanner(System.in);
		int a;

	System.out.print ("Contoh IF satu kasus \n");
	System.out.print ("Ketikkan suatu nilai integer : ");
	a = masukan.nextInt();
	if (a >= 0)
	System.out.print ("\n Nilai a positif " + a);
	}
}