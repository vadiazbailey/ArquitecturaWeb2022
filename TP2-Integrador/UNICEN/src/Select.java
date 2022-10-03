

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelos.Estudiante;

public class Select {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Entregable2");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		Estudiante j = em.find(Estudiante.class, 1);
		System.out.println(j);
		@SuppressWarnings("unchecked")
		List<Estudiante> estudiantes = em.createQuery("SELECT p FROM Estudiante p").getResultList(); 


		@SuppressWarnings("unchecked")
		List<Object[]> res = em.createQuery("SELECT p.nombre, p.edad FROM Estudiante p").getResultList();
		
		res.forEach(d -> System.out.println(Arrays.toString(d)));
		
		System.out.println("************************************************");
		
		for (Object[] d: res) {
			System.out.println(Arrays.toString(d));
		}
		
		em.getTransaction().commit();
		em.close();
		emf.close();
	}

}
