

public class fiesta {
private String tipo;
private String fechahora;
private String direccion;
private int bebidas;
private int bocadillos;
private int invitados=0;

public fiesta(String tipo, String fechahora, String direccion, int bebidas, int bocadillos) {
	super();
	this.tipo = tipo;
	this.fechahora = fechahora;
	this.direccion = direccion;
	this.bebidas = bebidas;
	this.bocadillos = bocadillos;
	this.invitados=0;
}
public String gettipo() {
	return tipo;
};
public fiesta() {
	super();
	tipo="Cumpleaños";
	fechahora="El domigo a partir de las 12:00";
	direccion="Calle Ruiz de alda";
	bebidas=30;
	bocadillos=50;
	
}
public String getfechahora() {
	return fechahora;
};
public String getdireccion() {
	return direccion;	
};
public int getbebidas() {
	return bebidas;
};
public int getbocadillos() {
	return bocadillos;
};
public int getinvitados() {
	return invitados;
};
public void settipo(String tipo){
	this.tipo=tipo;
};
public void setfechahora(String fechahora){
	this.fechahora=fechahora;
};
public void setdireccion(String direccion){
	this.direccion=direccion;
};
public void setbebidas(int bebidas){
	this.bebidas=bebidas;
};
public void setbocadillos(int bocadillos){
	this.bocadillos=bocadillos;
};
public void setinvitados(int invitados){
	this.invitados=invitados;
};
public String consulta() {
	return "Tipo de fiesta: "+this.tipo+" Fecha de la fiesta: "+this.fechahora+" Direccion de la fiesta: "+this.direccion+
			" Bocadillos: "+this.bocadillos+" Bebidas: "+this.bebidas+" Invitados: "+this.invitados;
};
public void invitar() {
	this.invitados=this.invitados + 1;
};
public void cancelarinvitacion() {
	this.invitados=this.invitados - 1;
};
public double preciofiesta(){
	int precio;
	precio=(this.invitados *5)+(this.bocadillos *3)+(this.bebidas *2);
	return precio;
};

}
