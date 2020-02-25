
public class Ejercicio05 {

	public static void main(String[] args) {
		int num = (int)(Math.random()*5 + 1);
		switch(num) {
		case 1:
			System.out.println("Buenos dias");
			break;
		case 2:
			System.out.println("Buenas tardes");
			break;
		case 3:
			System.out.println("Buenas noches");
			break;
		case 4:
			System.out.println("Hasta luego");
			break;
		case 5:
			System.out.println("Nos vemos");
			break;
			default:
				System.out.println("Hasta nunca");
		}
	}

}
