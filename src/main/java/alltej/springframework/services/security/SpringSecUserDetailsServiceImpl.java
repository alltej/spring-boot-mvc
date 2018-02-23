package alltej.springframework.services.security;

import alltej.springframework.domain.User;
import alltej.springframework.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.convert.converter.Converter;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * Created by at on 12/28/16.
 */
@Service("userDetailsService")
public class SpringSecUserDetailsServiceImpl implements UserDetailsService {

    private UserService userService;
    private Converter<User, UserDetails> userUserDetailsConverter;

    @Autowired
    public SpringSecUserDetailsServiceImpl( UserService userService,
            Converter<User, UserDetails> userUserDetailsConverter ) {
        this.userService = userService;
        this.userUserDetailsConverter = userUserDetailsConverter;
    }
//
//    @Autowired
//    public void setUserService(UserService userService) {
//        this.userService = userService;
//    }
//
//    @Autowired
//    @Qualifier(value = "userToUserDetails")
//    public void setUserUserDetailsConverter(Converter<User, UserDetails> userUserDetailsConverter) {
//        this.userUserDetailsConverter = userUserDetailsConverter;
//    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        return userUserDetailsConverter.convert(userService.findByUserName(username));
    }
}
