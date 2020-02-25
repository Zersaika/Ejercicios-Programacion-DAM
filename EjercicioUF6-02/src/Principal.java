import com.itt.libreria.Autor;
import com.itt.libreria.Libro;

public class Principal {
	public static void main(String[] args) {
		Autor a = new Autor("Makoto Shinkai", "Makoto Shinkai, nacido bajo el nombre de Makoto Niitsu, es un reconocido director de cine, escritor, productor, animador, dibujante y actor de voz japonés. Estudió literatura japonesa en la universidad y su pasión por la creación de filmes animados se debe a los manga, anime y novelas que leyó durante su juventud.");
		Libro l = new Libro("Makoto Shinkai", "Makoto Shinkai, nacido bajo el nombre de Makoto Niitsu, es un reconocido director de cine, escritor, productor, animador, dibujante y actor de voz japonés. Estudió literatura japonesa en la universidad y su pasión por la creación de filmes animados se debe a los manga, anime y novelas que leyó durante su juventud.", "Your name", "Drama fantasia y romance", a);
		System.out.println(l.toString());
		System.out.println();
		System.out.println(a.toString());
		System.out.println();
		System.out.println(l.getAutor());
	}
}
