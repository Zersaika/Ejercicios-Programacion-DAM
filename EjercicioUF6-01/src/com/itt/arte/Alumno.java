package com.itt.arte;

public class Alumno extends Persona {
private String curso;
public Alumno(String nif, String nombre, String direccion, String telefono, String curso) {
	super(nif, nombre, direccion, telefono);
	this.curso = curso;
}
public String getCurso() {
	return curso;
}
public void setCurso(String curso) {
	this.curso = curso;
}
public String hacerExamen() {
	return "El alumno "+super.getNombre()+" va a hacer su examen";
}
@Override
public String trabajar() {
	return "El alumno "+super.getNombre()+" va a estudiar para el curso "+this.curso;
}

}
