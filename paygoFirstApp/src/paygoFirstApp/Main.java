package paygoFirstApp;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("kdv'si hesaplanmak istenilen fiyat:");
		Scanner scan = new Scanner(System.in);
		int fiyat = scan.nextInt();
		
		System.out.println("KDV oranini seciniz:");
		System.out.println("1- %1 kdv");
		System.out.println("2- %10 kdv");
		System.out.println("3- %20 kdv");
		
		int kdv_ratio = scan.nextInt();
		
		float kdv_amount = 0;
		
		switch (kdv_ratio) {
		case 1: {
			kdv_amount = (fiyat * 1)/100;
			break;
		}
		case 2:{
			kdv_amount = (fiyat * 10)/100;
			break;
		}
		case 3:{
			kdv_amount = (fiyat * 20)/100;
			break;
		}
			
		default:
			throw new IllegalArgumentException("Unexpected value: " + kdv_ratio);
		}
		
		System.out.println("hesaplanan kdv tutari : " + kdv_amount);
	
		
	}

}
