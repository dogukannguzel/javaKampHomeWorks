package Concrete;


import Abstract.BaseCustomerManager;


public class NeroCustomerManager extends BaseCustomerManager  {

	
	@Override
	public void save(Customer customer) {
	System.out.println(customer.getFirstName() + " nero saved to db. "  )
	}

}
