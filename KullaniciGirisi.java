import java.util.*;
public class KullaniciGirisi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		String username, password;
		String inpusername, inppassword;
		String resetpassword,newpassword;
		
		username = "patika";
		password = "java123";
		
		System.out.println("Kullan�c� Ad�n� Giriniz: ");
		inpusername = s.nextLine();
		System.out.println("�ifrenizi giriniz");
		inppassword = s.nextLine();
		
		if(inpusername.equals(username) && inppassword.equals(password)) {
			System.out.println("Ho� Geldiniz...");
		}
		
		else if(inpusername.equals(username) && !inppassword.equals(password)) {
			System.out.println("Yanl�� �ifre girildi. Yenilemek ister misiniz?");
			resetpassword = s.nextLine();
			
			if(resetpassword.equals("evet")) {
				System.out.println("Yeni �ifrenizi giriniz");
				newpassword = s.nextLine();
				
				if(newpassword.equals(password)) {
					System.out.println("Yeni �ifre eskisiyle ayn� olamaz!");
				}
				else {
					password = newpassword;
					System.out.println("�ifreniz de�i�tirildi.");
				}
			}
		}
		else {
			System.out.println("Yanl�� kullan�c� ad� ya da �ifre!");
		}
		
		
	}		
}
