package concrete;

import abstractss.CustomerCheckService;

import entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {



	@Override
	public Boolean CheckIfRealPerson(Customer customer) {
		
		return true;
	}

}
