import java.util.Scanner;
import java.util.StringTokenizer;

public class Ejercicio03 {

	public static void main(String[] args) {
		String palabra = " ";
		String fin="fin";
		Scanner lector = new Scanner(System.in);
		StringBuilder x = new StringBuilder();
		do {
			System.out.println("Escribe un texto: ");
			palabra = lector.nextLine();
        switch(palabra) 
        { 
            case "fin": 
            	StringTokenizer fin1 = new StringTokenizer(x.toString().toUpperCase());
                while (fin1.hasMoreTokens()) {
                    System.out.println(fin1.nextToken());
                }
                break; 
            case "Fin": 
            	StringTokenizer fin2 = new StringTokenizer(x.toString().toUpperCase());
                while (fin2.hasMoreTokens()) {
                    System.out.println(fin2.nextToken());
                }
                break; 
            case "FIN": 
            	StringTokenizer fin3 = new StringTokenizer(x.toString().toUpperCase());
                while (fin3.hasMoreTokens()) {
                    System.out.println(fin3.nextToken());
                }
                break; 
            default: 
            	System.out.println("Longitud: "+palabra.length());
            	x.append(palabra+" ");
            	
        } 
    } while(!palabra.equalsIgnoreCase(fin));
		lector.close();
  }
}