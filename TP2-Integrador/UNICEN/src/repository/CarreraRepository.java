package repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import modelos.Carrera;


/*
 * Repositorio de la clase Carrera
 * 
 *@author beltranpenia
 *@version 1.0
 */
public class CarreraRepository implements JPARepository<Carrera> {

    private EntityManager em = null;

    /*
     * Constructor de la clase
     */
    public CarreraRepository(EntityManager em) {
        this.em = em;
    }

    @Override
    public void save(Carrera c) {
     if(!em.contains(c)){
        em.getTransaction().begin();
        em.persist(c);
        em.getTransaction().commit();
    }
    else{
        em.merge(c);
        }
    }
        
    /*
    * Obtiene todas las carreras
    */
    public List<Carrera> getAll(){
        TypedQuery<Carrera> tq = em.createNamedQuery(Carrera.FIND_ALL, Carrera.class);
        return tq.getResultList();
    }

    /*
    * Obtiene las carreras que contengan inscriptos
    */
    public List<Carrera> getCarrerasConInscriptos(){
        TypedQuery<Carrera> tq = em.createNamedQuery(Carrera.FIND_CON_INSCRIPTOS, Carrera.class);
        return tq.getResultList();
    }


    //public List<DTOInscriptos> getReporteCarreras(){

}
    
