package paygoFirstApp;

import java.text.NumberFormat;
import java.util.Iterator;
import java.util.Scanner;

public class Star {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("0 ile baslayan telefon numaranizi giriniz : ");
			String phone_num = scan.next();
			if(phone_num.length() ==11) {
				System.out.println("maskelemek istediginiz hane sayisi sondan olmak uzere");
				int mask_num = scan.nextInt();
				String new_mask="";
				for(int i = 0; i<mask_num; i++) {
					new_mask = new_mask + "*";
					
				}
				
				String newPhoneNumber = phone_num.substring(0,phone_num.length()-mask_num) + new_mask;
				
				System.out.println(newPhoneNumber);
				break;
				
			}
			
		}
		
		
		
		
		

		    
	}

}


    