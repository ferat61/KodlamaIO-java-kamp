package interfaceAbstractDemo;

import java.time.LocalDate;

import abstractss.BaseCustomerManager;
import adapters.MernisServiceAdapter;
import concrete.NeroCustomerManager;
import concrete.StarbuksCustomerManager;
import entities.Customer;

public class Main {

	public static void main(String[] args) {
		Customer customer=new Customer(1, "Muhammet", "Ferat", 1999, "8547504264", LocalDate.of(1999,01,21));
		BaseCustomerManager customerManager=new NeroCustomerManager(new MernisServiceAdapter());
		customerManager.save(customer);
		

	}

}
