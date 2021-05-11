package adapters;

import abstractss.CustomerCheckService;
import entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;


public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public Boolean CheckIfRealPerson(Customer customer) {
		KPSPublicSoapProxy proxy=new KPSPublicSoapProxy(); 
		Boolean result=false;
		try {
			result=proxy.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),
				customer.getFirstname().toUpperCase(),customer.getLastname().toUpperCase(),
				customer.getDateofBirth().getYear());
		}catch (Exception e) {
		System.out.println("Not a valid person");
		}
		return result;
	}

}
