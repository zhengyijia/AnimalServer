package animalManager.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.Modifying; 
import org.springframework.transaction.annotation.Transactional;

import animalManager.model.Account;

// This will be AUTO IMPLEMENTED by Spring into a Bean called AccountRepository
// CRUD refers Create, Read, Update, Delete

public interface AccountRepository extends CrudRepository<Account, String> {
	@Query("select account from Account account where account.username=?1")
	public Iterable<Account> findAccount(String name);

	@Transactional
	@Modifying
	@Query("delete from Account account where account.username=?1")
    public void deleteAccount(String name);

    @Transactional
    @Modifying
    @Query("update Account account set account.password=?2 where account.username=?1")
    public void updateAccount(String name, String password);
}