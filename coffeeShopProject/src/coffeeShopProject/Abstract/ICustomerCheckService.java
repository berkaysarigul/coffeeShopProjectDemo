package coffeeShopProject.Abstract;

import coffeeShopProject.Entities.Customer;

public interface ICustomerCheckService {
	
	boolean checkIfRealPerson(Customer customer);

}
