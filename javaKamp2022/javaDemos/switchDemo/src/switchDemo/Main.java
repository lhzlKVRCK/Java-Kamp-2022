package switchDemo;

public class Main {

	public static void main(String[] args) {
		char grade = 't';

		switch (grade) {
		case 'A':
		case 'a':
			System.out.println("Mükemmel : Geçtiniz");
			break;
		case 'B':
		case 'b':
			System.out.println("Güzel : Geçtiniz");
		case 'C':
		case 'c':
			System.out.println("İyi : Geçtiniz");
			break;
		case 'D':
		case 'd':
			System.out.println("Fena Değil : Geçtiniz");
			break;
		case 'F':
		case 'f':
			System.out.println("Kaldınız");
			break;
		default:
			System.out.println("Geçersiz Not Birimi");

		}
	}

}
