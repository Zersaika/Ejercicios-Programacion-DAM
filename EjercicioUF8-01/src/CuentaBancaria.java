import java.util.ArrayList;

public class CuentaBancaria {

              private int numeroCuenta;

              private String cliente;

              private double saldo;

              private ArrayList<Movimiento> movimientos;

              public CuentaBancaria(int numeroCuenta, String cliente) {

                            this.numeroCuenta = numeroCuenta;

                            this.cliente = cliente;

                            this.saldo = 0;

                            this.movimientos = new ArrayList();

               }

               public void agregarMovimiento(String concepto, double cantidad)throws NumerosRojosException {
            	
            	   
                    	 this.saldo = this.saldo + cantidad;
                         
                         this.movimientos.add(new Movimiento(concepto, cantidad,saldo));
                     
                             
               } 
               public void agregarMovimiento1(String concepto, double cantidad)throws NumerosRojosException {
             	  double dineromaximo=-100.0;
             	   
             	   if (cantidad<dineromaximo) {
                     	 throw new NumerosRojosException(cantidad);
                      }else{
                     	 this.saldo = this.saldo + cantidad;
                          
                          this.movimientos.add(new Movimiento(concepto, cantidad,saldo));
                      }
                              
                } 
       

             @Override

             public String toString() {

                           return "Número=" + numeroCuenta + ", Cliente=" + cliente + ",Saldo=" + saldo;

             }

             public String listarMovimientos() {

                           String listado = "";

                           for (Movimiento mov : this.movimientos) {

                                    listado = listado + mov.toString()+"\n";

                           }                          

                           return listado;

               }

        	 
             }