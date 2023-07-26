package homeworks;

import java.util.Scanner;

public class Faktoriel {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Faktoriel hesaplanacak sayi giriniz : ");
		int fac = scan.nextInt();
		
		Odevler faktoriel = new Odevler();
		
		int gelenDeger = faktoriel.faktorielHesapla(fac);
		System.out.println("Fak : "  + gelenDeger);
		

	}

}
