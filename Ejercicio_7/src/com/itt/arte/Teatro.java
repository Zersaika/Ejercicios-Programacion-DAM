package com.itt.arte;

public class Teatro extends Local implements Sala  {
	private Obra obra;
	private double precio;
	private Espectador[][] localidades;
	public Teatro(String domicilio, int metros, int accesos, Obra obra, double precio) {
		super(domicilio, metros, accesos);
		this.obra = obra;
		this.precio = precio;
		this.localidades=new Espectador[5][10];
	}
	public Obra getObra() {
		return obra;
	}
	public void setObra(Obra obra) {
		this.obra = obra;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public Espectador[][] getLocalidades() {
		return localidades;
	}
	public void setLocalidades(Espectador[][] localidades) {
		this.localidades = localidades;
	}
	@Override
	public String verProgramacion() {
		return obra.toString()+"\n"+ super.toString()+"\n"+"Precio: "+getPrecio();
	}
	@Override
	public String verLocalidades() {
		for (int i=0;i<localidades.length;i++) {
			for (int j= 0;j<localidades[i].length;j++) {
				if (localidades[i][j] != null)  {
					System.out.print(i+"."+j+" Ocupada "+"\n");
				} else {
					System.out.print(i+"."+j+" Libre "+"\n");
				}
			}
		}
		return "";
	}
	@Override
	public String verLocalidadesOcupadas() {
		for (int i=0;i<localidades.length;i++) {
			for (int j=0;j<localidades[i].length;j++) {
				if (localidades[i][j] != null)  {
					System.out.println(i+"."+j+" "+localidades[i][j].getNombre()+", tlf: "+localidades[i][j].gettlf()
							+", Tipo: "+localidades[i][j].rangoEdad());
				}
			}
		}
		return "";
	}
	@Override
	public String venderLocalidad(int fila, int butaca, Espectador e) {
		double precio;
		if (this.localidades[fila][butaca] != null) {
			return " Esta localidad esta ocupada";
		} else {
		this.localidades[fila][butaca] = e;
		precio = (e.getEdad()<=12)?this.precio*0.50:(e.getEdad()<=17)?this.precio*0.80:(e.getEdad()>=65)?this.precio*0.34:this.precio;
		return "Se ha vendido la localidad " + fila + "." + butaca + " a " + e.getNombre() + " por " + precio + " euros";		
	   }
	}
	@Override
	public String cancelarLocalidad(int fila, int butaca) {
		if(localidades[fila][butaca] == null) {
			return "La plaza ya estaba libre";
	    } else {
			String nombre = localidades[fila][butaca].getNombre();
			localidades[fila][butaca] = null;
			return nombre.toUpperCase() + " ha cancelado su reserva"+"\n";
		}
	}
	@Override
	public String consultarLocalidad(int fila, int butaca) {
		double precio;
		if (localidades [fila][butaca]!=null) {
			this.localidades[fila][butaca]=localidades[fila][butaca];
			precio = (this.localidades[fila][butaca].getEdad()<=12)?this.precio*0.5:(this.localidades[fila][butaca].getEdad()<=17)?this.precio*0.80:(this.localidades[fila][butaca].getEdad()>=65)?this.precio*0.34:this.precio;	
			return "Localidad ocupada por "+ localidades[fila][butaca].getNombre().toUpperCase() + ", tlf: " + localidades[fila][butaca].gettlf()
					+ ", Tipo: " + localidades[fila][butaca].rangoEdad() + ", Precio: " + precio;				
		} else {
			return "Localidad libre";
			}
	}
	@Override
	public double calcularRecaudacion() {
		double precio1=0;
		double precio2=0;
		double precio3=0;
		double precio4=0;
		double x1=0;
		double x2=0;
		double x3=0;
		double x4=0;
		double preciototal = 0;
		for (int i = 0; i<localidades.length; i++) {
			for (int j = 0; j<localidades[i].length; j++) {
				if (localidades[i][j] != null)  {
					if(localidades[i][j].rangoEdad().equals("Infantil")) {				
						precio1= (50*this.precio)/100;
						x1=x1+precio1;
					} else {
						if(localidades[i][j].rangoEdad().equals("Menor")) {
							precio2= (80*this.precio)/100;
							x2=x2+precio2;
						} else {
							if(localidades[i][j].rangoEdad().equals("Mayor")) {
								precio3= this.precio;
								x3=x3+precio3;
							} else {
								if(localidades[i][j].rangoEdad().equals("Jubilado")) {
									precio4= (34*this.precio)/100;
									x4=x4+precio4;
								}
							}
						}
					}
				}
			}
		}
		preciototal = x1+x2+x3+x4;
		return preciototal;
	}
}
