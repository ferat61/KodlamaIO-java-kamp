package concrete;

import abstractss.BaseCustomerManager;
import abstractss.CustomerCheckService;
import entities.Customer;

public class StarbuksCustomerManager extends BaseCustomerManager  {
	
	CustomerCheckService checkService;
	public StarbuksCustomerManager(CustomerCheckService checkService) {
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
