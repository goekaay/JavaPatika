import java.util.Scanner;

public class HesapMakinesiSwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1, n2, select;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Ýlk sayýyý giriniz: ");;
		n1= s.nextInt();
		System.out.println("Ýkinci sayýyý giriniz: ");
		n2=s.nextInt();
		
		System.out.println("1-Toplama \n2-Çýkarma\n3-Çarpma\n4-bölme");
		System.out.println("Seçiminiz nedir: ");
		select = s.nextInt();
		
			switch(select) {
			case 1:
				System.out.println("Toplam = " + (n1+n2));
				break;
			case 2:
				System.out.println("Çýkarma = " + (n1-n2));
				break;
			case 3:
				System.out.println("Çarpým = " + (n1*n2));
				break;
			case 4:
				if(n2 != 0) {
					System.out.println("Bölüm = " + (n1/n2));
				}
				else {
					System.out.println("Sayý 0'a bölünemez!");
				}
				break;
				default:
					System.out.println("Yanlýþ Seçim Yapýldý");
			}
			
	}

}
