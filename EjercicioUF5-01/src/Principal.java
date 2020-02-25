public class Principal {

	public static void main(String[] args) {
		fiesta x =new fiesta();
		x.invitar();x.invitar();x.invitar();x.invitar();x.invitar();//Añadimos por ejemplo 5 Invitados
System.out.println(x.consulta());
System.out.println("El precio de la fiesta es: "+x.preciofiesta()+" Euros");
x.cancelarinvitacion();x.cancelarinvitacion();x.cancelarinvitacion();//No pueden venir 3 invitados
System.out.println(x.consulta());
System.out.println("El precio de la fiesta es: "+x.preciofiesta()+" Euros");
	}

}
