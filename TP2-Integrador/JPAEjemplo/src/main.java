/**
 * Los ejercicios 2 y 3 se resolvieron mediante el uso de createNamedQuery
 * 
 * Paquetes:
 * interfaces: contiene la interfaz que implementan los repositorios Carrera, Estudiante e Inscripcion
 * main: contiene el codigo en el que se instancian las clases
 * modelo: contiene las clases java mapeadas a sql   
 *  Repositorio: Contiene las clases del patrón repository
 *  
 */

import java.sql.Timestamp;
import java.util.Iterator;
import java.util.Date;  
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import modelos.Carrera;
import modelos.Estudiante;
import modelos.Inscripcion;

public class main {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Entregable2");
		EntityManager em = emf.createEntityManager();
    }
}
