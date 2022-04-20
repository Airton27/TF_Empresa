package pe.edu.upc.serviceinterfaces;

import java.util.List;

import pe.edu.upc.entities.Empresa;

public interface IEmpresaService {
	public void insert(Empresa emp);

	public List<Empresa> list();

	public void delete(int id);

}
