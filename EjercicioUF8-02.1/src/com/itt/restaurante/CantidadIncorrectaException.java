package com.itt.restaurante;

public class CantidadIncorrectaException extends Exception {

	private static final long serialVersionUID = 1L;
private int cantidad;

public CantidadIncorrectaException(int cantidad) {
	super("Se ha producido CantidadIncorrectaException ");
	this.cantidad = cantidad;
}

@Override
public String toString() {
	return "Consumicion no válida: Cantidad = " + cantidad+"\nIntente otra vez";
}

}
