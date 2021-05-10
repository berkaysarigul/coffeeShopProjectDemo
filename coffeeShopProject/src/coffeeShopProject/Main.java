package coffeeShopProject;

import coffeeShopProject.Abstract.BaseCustomerManager;
import coffeeShopProject.Concrete.StarbucksCustomerManager;
import coffeeShopProject.Entities.*;
import coffeeShopProject.Adapters.*;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager manager = new StarbucksCustomerManager(new MernisServiceAdapters());
		Customer customer = new Customer(1, "Ömer Berkay", "Sarýgül", 2004, "10000000000");
		
		manager.save(customer);
		

	}

}
