package data;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import java.sql.Connection;

import static org.jooq.impl.DSL.constraint;
import static org.jooq.impl.DSL.field;

public class DBGenerator {

    public static void iniciarBD(String nombreBD) {
        try {
            Connection connection = DBConnector.connection(nombreBD, "root", "");

            DSLContext create = DSL.using(connection, SQLDialect.MYSQL);

            crearBaseDato(create, nombreBD);

            create = actualizarConexion(connection, nombreBD);

            crearTablas(create);

            DBConnector.closeConnection();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void crearBaseDato(DSLContext create, String nombreBD) {
        create.createDatabaseIfNotExists(nombreBD).execute();
    }

    private static DSLContext actualizarConexion(Connection connection, String nombreBD) {
        DBConnector.closeConnection();

        connection = DBConnector.connection(nombreBD, "root", "");
        return DSL.using(connection, SQLDialect.MYSQL);
    }

    private static void crearTablas(DSLContext create) {
        // Creación de la tabla Libro
        create.createTableIfNotExists("Libro")
                .columns(
                        field("id", Integer.class),
                        field("titulo", String.class),
                        field("autor", String.class),
                        field("isbn", String.class),
                        field("genero", String.class),
                        field("ano_publicacion", Integer.class)
                )
                .constraints(
                        constraint("PK_Libro").primaryKey("id")
                )
                .execute();

        // Creación de la tabla Usuario
        create.createTableIfNotExists("Usuario")
                .columns(
                        field("id", Integer.class),
                        field("nombre", String.class),
                        field("identificacion", String.class),
                        field("direccion", String.class),
                        field("telefono", String.class),
                        field("correo", String.class)
                )
                .constraints(
                        constraint("PK_Usuario").primaryKey("id")
                )
                .execute();
        
        create.createTableIfNotExists("Prestamo")
                .columns(
                        field("id", Integer.class),
                        field("id_libro", Integer.class),
                        field("id_usuario", Integer.class),
                        field("fecha_inicio", java.sql.Date.class),
                        field("fecha_devolucion", java.sql.Date.class)
                )
                .constraints(
                        constraint("PK_Prestamo").primaryKey("id"),
                        constraint("FK_Prestamo_Libro").foreignKey("id_libro").references("Libro", "id"),
                        constraint("FK_Prestamo_Usuario").foreignKey("id_usuario").references("Usuario", "id")
                )
                .execute();
    }
}