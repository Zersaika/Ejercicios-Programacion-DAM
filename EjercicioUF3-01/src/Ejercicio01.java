
public class Ejercicio01 {

	public static void main(String[] args) {
		int num1 = (int)(Math.random()*20+1); 
		int num2;
		int x=num1+15;
		int y=num1+5;
		if (num1<=15 && num1>=5) {
			num2=x;
			System.out.println( "El resultado es " + num2);
		}
		else {
			num2=y;
			System.out.println("El resultado es " + num2);
		}
		System.out.println("Variable 1"+num1);
		System.out.println("Variable 2"+num2);
	}

}
