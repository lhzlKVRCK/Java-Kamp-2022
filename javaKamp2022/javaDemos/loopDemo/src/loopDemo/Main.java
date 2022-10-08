package loopDemo;

public class Main {

	public static void main(String[] args) {
		//for
		String forDongu1 = "Yeni For Döngüsü";
		String forDongu2 = "For Döngüsü Bitti";
		String whileDongu1 = "Yeni While Döngüsü";
		String whileDongu2 = "While Döngüsü Bitti";
		
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
		System.out.println(forDongu1);
		
		for(int i=2;i<10;i+=2) {
			System.out.println(i);
		}
		System.out.println(forDongu1);
		
		for(int i=1;i<=10;i+=2) {
			System.out.println(i);
		}
		System.out.println(forDongu1);
		
		for(int i=1;i<=10;i+=3) {
			System.out.println(i);
		}
		System.out.println(forDongu2);
		
		
		//while
		int i = 2;
		while(i<10) {
			System.out.println(i);
			i+=2;
		}
		System.out.println(whileDongu2);
		
		//Do-While
		int j = 1;
		do {
			System.out.println(j);
			j+=2;
		}while(j<10);
		System.out.println("Do-While Döngüsü Bitti");
	}

}
