/*NIM : 13020210066
Nama : Nurul Azmi
Hari/Tanggal : Selasa/ 14 Maret 2023
Jam : 11:25*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.*;
public class BacaString{
	public static void main(String[] args) throws IOException {
		String str;
		
	BufferedReader datAIn = new BufferedReader (new InputStreamReader (System.in));

	System.out.print ("\n Baca string dan Integer : \n");
	System.out.print ("masukan sebuah string : ");
	str = datAIn.readLine();
	System.out.print("String yang dibaca : "+ str);
	}


}