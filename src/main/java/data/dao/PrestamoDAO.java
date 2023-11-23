package data.dao;
import modelo.Libro;
import org.jooq.DSLContext;
import org.jooq.impl.DSL;

public class PrestamoDAO {

	private static final org.jooq.Table<?> PRESTAMO = org.jooq.impl.DSL.table("PRESTAMO");

	public boolean prestarLibro(DSLContext query, Libro libro) {
		try {
			query.insertInto(PRESTAMO)
					.set(PRESTAMO.field("TITULO_LIBRO"), libro.getTitulo())
					.execute();

			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean devolverLibro(DSLContext query, Libro libro) {
		try {
			query.deleteFrom(PRESTAMO)
					.where(PRESTAMO.field("TITULO_LIBRO").eq(libro.getTitulo()))
					.execute();

			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean comprobar(DSLContext query, Libro libro) {
		try {
			int count = query.fetchCount(
					query.selectFrom(PRESTAMO)
							.where(PRESTAMO.field("TITULO_LIBRO").eq(libro.getTitulo()))
			);

			return count == 0;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}