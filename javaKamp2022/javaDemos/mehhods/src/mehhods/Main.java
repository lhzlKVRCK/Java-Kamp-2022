package mehhods;

public class Main {

	public static void main(String[] args) {
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();
	}
	
	public static void sayiBulmaca() {
		int[] sayılar = new int[] {1,3,5,7,9,0};
		int aranacak = 5;
		boolean varMi=false;
		
		for(int sayi : sayılar) {
			if(sayi==aranacak) {
				varMi=true;
				break;
			}
		}
		
		if(varMi) {
			mesajVer(aranacak);
		}else {
			System.out.println("Sayı mevcut değildir: "+aranacak);
		}
		
		
	}
	
	public static void mesajVer(int aranacak) {
		System.out.println("Sayı mevcuttur" + aranacak);
	}
}
