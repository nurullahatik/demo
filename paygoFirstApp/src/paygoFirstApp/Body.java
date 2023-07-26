package paygoFirstApp;

import java.util.Scanner;

public class Body {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Boyunuzu giriniz:");
		float high = scan.nextFloat();
		
		System.out.println("Kilonuzu giriniz:");
		float weight = scan.nextFloat();
		
		double index = 0;
		
		index = high/weight;
		if(index <20) {
			System.out.println("zayif");
		}
		else if (index>20 && index<30) {
			System.out.println("normal");
		}
		else if (index>30 && index<40) {
			System.out.println("sisman");
		}
		else if (index>40 && index<50) {
			System.out.println("obez");
		}
		else {
			System.out.println("Acilen yemek yemeyi birakiniz");
		}

	}

}
