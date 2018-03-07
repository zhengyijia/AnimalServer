package animalManager.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.Modifying; 
import org.springframework.transaction.annotation.Transactional;

import animalManager.model.Petinfo;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface PetinfoRepository extends CrudRepository<Petinfo, String> {
	@Query("select petinfo from Petinfo petinfo where petinfo.pet_id=?1")
	public Iterable<Petinfo> findAnimal(String id);

	@Transactional
	@Modifying
	@Query("delete from Petinfo petinfo where petinfo.pet_id=?1")
    public void deleteAnimal(String id);

    @Transactional
    @Modifying
    @Query("update Petinfo petinfo set petinfo.pet_kinds=?2, petinfo.pet_gender=?3, petinfo.pet_age=?4, petinfo.pet_health=?5, petinfo.pet_vaccine=?6, petinfo.pet_remarks=?7 where petinfo.pet_id=?1")
    public void updateAnimal(String id, String name, String gender, int age, 
    	String status, String vaccine, String remark);
}