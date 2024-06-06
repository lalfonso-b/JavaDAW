import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejemplo03 {

	public static void main(String[] args) {

		String url = "jdbc:mysql://192.168.3.13/inversiones";
		String usuario = "java";
		String password = "Ageofempires2";

//		addEmpresas(url, usuario, password);
//		addAcciones(url, usuario, password);

		listaEmpresas(url, usuario, password);

		informe(url, usuario, password);

	}

	private static void addEmpresas(String url, String usuario, String password) {

		String[][] empresas = { { "1", "Navantia", "2005" }, { "2", "Red Eléctrica Española", "1985" },
				{ "3", "Indra", "1992" } };

		String sql = "insert into empresas values  (?, ?, ?)";

		try (Connection conexion = DriverManager.getConnection(url, usuario, password);
				PreparedStatement preparedStatement = conexion.prepareStatement(sql)) {

			System.out.println("Insertando registros en la tabla Empresas...");

			for (int i = 0; i < empresas.length; i++) {
				// Preparamos el preparedStatement para insertar la fila i del array en la base
				// de datos.
				preparedStatement.setInt(1, Integer.parseInt(empresas[i][0]));
				preparedStatement.setString(2, empresas[i][1]);
				preparedStatement.setString(3, empresas[i][2]);

				// Insertamos en la base de datos.
				int registrosInsertados = preparedStatement.executeUpdate();
				System.out.println(registrosInsertados + " registros insertados.");
			}

		} catch (NumberFormatException e) {
			System.out.println("El id debe ser entero.");
		} catch (SQLException e) {
			System.out.println("Error al insertar datos.");
		}

	}

	private static void addAcciones(String url, String usuario, String password) {

		String[][] acciones = { { "1", "Carlos Pérez", "1", "100" }, { "2", "Lucía Martínez", "1", "55" },
				{ "3", "José López", "2", "70" }, { "4", "Marcos Jiménez", "3", "125" }, };

		String sql = "insert into acciones values  (?, ?, ?, ?)";

		try (Connection conexion = DriverManager.getConnection(url, usuario, password);
				PreparedStatement preparedStatement = conexion.prepareStatement(sql)) {

			System.out.println("Insertando registros en la tabla Empresas...");

			for (int i = 0; i < acciones.length; i++) {
				// Preparamos el preparedStatement para insertar la fila i del array en la base
				// de datos.
				preparedStatement.setInt(1, Integer.parseInt(acciones[i][0]));
				preparedStatement.setString(2, acciones[i][1]);
				preparedStatement.setInt(3, Integer.parseInt(acciones[i][2]));
				preparedStatement.setInt(4, Integer.parseInt(acciones[i][3]));

				// Insertamos en la base de datos.
				int registrosInsertados = preparedStatement.executeUpdate();
				System.out.println(registrosInsertados + " registros insertados.");
			}

		} catch (NumberFormatException e) {
			System.out.println("Los campos id, id_empresa y cantidad deben ser enteros.");
		} catch (SQLException e) {
			System.out.println("Error al insertar datos.");
		}

	}

	private static void listaEmpresas(String url, String usuario, String password) {

		String sql = "select * from empresas";

		try (Connection conexion = DriverManager.getConnection(url, usuario, password);
				Statement statement = conexion.createStatement()) {

			ResultSet resultados = statement.executeQuery(sql);

			System.out.println("Tabla Empresas");

			System.out.println("---------------------------------------------");

			System.out.printf("%-4s %-25s %-10s%n", "ID", "NOMBRE", "FUNDACIÓN");

			System.out.printf("%-4s %-25s %-10s%n", "==", "======", "==========");

			while (resultados.next()) {

				int id = resultados.getInt("id");

				String nombre = resultados.getString("nombre");

				String fundacion = resultados.getString("fundacion") + "-01-01";

				System.out.printf("%-4d %-25s %-10s%n", id, nombre, fundacion);

			}

		} catch (SQLException e) {

			e.printStackTrace();

		}

	}

	private static void informe(String url, String usuario, String password) {

		String sql = "select propietario, nombre, cantidad\n"
				+ "from acciones, empresas e\n"
				+ "where id_empresa = e.id\n"
				+ "order by propietario";

		try (Connection conexion = DriverManager.getConnection(url, usuario, password);
				Statement statement = conexion.createStatement();) {

			ResultSet resultados = statement.executeQuery(sql);

			System.out.println("\nInforme de acciones");
			System.out.println("------------------------------------------------------");

			System.out.printf("%-21s %-27s %4s%n", "PROPIETARIO", "NOMBRE", "CANT");
			System.out.printf("%-21s %-27s %4s%n", "===========", "======", "====");

			while (resultados.next()) {

				System.out.printf("%-21s %-27s %4s%n", resultados.getString("propietario"),
						resultados.getString("nombre"), resultados.getInt("cantidad"));

			}

		} catch (SQLException e) {

			System.out.println("Error de acceso a la base de datos.");

		}

	}

}
