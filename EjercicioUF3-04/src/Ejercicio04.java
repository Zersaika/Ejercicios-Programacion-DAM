
public class Ejercicio04 {

	public static void main(String[] args) {
		int c;
		int cont=0;
		do {
			int num = (int)(Math.random()*10 + 1);
			 System.out.println ("Número: " + num);
			 c=num;
			 cont = cont+1;
		}while (c != 7);  
		System.out.println("Han salido "+cont +" números");
	        
		
	}

}
