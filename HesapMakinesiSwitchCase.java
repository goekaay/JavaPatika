import java.util.Scanner;

public class HesapMakinesiSwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1, n2, select;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("�lk say�y� giriniz: ");;
		n1= s.nextInt();
		System.out.println("�kinci say�y� giriniz: ");
		n2=s.nextInt();
		
		System.out.println("1-Toplama \n2-��karma\n3-�arpma\n4-b�lme");
		System.out.println("Se�iminiz nedir: ");
		select = s.nextInt();
		
			switch(select) {
			case 1:
				System.out.println("Toplam = " + (n1+n2));
				break;
			case 2:
				System.out.println("��karma = " + (n1-n2));
				break;
			case 3:
				System.out.println("�arp�m = " + (n1*n2));
				break;
			case 4:
				if(n2 != 0) {
					System.out.println("B�l�m = " + (n1/n2));
				}
				else {
					System.out.println("Say� 0'a b�l�nemez!");
				}
				break;
				default:
					System.out.println("Yanl�� Se�im Yap�ld�");
			}
			
	}

}
