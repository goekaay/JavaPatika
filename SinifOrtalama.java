import java.util.Scanner;

public class SinifOrtalama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int mat,fiz,kim,tur,tar,muz;
		
		System.out.println("Matematik Notunuzu Girin: ");
		mat = s.nextInt();
		
		System.out.println("Fizik Notunuzu Girin: ");
		fiz = s.nextInt();
		
		System.out.println("Kimya Notunuzu Girin: ");
		kim = s.nextInt();
		
		System.out.println("Türkçe Notunuzu Girin: ");
		tur = s.nextInt();
		
		System.out.println("Tarih Notunuzu Girin: ");
		tar = s.nextInt();
		
		System.out.println("Müzik Notunuzu Girin: ");
		muz = s.nextInt();
		
		int ort = (mat+fiz+kim+tur+tar+muz)/6;
		
		System.out.println("Derslerin ortalamasý = "+ort);
		
		boolean sonuc = ort<=60;
		System.out.println(sonuc?"Sýnýfta kaldý":"Sýnýfý geçti");
		
		

	}

}
