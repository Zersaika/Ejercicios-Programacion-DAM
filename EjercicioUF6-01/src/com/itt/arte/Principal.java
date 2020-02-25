package com.itt.arte;

public class Principal {

	public static void main(String[] args) {
		
		Profesor p =new Profesor("516632211R","Carlos Robles","C/ Pez Volador, 35","616669922","Matematicas y Lengua");
        Alumno a = new Alumno("532224411A","Alicia Torres","C/ Luna Lunera, 45","639889999","1º Bachillerato");
        Administrativo ad =new Administrativo("123454411A","Rosa Torres","C/ Luna Lunera, 45","639889999","Hacer matriculas, controlar asistencia");
        System.out.println("Profesor "+p.toString()+" Competencias: "+p.getCompetencias());
        System.out.println(p.trabajar());
        System.out.println();
        System.out.println("Alumno "+a.toString()+" Cursando: "+a.getCurso());
        System.out.println(a.trabajar());
        System.out.println();
        System.out.println("Administrativo "+ad.toString()+" Tareas: "+ad.getTareas());
        System.out.println(ad.trabajar());
        System.out.println();
        System.out.println();
        System.out.println(a.llamar(p));
        System.out.println();
	    System.out.println(p.ponerNotas());
	    System.out.println(a.hacerExamen());
	    System.out.println(ad.gestionarMatricula());
	
	
	}

}
