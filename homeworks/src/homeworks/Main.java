package homeworks;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		Scanner scan = new Scanner(System.in);
		
		Sıcaklık celcius = new Sıcaklık();
		
		System.out.println("Dereceyi giriniz");
		float derece = scan.nextFloat();
		
		double gelenDeger = celcius.converter(derece);
		System.out.println(gelenDeger);
		*/
		Odevler rec = new Odevler();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Uzun kenarı giriniz");
		float uzun = scan.nextFloat();
		System.out.println("Kısa kenarı giriniz");
		float kısa = scan.nextFloat();
		
		rec.hesapla(uzun, kısa);
		
		
		
	}

}
