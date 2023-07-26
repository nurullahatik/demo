package homeworks;

import java.util.Scanner;

public class MaasHesabı {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Iscinin calistigi gun sayisi : ");
		int gün = scan.nextInt();
		
		Odevler maas = new Odevler();
		
		int verilecek_maas = maas.maasHesapla(gün);
		System.out.println("verilecek toplam ucret : " + verilecek_maas);

	}

}
