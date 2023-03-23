/*NIM 	: 13020210066
Nama	: Nurul Azmi
Hari/tgl: Selasa/14 maret 2023
Jam	: 15.54*/

import java.util.Scanner;

public class PrintXinterasi{
	public static void main(String[] args){
		int Sum=0;
		int x;

		Scanner masukan = new Scanner(System.in);
		System.out.print("Masukkan nilai x (int), akhiri dg 999 : ");
		x = masukan.nextInt();
		if(x==999){
			System.out.print("Kasus Kosong \n");
		}else {
			Sum = x;
			for(;;){
				System.out.print("Masukan nilai x (int), akhiri dg 999 : ");
				x = masukan.nextInt();
				if(x==999)
					break;
				else{
					Sum = Sum + x;
				}
			}
		}

	}
}