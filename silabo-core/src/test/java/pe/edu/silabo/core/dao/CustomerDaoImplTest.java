package pe.edu.silabo.core.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import pe.edu.silabo.core.domain.Cliente;

/**
 * 
 * @author ocalin
 *
 */

public class CustomerDaoImplTest extends AbstractUnitTest {

	@Autowired
	protected ClienteDAO ClienteDAO;

	public void testCustomerList() {
		System.out.println("::::: " + ClienteDAO.findCustomerAll());
		
		List<Cliente>  list = ClienteDAO.findCustomerAll();
		assertNotNull(list);
		assertEquals(3, list.size());

//		logger.info("::::::::: size :::::::: " + ClienteDAO.findCustomerAll());
	}

	public void testSaveCliente() {
		Cliente cliente = new Cliente();
		cliente.setFirstName("Roger");
		cliente.setDniRucNumber("7777777");
		ClienteDAO.saveCustomer(cliente);
		
		setComplete();
		
//		List<Cliente> list = customerDao.findCustomerByAllName("pe");
//		assertNotNull(list);

	}

}
