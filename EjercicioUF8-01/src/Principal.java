import java.io.IOException;
import java.util.Scanner;

public class Principal {

              public static void main(String args[]) throws NumerosRojosException {

                            Scanner lector = new Scanner(System.in);

                            System.out.println("Vamos a crear una cuenta y realizar el primer ingreso de 100 euros");

                           CuentaBancaria miCuenta = new CuentaBancaria(38143, "Amelia González");
                           try {
                           miCuenta.agregarMovimiento("Ingreso inicial", 100);

                           System.out.println("Cuánto dinero deseas retirar: ");
                          
                           try {
                        	   int dinero;
                               dinero = Integer.parseInt(lector.nextLine());
                               miCuenta.agregarMovimiento1("Retirada de fondos", -dinero);
                               
                               System.out.println(miCuenta);
                               System.out.println(miCuenta.listarMovimientos());
                               
                     		} catch (NumberFormatException e) {
                     			System.out.println("Se ha producido una excepción");
                     			System.out.println(e.getMessage());
                     		}
                           } catch (NumerosRojosException e) {
                    			System.out.println(e.getMessage());
                    			System.out.println(e.toString());
                    		}
                           lector.close();
                          
               }
              
      	}
