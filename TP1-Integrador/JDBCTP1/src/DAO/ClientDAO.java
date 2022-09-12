package DAO;
import Model.ClientModel;
import DAOFactory.ConexionMySQL;
import modelo.Factura;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

/**
 * ClientDAO
 * The client DAO is used to manage the clients in the database.
 * @author vadiazbailey {@Link  https://github.com/vadiazbailey}
 * @version 1.0
 */
public class ClientDAO implements DAO <ClientModel> {
    /**
     * Create
     * The create method is used to create a new record in the database.
     * @param csvParser The CSVParser object that contains the data to be inserted.
     * @throws SQLException
     */
    @Override
    public void cargar(CSVParser datos) throws SQLException {
        connection = ConexionMySQL.conectar();
		String insert = "INSERT INTO client "+
                        "(clientId, clientName, clientEmail) "+ 
                        "VALUES (?, ?, ?)"; 
		for(CSVRecord fila: datos) {
			PreparedStatement ps = connection.prepareStatement(insert);
			ps.setInt(1, Integer.parseInt(fila.get("idCliente")));
			ps.setString(2, fila.get("nombre"));
			ps.setString(3, fila.get("email"));
			ps.executeUpdate();
			connection.commit();
			ps.close();
		}
		connection.close();
    }

    /**
     * Create Table
     * The create table method is used to create a table in the database.
     * @throws SQLException
     */
    @Override
    public void crearTabla() throws SQLException {
        connection = ConexionMySQL.conectar();
		String client = "CREATE TABLE client(" +
                        "clientId INT," +
                        "clientName VARCHAR(500)," +
                        "clientEmail VARCHAR(150)," +
                        "PRIMARY KEY (clientId))";
		connection.prepareStatement(client).execute();
		connection.commit();
		connection.close();
    }
}