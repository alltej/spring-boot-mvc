package alltej.springframework.repositories;

import alltej.springframework.domain.Product;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by at on 12/18/16.
 */
public interface ProductRepository extends CrudRepository<Product, Integer> {
}
