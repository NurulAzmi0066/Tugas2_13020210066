/*NIM 	: 13020210066
Nama	: Nurul Azmi
Hari/tgl: Selasa/14 maret 2023
Jam	: 17:15*/

import java.util.Scanner;

public class PrintWhile1{
	public static void main(String[] args){
		int N;
		int i = 1;
		Scanner masukan = new Scanner(System.in);

		System.out.print ("Nilai N > 0 = ");
		N = masukan.nextInt();
		System.out.print("Print i dengan WHILE (ringkas) : \n");
		while (i <= N){
			System.out.print(i++);
		}
	}

}

