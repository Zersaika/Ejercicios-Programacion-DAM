import java.util.Scanner;
public class Ejercicio02 {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
        String texto;
        int c=0;
        System.out.println("Escribe un texto:");
        texto = lector.nextLine();
        System.out.println("Longitud: "+texto.length());
        System.out.println("Mayusculas: "+texto.toUpperCase());
        String[] cadena = texto.split(" ");
        System.out.println("Palabra a palabra:");
        for (int i=0; i<cadena.length; i++) { 
        	System.out.println(cadena[i]);
        }
        char letra[]  = texto.toCharArray();
        for (int i=0;i<texto.length();i++) {
			if (Character.isLowerCase(letra[i])) {
				c=c+1;}
        }
        System.out.println("Hay "+c+" letras minusculas");
        int finTexto = texto.length();
		System.out.println("EL TRIANGULO");
		for (int i =0;i<finTexto;i++) {
			texto = texto.substring(0, finTexto - i);
			System.out.println(texto);	
		}
		lector.close();	
        }
	}
