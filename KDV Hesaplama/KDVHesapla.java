import java.util.Scanner;

public class KDVHesapla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float tutar, kdvOran = (float) 0.18, kdvTutar, kdvliTutar;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Ücreti giriniz: ");
		tutar = s.nextFloat();
		
		kdvTutar = tutar * kdvOran;
		kdvliTutar = tutar + kdvTutar;
		
		System.out.println("KDV'siz Fiyat : "+ tutar);
		System.out.println("KDV'li Fiyat :"+ kdvliTutar);
		System.out.println("KDV Tutarý :"+ kdvTutar);
		

	}

}
