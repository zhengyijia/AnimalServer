package animalManager.repository;

import animalManager.model.AnimalLocPK;
import animalManager.model.Animalloc_Locinfo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called AccountRepository
// CRUD refers Create, Read, Update, Delete

public interface AnimalLocRepository extends CrudRepository<Animalloc_Locinfo, AnimalLocPK> {
	 @Query(value = "select DISTINCT locinfo.* from Animalloc_Locinfo locinfo, AnimalLoc_IMEI locimei " +
             "where locimei.pet_id=?1 and locimei.imei=locinfo.imei and locinfo.time in" +
             " (SELECT max(time) from AnimalLoc_LocInfo locinfo2, AnimalLoc_IMEI locimei2" +
             " where locimei2.pet_id=?1 and locinfo2.imei=locimei2.imei )", nativeQuery = true)
	 public Iterable<Animalloc_Locinfo> findLocInfo(String pet_id);
}