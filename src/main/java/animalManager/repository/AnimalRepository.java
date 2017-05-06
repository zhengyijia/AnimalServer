package animalManager.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.Modifying; 
import org.springframework.transaction.annotation.Transactional;

import animalManager.model.Animal;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface AnimalRepository extends CrudRepository<Animal, String> {
	@Query("select animal from Animal animal where animal.id=?1")
	public Iterable<Animal> findAnimal(String id);

	@Transactional
	@Modifying
	@Query("delete from Animal animal where animal.id=?1")
    public void deleteAnimal(String id);

    @Transactional
    @Modifying
    @Query("update Animal animal set animal.name=?2, animal.gender=?3, animal.age=?4, animal.status=?5, animal.vaccine=?6, animal.remark=?7 where animal.id=?1")
    public void updateAnimal(String id, String name, String gender, int age, 
    	String status, String vaccine, String remark);
}