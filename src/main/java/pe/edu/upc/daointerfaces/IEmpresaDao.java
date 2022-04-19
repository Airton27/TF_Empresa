package pe.edu.upc.daointerfaces;

import java.util.List;

import pe.edu.upc.entities.Empresa;

public interface IEmpresaDao {

	public void insert(Empresa e);

	public List<Empresa> list();

	public void delete(int id);
}
