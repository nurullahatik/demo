package homeworks;

import java.util.Scanner;

public class HarfSayisiBulma {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("harf adedi istenilen kelimeyi giriniz : ");
		String word = scan.next();
		
		System.out.println("sayisini ogrenmek istediginiz harfi giriniz : ");
		char letter = scan.next().charAt(0);
		
		Odevler harfBul = new Odevler();
		
		harfBul.harfSayisiBul(word, letter);

	}

}
