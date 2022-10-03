

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
		Estudiante d2 = new Estudiante(2, "Maria", "Gomez", 21, "Femenino", 87654321, "Cordoba");
		em.persist(d2);
		Estudiante d3 = new Estudiante(3, "Pedro", "Gonzalez", 22, "Masculino", 12345678, "Cordoba");
		em.persist(d3);

		Carrera c = new Carrera(1, "Ingenieria en Sistemas de Informacion");
		em.persist(c);

		Inscripcion i = new Inscripcion(c, d, new Timestamp(System.currentTimeMillis()), null);
		em.persist(i);
		Inscripcion i2 = new Inscripcion(c, d2, new Timestamp(System.currentTimeMillis()), null);
		em.persist(i2);
		Inscripcion i3 = new Inscripcion(c, d3, new Timestamp(System.currentTimeMillis()), null);
		em.persist(i3);
	
		em.getTransaction().commit();
		em.close();
		emf.close();
	}

}
