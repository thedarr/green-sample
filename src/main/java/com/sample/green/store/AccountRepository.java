package com.sample.green.store;

import com.sample.green.model.Account;
import com.sample.green.model.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Repository to manage {@link Account} instances.
 *
 * @author Oliver Gierke
 */
public interface AccountRepository extends CrudRepository<Account, Long> {

    /**
     * Returns all accounts belonging to the given {@link Customer}.
     *
     * @param customer
     * @return
     */
    List<Account> findByCustomer(Customer customer);
}
