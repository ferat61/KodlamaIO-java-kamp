package concrete;

import abstractss.BaseCustomerManager;
import abstractss.CustomerCheckService;
import entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager{
	CustomerCheckService checkService;
	public NeroCustomerManager(CustomerCheckService checkService) {
		this.checkService=checkService;
	}
	
	public void save(Customer customer) {
		if(checkService.CheckIfRealPerson(customer)) {
			super.save(customer);
			
		}else {
			System.out.println("Kullanýcý bulunamadý");
		}

}
}
