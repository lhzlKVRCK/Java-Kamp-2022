package sayıBulma;

public class Main {

	public static void main(String[] args) {
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
			System.out.println("Sayı mevcuttur");
		}else {
			System.out.println("Sayı mevcut değildir");
		}

	}

}
