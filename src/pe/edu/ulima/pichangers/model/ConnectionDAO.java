package pe.edu.ulima.pichangers.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDAO {
	private static final String URL = "jdbc:postgresql://jumbo.db.elephantsql.com:5432/cfihazoh";
	protected Connection conectarse() throws ClassNotFoundException, SQLException{
		Class.forName("org.postgresql.Driver");
		return DriverManager.getConnection(URL, "cfihazoh", "iQTFbB1MTluQZFhVaxWQiPk9jZvozscI");
	}
	
	protected void desconectarse(Connection conn) throws SQLException{
		conn.close();
	}
}
