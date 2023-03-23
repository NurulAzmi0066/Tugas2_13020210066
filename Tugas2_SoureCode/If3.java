/*NIM 	: 13020210066
Nama	: Nurul Azmi
Hari/tgl: Selasa/14 maret 2023
Jam	: 13.04*/

import java.util.Scanner;

public class If3{
	public static void main(String[] args){
		int a;
		Scanner masukan = new Scanner(System.in);
		System.out.print ("Contoh IF tiga kasus \n");
		System.out.print ("Ketikkan suatu nilai integer : ");
		a = masukan.nextInt();
		if(a>0){
			System.out.println ("Nilai a Positif " + a);
		}else if (a==0){
			System.out.println ("Nilai Nol " + a);
		}else{
			System.out.println ("Nilai a Negatif " + a);
		}		
	}
}