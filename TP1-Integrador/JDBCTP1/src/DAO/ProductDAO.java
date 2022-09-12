package DAO;
import Model.ProductModel;
import DAOFactory.ConexionMySQL;
import modelo.Factura;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
/**
 * ProductDAO
 * The product DAO is used to manage the products in the database.
 * @author vadiazbailey {@Link  https://github.com/vadiazbailey}
 * @version 1.0
 */
public class ProductDAO implements DAO <ProductModel>{
     /**
     * Create
     * The create method is used to create a new record in the database.
     * @param csvParser The CSVParser object that contains the data to be inserted.
     * @throws SQLException
     */
    @Override
    public void cargar(CSVParser datos) throws SQLException {
        connection = ConexionMySQL.conectar();
		String insert = "INSERT INTO product "+
                        "(productId, name, value) "+ 
                        "VALUES (?, ?, ?)"; 
		for(CSVRecord fila: datos) {
			PreparedStatement ps = connection.prepareStatement(insert);
			ps.setInt(1, Integer.parseInt(fila.get("idProducto")));
			ps.setString(2, Integer.parseInt(fila.get("nombre")));
			ps.setFloat(3, Float.parseFloat(fila.get("valor")));
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
		String product = "CREATE TABLE product(" +
                                "productId INT," +
                                "name VARCHAR(45)," +
                                "value FLOAT," +
                                "PRIMARY KEY (productId))";
		connection.prepareStatement(product).execute();
		connection.commit();
		connection.close();
    }
}
