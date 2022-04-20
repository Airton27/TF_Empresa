package pe.edu.upc.daoimpls;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerfaces.IEmpresaDao;
import pe.edu.upc.entities.Empresa;

public class EmpresaImpl implements IEmpresaDao {

	@PersistenceContext(unitName = "TF_Empresa")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Empresa emp) {
		try {
			em.persist(emp);
		} catch (Exception e) {
			System.out.println("Error al insertar empresa en el DAO");
		}

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Empresa> list() {
		List<Empresa> listaEmpresas = new ArrayList<Empresa>();
		try {
			Query jpql = em.createQuery("from Empresa emp");
			listaEmpresas = (List<Empresa>) jpql.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar en el DAO de empresa");
		}

		return listaEmpresas;
	}

	@Transactional
	@Override
	public void delete(int id) {
		try {
			Empresa emp = em.find(Empresa.class, id);
			em.remove(emp);

		} catch (Exception e) {
			System.out.println("Error al eliminar en el DAO de empresa");
		}

	}

}
