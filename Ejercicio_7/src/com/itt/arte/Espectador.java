package com.itt.arte;

public class Espectador {
private String nombre;
private String tlf;
private int edad;
public Espectador(String nombre, String tlf, int edad) {
	super();
	this.nombre = nombre;
	this.tlf = tlf;
	this.edad = edad;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String gettlf() {
	return tlf;
}
public void settlf(String tlf) {
	this.tlf = tlf;
}
public int getEdad() {
	return edad;
}
public void setEdad(int edad) {
	this.edad = edad;
}
@Override
public String toString() {
	return  nombre + ", tlf=" + tlf + ", Tipo: " + edad ;
}
public String rangoEdad() {
	if (edad >=0 && edad <= 12)
		return "Infantil";
	if (edad >=13 && edad <=18)
		return "Menor";
	if (edad >=18 && edad <=65)
		return "Mayor";
	if (edad >=65)
		return "Jubilado";
	else
		return "Por favor, inserte una edad correcta";
  }
}
