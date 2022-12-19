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
		
		System.out.println("Kullanýcý Adýný Giriniz: ");
		inpusername = s.nextLine();
		System.out.println("Þifrenizi giriniz");
		inppassword = s.nextLine();
		
		if(inpusername.equals(username) && inppassword.equals(password)) {
			System.out.println("Hoþ Geldiniz...");
		}
		
		else if(inpusername.equals(username) && !inppassword.equals(password)) {
			System.out.println("Yanlýþ þifre girildi. Yenilemek ister misiniz?");
			resetpassword = s.nextLine();
			
			if(resetpassword.equals("evet")) {
				System.out.println("Yeni þifrenizi giriniz");
				newpassword = s.nextLine();
				
				if(newpassword.equals(password)) {
					System.out.println("Yeni þifre eskisiyle ayný olamaz!");
				}
				else {
					password = newpassword;
					System.out.println("Þifreniz deðiþtirildi.");
				}
			}
		}
		else {
			System.out.println("Yanlýþ kullanýcý adý ya da þifre!");
		}
		
		
	}		
}
