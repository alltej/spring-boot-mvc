package alltej.springframework.services;

import alltej.springframework.commands.CustomerForm;
import alltej.springframework.domain.Customer;

/**
 * Created by at on 11/14/16.
 */
public interface CustomerService extends CRUDService<Customer>{

    Customer saveOrUpdateCustomerForm( CustomerForm customerForm );

}
