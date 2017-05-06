package animalManager.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.Modifying; 
import org.springframework.transaction.annotation.Transactional;

import animalManager.model.User;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<User, String> {
	@Query("select user from User user where user.name=?1")
	public Iterable<User> findUser(String name);

	@Transactional
	@Modifying
	@Query("delete from User user where user.name=?1")
    public void deleteUser(String name);

    @Transactional
    @Modifying
    @Query("update User user set user.password=?2 where user.name=?1")
    public void updateUser(String name, String password);
}