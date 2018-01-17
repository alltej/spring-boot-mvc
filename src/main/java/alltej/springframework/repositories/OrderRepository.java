package alltej.springframework.repositories;

import alltej.springframework.domain.Order;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by at on 12/21/16.
 */
public interface OrderRepository extends CrudRepository<Order, Integer> {
}
