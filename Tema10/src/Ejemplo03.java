import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Ejemplo03 {

	public static void main(String[] args) {

		String url = "jdbc:mysql://192.168.3.13/inversiones";
		String usuario = "java";
		String password = "Ageofempires2";

		addEmpresas(url, usuario, password);

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
	
	private static void addAcciones() {
		
		String[][] acciones = {
				{"1","Carlos Pérez","1","100"},
				{"2","Lucía Martínez","1","55"},
				{"3","José López","2","70"},
				{"4","Marcos Jiménez","3","125"},
		};
		
		
	}

}
















