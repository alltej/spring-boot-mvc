package alltej.springframework.repositories;

import alltej.springframework.domain.security.Role;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by at on 12/21/16.
 */
public interface RoleRepsoitory extends CrudRepository<Role, Integer> {
}
