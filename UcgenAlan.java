import java.util.Scanner;

public class UcgenAlan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		double kenar1, kenar2, kenar3, cevre, alan, u;
		
		System.out.println("1. kenar�n uzunlu�unu giriniz:");
		kenar1 = s.nextDouble();
		
		System.out.println("2. kenar�n uzunlu�unu giriniz:");
		kenar2 = s.nextDouble();
		
		System.out.println("3. kenar�n uzunlu�unu giriniz:");
		kenar3 = s.nextDouble();
		
		u = (kenar1 + kenar2 + kenar3) /2;
		cevre = 2*u;
		System.out.println("�evre uzunlu�u: "+ cevre);
		
		alan = Math.sqrt(u*(u-kenar1)*(u-kenar2)*(u-kenar3));
		System.out.println("Alan:"+alan);
		

	}

}
