package homeworks;

public class Odevler {
	
	public void hesapla(float short_edge , float long_edge) {
		
		float perimeter = (short_edge*2) + (long_edge*2);
		System.out.println("Dikdörtgen cevresi : " + perimeter);
	}
	
	public int faktorielHesapla(int num) {
		int fakResult=1;
		if(num == 0) {
			fakResult = 0;
		}
		else {
			for(int i =1; i<=num; i++) {
				fakResult = fakResult* i;
			}
		}
		
		return fakResult;
	}
	
	public void harfSayisiBul(String word, char letter) {
		
		int boyut = word.length();
		char harfler[]= new char[boyut];
		
		for(int i = 0; i < boyut; i++) {
			
			harfler[i] = word.charAt(i);// 0-a , 1-b
			
		}
		int counter = 0;
		
		for(int i = 0; i<boyut; i++) {
			
			if(harfler[i] == letter) {
				counter++;
			}
		}
		System.out.println(letter + " harfi Adedi : " + counter);

	}
	public int maasHesapla(int gün) {
		
		int work_hour = gün * 8;
		int mesai = 0;
		int maas = 1750;
		if(work_hour <= 160) {
			
			maas = maas;
		}
		else {
			mesai = (work_hour - 160)*10;
			maas = maas + mesai;
		}
	
	return maas;
	}
}
