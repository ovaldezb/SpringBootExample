package mx.com.ovaldez.store.customer.service;

import java.util.List;

import mx.com.ovaldez.store.customer.repository.entity.Customer;
import mx.com.ovaldez.store.customer.repository.entity.Region;

public interface CustomerService {

    public List<Customer> findCustomerAll();
    public List<Customer> findCustomersByRegion(Region region);

    public Customer createCustomer(Customer customer);
    public Customer updateCustomer(Customer customer);
    public Customer deleteCustomer(Customer customer);
    public  Customer getCustomer(Long id);



}
