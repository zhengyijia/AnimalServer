package animalManager.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.Modifying; 
import org.springframework.transaction.annotation.Transactional;

import animalManager.model.Foodinfo;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface FoodinfoRepository extends CrudRepository<Foodinfo, String> {
	@Query("select foodinfo from Foodinfo foodinfo where foodinfo.food_username=?1 and foodinfo.food_year=?2 and foodinfo.food_month=?3 and foodinfo.food_day=?4")
	public Iterable<Foodinfo> findDailyFood(String username, int year, int month, int day);

    @Query("select foodinfo from Foodinfo foodinfo where foodinfo.food_username=?1 and foodinfo.food_year=?2 and foodinfo.food_month=?3")
    public Iterable<Foodinfo> findMonthFood(String username, int year, int month);

    @Query("select foodinfo from Foodinfo foodinfo where foodinfo.food_username=?1 and foodinfo.food_year=?2 and foodinfo.food_month=?3 and foodinfo.food_day=?4 and foodinfo.food_type=?5")
    public Iterable<Foodinfo> findFoodRecord(String username, int year, int month, int day, String type);

	@Transactional
	@Modifying
	@Query("delete from Foodinfo foodinfo where foodinfo.food_username=?1 and foodinfo.food_year=?2 and foodinfo.food_month=?3 and foodinfo.food_day=?4 and foodinfo.food_type=?5")
    public void deleteFood(String username, int year, int month, int day, String type);

    @Transactional
    @Modifying
    @Query("update Foodinfo foodinfo set foodinfo.food_weight=?6, foodinfo.food_energy=?7 where foodinfo.food_username=?1 and foodinfo.food_year=?2 and foodinfo.food_month=?3 and foodinfo.food_day=?4 and foodinfo.food_type=?5")
    public void updateFood(String username, int year, int month, int day, String type, int weight, int energy);
}