package animalManager.controller;

import animalManager.model.AnimalLocWithId;
import animalManager.model.Animalloc_Locinfo;
import animalManager.repository.AnimalLocRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Controller    // This means that this class is a Controller
@RequestMapping(path="/animalloc") // This means URL's start with /demo (after Application path)
public class AnimalLocController {
	@Autowired // This means to get the bean called animalLocRepository
	           // Which is auto-generated by Spring, we will use it to handle the data
	private AnimalLocRepository animalLocRepository;

	@RequestMapping(path="/all")
	public @ResponseBody Iterable<Animalloc_Locinfo> getAllAnimalLoc() {
		// This returns a JSON or XML with the accounts
		return animalLocRepository.findAll();
	}
	
	 @RequestMapping(path="/find")
	 public @ResponseBody
     AnimalLocWithId getAnimalLoc(@RequestParam String pet_id) {
         Iterable<Animalloc_Locinfo> locinfoIterable = animalLocRepository.findLocInfo(pet_id);

         Iterator<Animalloc_Locinfo> iterator = locinfoIterable.iterator();
         if (!iterator.hasNext()) {
             return null;
         }

         Animalloc_Locinfo locinfo = iterator.next();
         AnimalLocWithId locWithId = new AnimalLocWithId();
         locWithId.setLatitude(locinfo.getLatitude());
         locWithId.setLongitude(locinfo.getLongitude());
         locWithId.setPetId(pet_id);
         locWithId.setTime(locinfo.getTime());
         locWithId.setTrack(locinfo.getTrack());
	 	return locWithId;
	 }

	 /* @RequestMapping(path="/finddaily")
    public @ResponseBody
    Iterable<AnimalLocWithId> getDailyAnimalLoc(@RequestParam String pet_id, @RequestParam String time) {
	    Iterable<Animalloc_Locinfo> locinfoIterable = animalLocRepository.findDailyLocInfo(pet_id, time + "%");
	    List<AnimalLocWithId> locWithIdList = new ArrayList<>();

         AnimalLocWithId locWithId = null;

         for (Animalloc_Locinfo locinfo: locinfoIterable) {
            locWithId = new AnimalLocWithId();

            locWithId.setLatitude(locinfo.getLatitude());
            locWithId.setLongitude(locinfo.getLongitude());
            locWithId.setPetId(pet_id);
            locWithId.setTime(time);
            locWithId.setTrack(locinfo.getTrack());

            locWithIdList.add(locWithId);
        }

        return locWithIdList;
     } */

}