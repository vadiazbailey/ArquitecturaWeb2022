

import java.sql.Timestamp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelos.Carrera;
import modelos.Estudiante;
import modelos.Inscripcion;

public class Insert {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Entregable2");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		Estudiante d = new Estudiante(1, "Juan", "Perez", 20, "Masculino", 12345678, "Cordoba");
		em.persist(d);

		Carrera c = new Carrera(1, "Ingenieria en Sistemas de Informacion");
		em.persist(c);

		Inscripcion i = new Inscripcion(c, d, new Timestamp(System.currentTimeMillis()), null);
		em.persist(i);
	
		em.getTransaction().commit();
		em.close();
		emf.close();
	}

}
