package animalManager.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.Modifying; 
import org.springframework.transaction.annotation.Transactional;

import animalManager.model.Masterinfo;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface MasterinfoRepository extends CrudRepository<Masterinfo, Integer> {
	@Query("select masterinfo from Masterinfo masterinfo where masterinfo.pet_id=?1")
	public Iterable<Masterinfo> findMaster(String animal_id);

	@Transactional
	@Modifying
	@Query("delete from Masterinfo masterinfo where masterinfo.pet_id=?1")
    public void deleteMaster(String animal_id);

    @Transactional
    @Modifying
    @Query("update Masterinfo masterinfo set masterinfo.master_name=?2, masterinfo.master_gender=?3, masterinfo.master_age=?4, masterinfo.master_addr=?5, masterinfo.master_phonenumber=?6, masterinfo.master_email=?7 where masterinfo.pet_id=?1")
    public void updateMaster(String animal_id, String name, String gender, int age,
    	String address, String phonenumber, String email);
}