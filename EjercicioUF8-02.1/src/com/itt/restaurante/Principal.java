package com.itt.restaurante;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws CantidadIncorrectaException {
		Scanner lector = new Scanner(System.in);
		ArrayList<Consumicion> c =new ArrayList<Consumicion>();
		String consumicion=" "; 
		int cantidad=0;
		double precio=0.0;
		double preciototal=0.0;
        do {
        	System.out.println("¿Qué consumición desea?");
        	consumicion=lector.nextLine();
        	try {
        	System.out.println("Precio: ");
        	precio=Double.parseDouble(lector.nextLine());
        	try {
        	System.out.println("Cantidad: ");
        	cantidad=Integer.parseInt(lector.nextLine());
        	if (cantidad<=0) {
            	 throw new CantidadIncorrectaException(cantidad);
            	 }
        	} catch (CantidadIncorrectaException e) {
      			System.out.println(e.getMessage());
      			System.out.println(e.toString());
      		}
         	} catch (NumberFormatException e) {
      			System.out.println("Se ha producido NumberFormatException ");
      			System.out.println(e.getMessage());
      			System.out.println("Intente otra vez");	
      		}
        	System.out.println("Si desea otra consumición teclee si: ");
        	lector.nextLine();
        	c.add(new Consumicion(consumicion,cantidad,precio));
        	}while(!lector.nextLine().equalsIgnoreCase("no"));
        for(int x=0;x<c.size();x++) {
        	System.out.println(c.get(x).toString());
        	preciototal=c.get(x).getPrecio();
        }
        	 
        System.out.println("Aquí tine su comida, que aproveche");
        System.out.println("Son "+preciototal+" €");
        lector.close();
	}
	
}
