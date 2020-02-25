package com.itt.restaurante;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		ArrayList<Consumicion> c =new ArrayList<Consumicion>();
		String comida;
		double precio = 0.0;
		String opcion ="Si";
		String s="Si";
		int cantidad;
		while(opcion.equalsIgnoreCase(s)) {
		System.out.println("---------------------");
		System.out.println(" Coca Cola ------ 1.30 €");
		System.out.println(" Fanta Naranja -- 1.20 €");
		System.out.println(" Fanta Limón ---- 1.20 €");
		System.out.println(" Agua ----------- 1.00 €");
		System.out.println(" Cerveza -------- 1.20 €");
		System.out.println(" Croquetas ------ 1.20 €");
		System.out.println(" Ensaladilla ---- 2.20 €");
		System.out.println(" Asadura -------- 2.40 €");
		System.out.println(" Gambas al ajillo 2.20 €");
		System.out.println(" Montadito ------ 2.50 €");
		System.out.println("---------------------");
		System.out.println("¿Que consumicion desea?");
		comida = lector.nextLine();
		switch (comida) {
		case "Coca Cola":
			System.out.println("Precio: "+"\n1.30 €");
			System.out.println("¿Que cantidad desea?");
			cantidad=lector.nextInt();
			precio=(double) (1.30*cantidad);
			System.out.println("Cantidad: "+"\n"+cantidad);
			Consumicion consumicion1 = new Consumicion("Coca Cola",cantidad, precio);
			c.add(consumicion1);
		break;
		case "Fanta Naranja":
			System.out.println("Precio: "+"\n1.20 €");
			System.out.println("¿Que cantidad desea?");
			cantidad=lector.nextInt();
			precio=(double) (1.20*cantidad);
			System.out.println("Cantidad: "+"\n"+cantidad);
			Consumicion consumicion2 = new Consumicion("Fanta Naranja",cantidad,precio);
			c.add(consumicion2);
		break;
		case "Fanta Limón":
			System.out.println("Precio: "+"\n1.20 €");
			System.out.println("¿Que cantidad desea?");
			cantidad=lector.nextInt();
			precio=(double) (1.20*cantidad);
			System.out.println("Cantidad: "+"\n"+cantidad);
			Consumicion consumicion3 = new Consumicion("Fanta Limón",cantidad, precio);
			c.add(consumicion3);
		break;
		case "Agua":
			System.out.println("Precio: "+"\n1.00 €");
			System.out.println("¿Que cantidad desea?");
			cantidad=lector.nextInt();
			precio=(double) (1.00*cantidad);
			System.out.println("Cantidad: "+"\n"+cantidad);
			Consumicion consumicion4 = new Consumicion("Agua",cantidad, precio);
			c.add(consumicion4);
		break;
		case "Cerveza":
			System.out.println("Precio: "+"\n1.20 €");
			System.out.println("¿Que cantidad desea?");
			cantidad=lector.nextInt();
			precio=(double) (1.20*cantidad);
			System.out.println("Cantidad: "+"\n"+cantidad);
			Consumicion consumicion5 = new Consumicion("Cerveza",cantidad, precio);
			c.add(consumicion5);
		break;
		case "Croquetas":
			System.out.println("Precio: "+"\n1.20 €");
			System.out.println("¿Que cantidad desea?");
			cantidad=lector.nextInt();
			precio=(double) (1.20*cantidad);
			System.out.println("Cantidad: "+"\n"+cantidad);
			Consumicion consumicion6 = new Consumicion("Croquetas",cantidad, precio);
			c.add(consumicion6);
		break;
		case "Ensaladilla":
			System.out.println("Precio: "+"\n2.20 €");
			System.out.println("¿Que cantidad desea?");
			cantidad=lector.nextInt();
			precio=(double) (2.20*cantidad);
			System.out.println("Cantidad: "+"\n"+cantidad);
			Consumicion consumicion7 = new Consumicion("Ensaladilla",cantidad,precio);
			c.add(consumicion7);
		break;
		case "Asadura":
			System.out.println("Precio: "+"\n2.40 €");
			System.out.println("¿Que cantidad desea?");
			cantidad=lector.nextInt();
			precio=(double) (2.40*cantidad);
			System.out.println("Cantidad: "+"\n"+cantidad);
			Consumicion consumicion8 = new Consumicion("Asadura",cantidad, precio);
			c.add(consumicion8);
		break;
		case "Gambas al ajillo":
			System.out.println("Precio: "+"\n2.20 €");
			System.out.println("¿Que cantidad desea?");
			cantidad=lector.nextInt();
			precio=(double) (2.20*cantidad);
			System.out.println("Cantidad: "+"\n"+cantidad);
			Consumicion consumicion9 = new Consumicion("Gambas al ajillo",cantidad, precio);
			c.add(consumicion9);
		break;
		case "Montadito":
			System.out.println("Precio: "+"\n2.50 €");
			System.out.println("¿Que cantidad desea?");
			cantidad=lector.nextInt();
			precio=(double) (2.50*cantidad);
			System.out.println("Cantidad: "+"\n"+cantidad);
			Consumicion consumicion10 = new Consumicion("Montadito",cantidad, precio);
			c.add(consumicion10);
		break;
		default:
			int i;
			double preciototal=(float) 0.0;
			for (i=0;(i<c.size());i++){
				preciototal=preciototal+c.get(i).getPrecio();
				System.out.println(c.get(i).toString());
			}
			System.out.println("Aqui tiene su comida, que aproveche");
			System.out.println("Son "+preciototal+" €");
			break;
	}

}
		lector.close();
		
}

	
}