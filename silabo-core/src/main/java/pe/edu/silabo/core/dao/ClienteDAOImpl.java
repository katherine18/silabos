package pe.edu.silabo.core.dao;

import java.util.List;

import pe.edu.silabo.core.domain.Cliente;

public class ClienteDAOImpl extends BaseDAOHibernate implements ClienteDAO {


	public List<Cliente> findCustomerAll() {
		return this.find(Cliente.class, "from Cliente");
	}

	
//	@Override
	public void saveCustomer(Cliente cliente) {
		save(cliente);
	}

}
