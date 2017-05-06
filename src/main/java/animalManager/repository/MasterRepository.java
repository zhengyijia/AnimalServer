package animalManager.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.Modifying; 
import org.springframework.transaction.annotation.Transactional;

import animalManager.model.Master;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface MasterRepository extends CrudRepository<Master, Integer> {
	@Query("select master from Master master where master.animal_id=?1")
	public Iterable<Master> findMaster(String animal_id);

	@Transactional
	@Modifying
	@Query("delete from Master master where master.animal_id=?1")
    public void deleteMaster(String animal_id);

    @Transactional
    @Modifying
    @Query("update Master master set master.name=?2, master.gender=?3, master.age=?4, master.address=?5, master.phonenumber=?6, master.email=?7 where master.animal_id=?1")
    public void updateMaster(String animal_id, String name, String gender, int age,
    	String address, String phonenumber, String email);
}