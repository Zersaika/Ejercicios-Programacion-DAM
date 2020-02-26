package com.itt.arte;
import java.util.Scanner;

public class Principal {

	private static Scanner lector;
    private static Obra obra = new Obra("La cena de los idiotas", "Comedia", 95);
    private static Teatro teatro = new Teatro("C/ Sol, 45", 300, 2, obra, 30);

    public static void main(String[] args) {
    	lector = new Scanner(System.in);
        char opc;
        do {
        	opc = mostrarMenu();
            switch (opc) {

            	case '1':
            		System.out.println(teatro.verProgramacion());
            		break;
            		
                case '2':
                	System.out.println(teatro.verLocalidades());
                	break;
                	
                case '3':
                	System.out.println(teatro.verLocalidadesOcupadas());
                	break;
                	
                case '4':
                	int f=0,b,ed;
                	String n,tlf;
                	Espectador e;
                	System.out.println("¿En qué fila te quieres sentar (0 - 4)?");
                	try {
                	f=Integer.parseInt(lector.next());
                	while ((f<0 || f>5)) {
                	System.out.println("Introduce un valor entre 0 y 4");
                	f=Integer.parseInt(lector.next());}}
                	catch (NumberFormatException exception) {
                	System.out.println("Deberia de haber dentro un numero....");
                	}
                	System.out.println("¿En qué butaca te quieres sentar (0 - 9)?");
                	b=Integer.parseInt(lector.next());
                    while ((b<0 || b>10)) {
                	System.out.println("Introduce un valor entre 0 y 9");
                    b=Integer.parseInt(lector.next());
                    }
                	System.out.println("Introduce tu nombre:");
                	n=lector.next();
                	System.out.println("Introduce tu teléfono:");
                	tlf=lector.next();
                	System.out.println("Introduce tu edad:");
                	ed=Integer.parseInt(lector.next());
                	e=new Espectador(n, tlf, ed);
                	System.out.println(teatro.venderLocalidad(f, b, e));
                	break; 
                	
                case '5':
                	System.out.print("¿Fila (0-4)?");
					f=lector.nextInt();  
					System.out.print("¿Butaca (0-9)?");
					b=lector.nextInt();
					System.out.print(teatro.cancelarLocalidad(f, b));
					break;

    			case '6':
    				System.out.println("¿Fila (0-4)?");
    				f=lector.nextInt();  
    				System.out.println("¿Butaca (0-9)?");
    				b=lector.nextInt();
    				teatro.consultarLocalidad(f, b);
    				System.out.println(teatro.consultarLocalidad(f, b));
    				break;
    				
    			case '7':
    				System.out.println("Recaudación: "+teatro.calcularRecaudacion());
    				break;
   
			   case '8':
				   	System.out.println("Hasta pronto");
				   	break;

                default:

            }

        } while (opc!='8');

        lector.close();

}

public static char mostrarMenu() {

              String opcion;

              System.out.println ("TEATRO LA BOMBILLA DE DON BLAS");

              System.out.println ("------------------------------");

              System.out.println ("1. Ver la programación actual");

              System.out.println ("2. Mostrar todas las localidades");

              System.out.println ("3. Mostrar localidades ocupadas");

              System.out.println ("4. Vender localidad");

              System.out.println ("5. Cancelar localidad");

              System.out.println ("6. Consultar localidad");

              System.out.println ("7. Calcular recaudación");

              System.out.println ("8. Terminar programa");

              System.out.println ("------------------------------");

              System.out.println ("¿Qué opción deseas?");

              opcion = lector.next();

              return opcion.charAt(0);

           }

}