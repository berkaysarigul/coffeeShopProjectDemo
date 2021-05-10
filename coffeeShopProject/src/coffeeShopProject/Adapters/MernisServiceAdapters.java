package coffeeShopProject.Adapters;


import coffeeShopProject.Abstract.ICustomerCheckService;
import coffeeShopProject.Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapters implements ICustomerCheckService
{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		boolean result = false;
		try {
			
			result = client.TCKimlikNoDogrula(
					Long.valueOf(customer.getNationalityId()),				
					customer.getFirstName().toUpperCase(), 
					customer.getLastName().toUpperCase(), 
					customer.getDateOfBirth()
					);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
		
	}

}
