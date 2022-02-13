package DataTypes;

import java.util.*;

/**
 * Program ini dibuat untuk menentukan apakah angka yang diinput oleh user
 * capable pada tipe data byte, short, int atau long dan atau tidak capable
 * di tipe data manapun yang sudah disebutkan diatas.
 * 
 * @author Falia Davina Gustaman
 * @since 2022-02-10
 *
 */

public class dataTypes {

	public static void main(String[] args) {
		//Deklarasi
		String angka[] = new String[5];
		Scanner input = new Scanner(System.in);
		
		//Input Jumlah Data
		int jumlahAngka = input.nextInt();
		
		//Input data ke Array
		for(int i=0;i<jumlahAngka;i++) {
			angka[i]=input.next();	
		}
		
		//Pengecekan Data
		for(int i=0;i<jumlahAngka;i++) {
			try {
				Long number = Long.parseLong(angka[i]);
				if(number>=-128 && number<=127) {
					System.out.println(number + " can be fitted in : ");
					System.out.println("* byte");
					System.out.println("* short");
					System.out.println("* int");
					System.out.println("* long");
				}else if(number>=-32768 && number<=32767) {
					System.out.println(number + " can be fitted in : ");
					System.out.println("* short");
					System.out.println("* int");
					System.out.println("* long");
				}else if(number>=-2147483648 && number<=2147483647) {
					System.out.println(number + " can be fitted in : ");
					System.out.println("* int");
					System.out.println("* long");
				}else{
					System.out.println(number + " can be fitted in : ");
					System.out.println("* long");
				}
			} catch (Exception ex1) {
				System.out.println(angka[i] + " can't be fitted anywhere.");
			}
		}
	}

}
