package pe.edu.upc.serviceimpls;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerfaces.IEmpresaDao;
import pe.edu.upc.entities.Empresa;
import pe.edu.upc.serviceinterfaces.IEmpresaService;

@Named
public class EmpresaServiceImpl implements IEmpresaService {

	@Inject
	private IEmpresaDao eDao;

	@Override
	public void insert(Empresa e) {
		eDao.insert(e);

	}

	@Override
	public List<Empresa> list() {
		// TODO Auto-generated method stub
		return eDao.list();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		eDao.delete(id);
	}

}
