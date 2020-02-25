import com.itt.fiestas.fiesta;

public class Principal {

	public static void main(String[] args) {
		fiesta x =new fiesta();
		x.invitar();x.invitar();x.invitar();x.invitar();x.invitar();//Añadimos por ejemplo 5 Invitados
		x.invitar(20);//Añadimos 20 Invitados mas
System.out.println(x.consulta());
System.out.println("El precio de la fiesta es: "+x.preciofiesta()+" Euros");
x.cancelarinvitacion();x.cancelarinvitacion();x.cancelarinvitacion();//No pueden venir 3 invitados
x.cancelarinvitacion(15);//Han rechazado 15 mas
System.out.println(x.consulta());
System.out.println("El precio de la fiesta es: "+x.preciofiesta()+" Euros");
System.out.println(fiesta.info());
	}

}
