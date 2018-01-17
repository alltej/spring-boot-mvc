package alltej.springframework.services.reposervices;

import alltej.springframework.domain.security.Role;
import alltej.springframework.repositories.RoleRepsoitory;
import alltej.springframework.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by at on 12/21/16.
 */
@Service
@Profile("springdatajpa")
public class RoleServiceRepoImpl implements RoleService {

    private RoleRepsoitory roleRepsoitory;

    @Autowired
    public void setRoleRepsoitory(RoleRepsoitory roleRepsoitory) {
        this.roleRepsoitory = roleRepsoitory;
    }

    @Override
    public List<?> listAll() {
        List<Role> roles = new ArrayList<>();
        roleRepsoitory.findAll().forEach(roles::add); //fun with Java 8
        return roles;
    }

    @Override
    public Role getById(Integer id) {
        return roleRepsoitory.findOne(id);
    }

    @Override
    public Role saveOrUpdate(Role domainObject) {
        return roleRepsoitory.save(domainObject);
    }

    @Override
    public void delete(Integer id) {
        roleRepsoitory.delete(id);
    }
}
