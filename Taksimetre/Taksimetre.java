import java.util.Scanner;

public class Taksimetre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int km;
		double kmlikUcret = 2.20, total, baslangicUcret = 10;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Mesafeyi KM Cinsinden Giriniz: ");
		km = s.nextInt();
		
		total = (km * kmlikUcret);
		total += baslangicUcret;
		
		total = (total < 20) ? 20 : total;
		
		System.out.println("Toplam Tutar: "+ total);
		
		
		

	}

}
