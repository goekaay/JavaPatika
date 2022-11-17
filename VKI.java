import java.util.*;

public class VKI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int kilo;
		double boy, indeks;
		
		System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz:");
		boy = s.nextDouble();
		
		System.out.println("Lütfen kilonuzu giriniz:");
		kilo = s.nextInt();
		
		
		indeks = kilo / (boy*boy);
		
		System.out.println("Vücut Kitle Ýndeksiniz:"+indeks);

	}

}
