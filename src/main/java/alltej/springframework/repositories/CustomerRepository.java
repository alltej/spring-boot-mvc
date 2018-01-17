package alltej.springframework.repositories;

import alltej.springframework.domain.Customer;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by at on 12/21/16.
 */
public interface CustomerRepository extends CrudRepository<Customer, Integer> {
}
