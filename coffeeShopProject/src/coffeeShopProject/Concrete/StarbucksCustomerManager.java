package coffeeShopProject.Concrete;

import coffeeShopProject.Abstract.BaseCustomerManager;
import coffeeShopProject.Abstract.ICustomerCheckService;
import coffeeShopProject.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
	
	ICustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
	@Override
	public void save(Customer customer) {
		
		if (customerCheckService.checkIfRealPerson(customer)) {
			
			super.save(customer);
			
		} else {
			System.out.println("Not a valid person");
		}
		
	}
	

}
