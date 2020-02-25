
public class NumerosRojosException extends Exception {

	private static final long serialVersionUID = 1L;
	private double cantidad;

	public NumerosRojosException(double cantidad) {
		super("Numeros Rojos");
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "NumerosRojosException [cantidad=" + cantidad + "]";
	}

}
