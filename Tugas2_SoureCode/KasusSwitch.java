/*NIM 	: 13020210066
Nama	: Nurul Azmi
Hari/tgl: Selasa/14 maret 2023
Jam	: 13.18*/

import java.util.Scanner;

public class KasusSwitch{
	public static void main(String[] args){
		char cc;
		Scanner masukan = new Scanner(System.in);
		System.out.print ("Ketikkan Sebuah Huruf, akhiri dengan RETURN\n");
		cc = masukan.next().charAt(0);
		switch(cc){
			case 'a' : {System.out.print ("yang anda ketikkan adalah a\n");
			break; }
			case 'u' : {System.out.print ("yang anda ketikkan adalah u\n");
			break; }
			case 'e' : {System.out.print ("yang anda ketikkan adalah e\n");
			break; }
			case 'i' : {System.out.print ("yang anda ketikkan adalah i\n");
			break; }
			case 'o' : {System.out.print ("yang anda ketikkan adalah o\n");
			break; }
			default :
				System.out.print ("Yang anda ketikkan adalah huruf mati\n");
		}


	}
}