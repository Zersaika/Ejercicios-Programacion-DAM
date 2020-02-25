package com.itt.arte;

public class Profesor extends Persona {
private String competencias;
public Profesor(String nif, String nombre, String direccion, String telefono, String competencias) {
	super(nif, nombre, direccion, telefono);
	this.competencias = competencias;
}
public String getCompetencias() {
	return competencias;
}
public void setCompetencias(String competencias) {
	this.competencias = competencias;
}
public String ponerNotas() {
	return "El profesor "+super.getNombre()+" va a corregir los exámenes";
}
@Override
public String trabajar() {
	return "El profesor "+super.getNombre()+" va a impartir su clase ";
}
}
