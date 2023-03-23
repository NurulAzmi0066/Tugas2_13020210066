/*NIM 	: 13020210066
Nama	: Nurul Azmi
Hari/tgl: Selasa/14 maret 2023
Jam	: 15.32*/


import java.util.Scanner;
public class PrintRepeat{
	public static void main(String[] args){
	int N;
	int i;
	Scanner masukan = new Scanner(System.in);
	System.out.print ("Nilai N > 0 = ");
	N = masukan.nextInt();
	i = 1;
	System.out.print("Print i dengan REPEAT : \n");
	do{
		System.out.print(i+"\n");
		i++;	
	}
	
	while (i <= N);
	}

}