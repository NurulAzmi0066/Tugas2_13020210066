/*NIM 	: 13020210066
Nama	: Nurul Azmi
Hari/tgl: Selasa/14 maret 2023
Jam	: 15.11*/

import java.util.Scanner;

public class PrintIterasi{
	public static void main(String[] args){
	int N;
	int i;
	Scanner masukan = new Scanner(System.in);
	System.out.print ("Nilai N > 0 = ");
	N = masukan.nextInt();
	i = 1;

	System.out.print ("Print i dengan ITERATE : \n");
	for(;;){
		System.out.println(i);
		if(i == N)
			break;
		else {
			i++;
		}
	}
	

	}
}