package alltej.springframework.services;

import java.util.List;

/**
 * Created by at on 11/14/16.
 */
public interface CRUDService<T> {
    List<?> listAll();

    T getById( Integer id );

    T saveOrUpdate( T domainObject );

    void delete( Integer id );
}
