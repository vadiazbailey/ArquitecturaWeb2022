

import java.sql.Timestamp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelos.Direccion;
import modelos.Persona;
import modelos.Socio;
import modelos.Turno;

public class Vacio {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Example");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		em.getTransaction().commit();
		em.close();
		emf.close();
	}

}
