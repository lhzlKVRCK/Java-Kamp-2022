package mukemmelSayi;

public class Main {

	public static void main(String[] args) {
		
		int number = 6;
		int total = 0;
		
		if(number <= 1) {
			System.out.println("Geçersiz sayı");
			return;
		}
		
		for (int i=1; i<number; i++) {
			if(number % i ==0) {
				total = total + i;
			}
		}
		if(total == number) {
			System.out.println("Mükemmel Sayı");
		}else {
			System.out.println("Mükemmel Sayı Değil");
		}
	}

}
