import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejemplo02 {

	public static void main(String[] args) {

		String url = "jdbc:mysql://192.168.3.13/Libreria";
		String usuario = "librero";
		String password = "Ageofempires2";

		listar("Alejandro Dumas", url, usuario, password);

	}

	private static void listar(String autor, String url, String usuario, String password) {

		String sql = "select * from libros where autor=?";

		try (Connection conexion = DriverManager.getConnection(url, usuario, password);
				PreparedStatement preparedStatement = conexion.prepareStatement(sql)) {

			preparedStatement.setString(1, autor);
			
			ResultSet resultados = preparedStatement.executeQuery();

			System.out.println("LIBROS ESCRITOS POR: " + autor.toUpperCase());
			while (resultados.next()) {

				System.out.println(resultados.getInt("id"));
				System.out.println(resultados.getString("titulo"));
				System.out.println(resultados.getString("autor"));
				System.out.println(resultados.getFloat("precio"));
				System.out.println(resultados.getInt("cantidad"));
				System.out.println("-------------");

			}

		} catch (SQLException e) {
			System.out.println("Error de acceso a la base de datos.");
			e.printStackTrace();
		}
	}

}
