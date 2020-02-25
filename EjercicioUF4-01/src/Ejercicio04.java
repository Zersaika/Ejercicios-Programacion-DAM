import java.util.Scanner;
public class Ejercicio04 {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		String palabra;
		String palabra1;
		int contador=0;
		int contador2=0;
		String matrizingles[][]={
				{"bear", "oso"},
				{"cat", "gato"},
				{"cheetah", "guepardo"},
				{"dog", "perro"},
				{"eagle", "aguila"},
				{"fish", "pez"},
				{"frog", "rana"},
				{"horse", "caballo"},
				{"lion", "león"},
				{"lizard", "lagarto"},
				{"meerkat", "suricata"},
				{"monkey", "mono"},
				{"orangutan", "orangután"},
				{"panther", "pantera"},
				{"parrot", "loro"},
				{"pig", "cerdo"},
				{"tiger", "tigre"},
				{"toad", "sapo"},
				{"tortoise", "tortuga"},
				{"mare", "yegua"},
                                  };          
		    //for (int i=0; i<matrizingles.length; i++) {
			//for (int j=0; j<matrizingles[i].length; j++) {
			//System.out.println("Fila: "+i+" Columna: "+j); Para controlar los elementos que salian
			//System.out.println(matrizingles[i][j]); }
		
		System.out.println("TEST DE INGLES");
	  for (int i=0; i<matrizingles.length; i++) {
				System.out.println("Traduce: "+matrizingles[i][0]);
				palabra1=matrizingles[i][1];
				palabra = lector.nextLine();
				if(palabra.equals(palabra1)) {
					System.out.println("Bien!");
					contador=contador+1;
				}else{
					System.out.println("No, es "+matrizingles[i][1]);
					contador2=contador2+1;
				}  
     }lector.close();
	  System.out.println("FIN DEL TEST");
	  System.out.println("Has tenido "+contador+" aciertos");
      System.out.println("Has tenido "+contador2+" fallos");
   }
}

		

		
