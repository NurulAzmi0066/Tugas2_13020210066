/*NIM : 13020210066
Nama : Nurul Azmi
Hari/Tanggal : Rabu/ 22 Maret 2023
Jam : 22:27*/

import java.util.Scanner;

public class Tempair{
	public static void main(String[] args){
		int T;
		Scanner masukan=new Scanner(System.in);
		System.out.print("Contoh IF tiga kasus");
		System.out.print ("Temperatur (der. C) = ");
		T=masukan.nextInt();
		if (T<0){
			System.out.print("Wujud air beku \n"+T);
		}else if ((0 <= T) && (T<=100)){
			System.out.print("Wujud air cair \n"+T);
		}else if (T>100){
			System.out.print("Wujud air uap/gas \n"+T);
		};
	}
}