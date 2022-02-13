package String;

import java.util.*;

/**
 * Program ini akan menhasilkan 3 output yaitu :
 * 1. Banyak karakter dari string yang diinput oleh user
 * 2. Apakah String A lebih besar dari string B berdasarkan leksikografi nya
 * 3. String A dan String B satu line dipisahkan oleh spasi dan menggunakan uppercase di huruf awalnya
 * 
 * @author Falia Davina Gustaman
 * @since 2022-02-12
 *
 */

public class string {

	public static void main(String[] args) {
		//Deklarasi
		String word[] = new String[2];
		Scanner input = new Scanner(System.in);
		
		//Input User
		for(int i=0;i<2;i++) {
			word[i] = input.next();
		}
		
		//Jumlah String
		int jumlah = word[0].length();
		int jumlah1 = word[1].length();
		int total = jumlah+jumlah1;
		System.out.println(total);
		
		//String Compare Alphabetically
		int compare = word[0].compareTo(word[1]);
		if (compare < 0) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}
		
		//Upper Case
		String upperKata = word[0].substring(0,1).toUpperCase() + word[0].substring(1);
		String upperKata2 = word[1].substring(0,1).toUpperCase() + word[1].substring(1);
		System.out.println(upperKata + " " + upperKata2);
	}
	
}
