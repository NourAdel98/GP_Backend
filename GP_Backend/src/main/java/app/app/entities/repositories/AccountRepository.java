package app.app.entities.repositories;

import app.app.entities.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends CrudRepository<Account,String> {

    Account findAccountByEmailAndPassword(String email, String password);
    Account findAccountByEmail(String email);
}
