package repository;

import java.util.List;

import javax.persistence.EntityManager;

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
        em.persist(c);
    }
    else{
        em.merge(c);
        }
    }
        
    /*
    * Obtiene todas las carreras
    */
    public List<Carrera> getAll(){
        return null;
    }

    /*
    * Obtiene las carreras que contengan inscriptos
    */
    public List<Carrera> getCarrerasConInscriptos(){
        return null;
    }

    }
    
