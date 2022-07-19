package com.uce.edu.demo.instituto.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.instituto.repository.modelo.Estudiante;
import com.uce.edu.demo.instituto.repository.modelo.EstudianteBuscar;
import com.uce.edu.demo.instituto.repository.modelo.EstudianteConteoNombre;
import com.uce.edu.demo.repository.modelo.Persona;
import com.uce.edu.demo.repository.modelo.PersonaContadorGenero;
import com.uce.edu.demo.repository.modelo.PersonaSencilla;

@Repository
@Transactional
public class EstudianteJpaRepositoryIml implements IEstudianteJpaRepository{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public Estudiante buscarPorId(int id) {
		return this.entityManager.find(Estudiante.class, id);
	}

	@Override
	public void insertar(Estudiante estudiante) {
		this.entityManager.persist(estudiante);
		
	}

	@Override
	public void actualizar(Estudiante estudiante) {
		this.entityManager.merge(estudiante);
		
	}

	@Override
	public void eliminar(Integer id) {
		Estudiante estudiante = new Estudiante();
		this.entityManager.remove(estudiante);
		
	}

	@Override
	public Estudiante buscarPorCorreoTyped(String correo) {
		TypedQuery<Estudiante> miTypedQuery = this.entityManager.createQuery("SELECT p FROM Estudiante p WHERE p.correo = :datoCorreo", Estudiante.class);
		miTypedQuery.setParameter("datoCorreo", correo);
		return miTypedQuery.getSingleResult();
	}

	@Override
	public List<Estudiante> buscarPorEdadTyped(Integer edad) {
		TypedQuery<Estudiante> miTypedQuery = this.entityManager.createQuery("SELECT p FROM Estudiante p WHERE p.edad = :datoEdad", Estudiante.class);
		miTypedQuery.setParameter("datoEdad", edad);
		return miTypedQuery.getResultList();
	}

	@Override
	public List<Estudiante> buscarPorNombrenamed(String nombre) {
		Query myQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorNombre");
		myQuery.setParameter("datoNombre", nombre);
		return (List<Estudiante>) myQuery.getResultList();
	}

	@Override
	public List<Estudiante> buscarPorApellidoNamed(String apellido) {
		Query myQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorApellido");
		myQuery.setParameter("datoApellido", apellido);
		return (List<Estudiante>) myQuery.getResultList();
	}

	@Override
	public Estudiante buscarPorApellidoCedula(String apellido, String cedula) {
		TypedQuery<Estudiante> myQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorApellidoCedula", Estudiante.class);
		myQuery.setParameter("datoApellido", apellido);
		myQuery.setParameter("datoCedula", cedula);
		return myQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorCorreoEdad(String correo, Integer edad) {
		TypedQuery<Estudiante> myQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorCorreoEdad", Estudiante.class);
		myQuery.setParameter("datoCorreo", correo);
		myQuery.setParameter("datoEdad", edad);
		return myQuery.getSingleResult();
	}

	@Override
	public List<Estudiante> buscarPorApellidoNative(String apellido) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNativeQuery("SELECT * FROM estudiante WHERE apellido = :datoApellido", Estudiante.class);
		myQuery.setParameter("datoApellido", apellido);
		return (List<Estudiante>) myQuery.getResultList();
	}

	@Override
	public List<Estudiante> buscarPorNombreNative(String nombre) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNativeQuery("SELECT * FROM estudiante WHERE nombre = :datoNombre", Estudiante.class);
		myQuery.setParameter("datoNombre", nombre);
		return (List<Estudiante>) myQuery.getResultList();
	}

	@Override
	public List<Estudiante> buscarPorEdadNamedNative(Integer edad) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> myQuery  = this.entityManager.createNamedQuery("Estudiante.buscarPorEdadNative", Estudiante.class);
		myQuery.setParameter("datoEdad", edad);
		return myQuery.getResultList();
	}

	@Override
	public Estudiante buscarPorCorreoNamedNative(String correo) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> myQuery  = this.entityManager.createNamedQuery("Estudiante.buscarPorCorreoNative", Estudiante.class);
		myQuery.setParameter("datoCorreo", correo);
		return myQuery.getSingleResult();
	}

	@Override
	public List<Estudiante> buscarDinamicamenteNombre(String cedula, String nombre, Integer edad) {
		// TODO Auto-generated method stub
		CriteriaBuilder myCriteria = this.entityManager.getCriteriaBuilder();
		CriteriaQuery<Estudiante> myQuery = myCriteria.createQuery(Estudiante.class);
		
		Root<Estudiante> myTabla = myQuery.from(Estudiante.class);
		
		Predicate predicadoCedula = myCriteria.equal(myTabla.get("cedula"), cedula);
		Predicate predicadoEdad = myCriteria.equal(myTabla.get("edad"), edad);
		
		
		Predicate myPredicadoFinal = null;
		
		if(nombre.equals("Fernanda")) {
			myPredicadoFinal = myCriteria.and(predicadoCedula, predicadoEdad);
		}else {
			myPredicadoFinal = myCriteria.or(predicadoCedula, predicadoEdad);
		}
		
		myQuery.select(myTabla).where(myPredicadoFinal);
		
		TypedQuery<Estudiante> myQueryFinal = this.entityManager.createQuery(myQuery);
		return myQueryFinal.getResultList();
	}

	@Override
	public List<Estudiante> buscarDinamicamenteCorreo(Integer edad, String apellido, String correo) {
		// TODO Auto-generated method stub
		CriteriaBuilder myCriteria = this.entityManager.getCriteriaBuilder();
		CriteriaQuery<Estudiante> myQuery = myCriteria.createQuery(Estudiante.class);
		
		Root<Estudiante> myTabla = myQuery.from(Estudiante.class);
		
		Predicate predicadoEdad = myCriteria.equal(myTabla.get("edad"), edad);
		Predicate predicadoApellido = myCriteria.equal(myTabla.get("apellido"), apellido);
		
		
		Predicate myPredicadoFinal = null;
		
		if(correo.equals("agarcia@XX.uce.edu.ec")) {
			myPredicadoFinal = myCriteria.and(predicadoEdad, predicadoApellido);
		}else {
			myPredicadoFinal = myCriteria.or(predicadoEdad, predicadoApellido);
		}
		
		myQuery.select(myTabla).where(myPredicadoFinal);
		
		TypedQuery<Estudiante> myQueryFinal = this.entityManager.createQuery(myQuery);
		return myQueryFinal.getResultList();
	}

	@Override
	public List<EstudianteBuscar> buscarPorNombreEdad(String nombre, Integer edad) {
		// TODO Auto-generated method stub
		TypedQuery<EstudianteBuscar> myQuery = this.entityManager.createQuery(
				"SELECT NEW com.uce.edu.demo.instituto.repository.modelo.EstudianteBuscar(p.nombre, p.edad) FROM Estudiante p WHERE p.nombre = :datoNombre OR p.edad = :datoEdad",
				EstudianteBuscar.class);
		myQuery.setParameter("datoNombre", nombre);
		myQuery.setParameter("datoEdad", edad);
		return myQuery.getResultList();
	}

	@Override
	public List<EstudianteConteoNombre> buscarNombreConteo() {
		// TODO Auto-generated method stub
		TypedQuery<EstudianteConteoNombre> myQuery = this.entityManager.createQuery(
				"SELECT NEW com.uce.edu.demo.instituto.repository.modelo.EstudianteConteoNombre(p.nombre, COUNT(p.nombre)) FROM Estudiante p GROUP BY p.nombre",
				EstudianteConteoNombre.class);
		return myQuery.getResultList();
	}

}
