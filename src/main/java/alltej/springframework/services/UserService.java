package alltej.springframework.services;

import alltej.springframework.domain.User;

/**
 * Created by at on 12/14/16.
 */
public interface UserService extends CRUDService<User> {

    User findByUserName( String userName );

}
