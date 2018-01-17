package alltej.springframework.repositories;

import alltej.springframework.domain.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by at on 12/21/16.
 */
public interface UserRepository extends CrudRepository<User, Integer> {

    User findByUsername( String username );
}
