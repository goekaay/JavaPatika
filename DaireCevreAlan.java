import java.util.*;

public class DaireCevreAlan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int yariCap, aci;
		double pi = 3.14, alan, cevre, sonuc;
		
		System.out.println("Dairenin yaricapini giriniz: ");
		yariCap = s.nextInt();
		System.out.println("Merkez a��s�n�n derecesini giriniz:");
		aci = s.nextInt();
		
		alan = pi * yariCap * yariCap;
		cevre = 2 * pi * yariCap;
		sonuc = (pi*(yariCap * yariCap) * aci)/360;
		
		
		System.out.println("Dairenin alan�="+ alan +"\nDairenin �evresi="+cevre);
		System.out.println("Daire diliminin alan�= "+sonuc);
		

	}

}
