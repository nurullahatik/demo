package homeworks;

public class Sıcaklık {
	
	double fah = 0;
	
	public double converter(float derece) {
		
		fah = (derece*1.8)+32;
		//System.out.println("Fahreneit degerimiz : " + fah);
		return fah; 
	}

}
