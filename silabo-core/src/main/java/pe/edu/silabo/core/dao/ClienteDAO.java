package pe.edu.silabo.core.dao;

import java.util.List;

import pe.edu.silabo.core.domain.Cliente;

public interface ClienteDAO {

	public List<Cliente> findCustomerAll();

	void saveCustomer(Cliente cliente);
}
