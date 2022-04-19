package pe.edu.upc.serviceinterfaces;

import java.util.List;

import pe.edu.upc.entities.Empresa;

public interface IEmpresaService {
	public void insert(Empresa e);

	public List<Empresa> list();

	public void delete(int id);

}
