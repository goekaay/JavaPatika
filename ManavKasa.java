import java.util.Scanner;

public class ManavKasa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int armut, elma, dmts, muz, ptlcn;
		double 	armutKilo = 2.14,
				elmaKilo = 3.67,
				dmtsKilo = 1.11,
				muzKilo = 0.95,
				ptlcnKilo = 5.00, tutar;
		
		System.out.println("Armut Ka� Kilo? :");
		armut = s.nextInt();
		System.out.println("Elma Ka� Kilo? :");
		elma = s.nextInt();
		System.out.println("Domates Ka� Kilo? :");
		dmts = s.nextInt();
		System.out.println("Muz Ka� Kilo? :");
		muz = s.nextInt();
		System.out.println("Patl�can Ka� Kilo? :");
		ptlcn = s.nextInt();
		
		tutar = (armut*armutKilo) + (elma*elmaKilo) + (dmts*dmtsKilo) + (muz*muzKilo) + (ptlcn*ptlcnKilo);
		
		System.out.println("Toplam Tutar : "+tutar+"TL");
		
		
		

	}

}
