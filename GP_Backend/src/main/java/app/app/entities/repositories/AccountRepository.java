package app.app.entities.repositories;

import app.app.entities.Account;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account,String> {

    Account findUserByUsernameAndPassword(String username, String password);
}
