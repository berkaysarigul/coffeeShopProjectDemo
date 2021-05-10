package coffeeShopProject.Concrete;

import coffeeShopProject.Abstract.ICustomerCheckService;
import coffeeShopProject.Entities.Customer;

public class CustomerCheckManager implements ICustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		return true;
	}

}
