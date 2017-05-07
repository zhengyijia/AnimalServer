package animalManager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import animalManager.model.Master;
import animalManager.repository.MasterRepository;

@Controller    // This means that this class is a Controller
@RequestMapping(path="/master") // This means URL's start with /demo (after Application path)
public class MasterController {
	@Autowired // This means to get the bean called userRepository
	           // Which is auto-generated by Spring, we will use it to handle the data
	private MasterRepository masterRepository;

	@RequestMapping(path="/add") // Map ONLY GET Requests
	public @ResponseBody String addNewMaster (@RequestParam String animal_id, 
			@RequestParam String name, @RequestParam String gender, 
			@RequestParam int age, @RequestParam String address, 
			@RequestParam String phonenumber, @RequestParam String email) {
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request

		Master master = new Master();
		master.setAnimalId(animal_id);
		master.setName(name);
		master.setGender(gender);
		master.setAge(age);
		master.setAddress(address);
		master.setPhonenumber(phonenumber);
		master.setEmail(email);
		masterRepository.save(master);
		return "MasterSaved";
	}

	@RequestMapping(path="/all")
	public @ResponseBody Iterable<Master> getAllMasters() {
		// This returns a JSON or XML with the users
		return masterRepository.findAll();
	}
	
	@RequestMapping(path="/find")
	public @ResponseBody Iterable<Master> getMaster(@RequestParam String animal_id) {
		return masterRepository.findMaster(animal_id);
	}

	@RequestMapping(path="/delete")
	public @ResponseBody String deleteMaster(@RequestParam String animal_id){
		masterRepository.deleteMaster(animal_id);
		return "MasterDeleted";
	}

	@RequestMapping(path="/update")
	public @ResponseBody String updateMaster(@RequestParam String animal_id, 
			@RequestParam String name, @RequestParam String gender, 
			@RequestParam int age, @RequestParam String address, 
			@RequestParam String phonenumber, @RequestParam String email){
		masterRepository.updateMaster(animal_id, name, gender, age, address, phonenumber, email);
		return "MasterUpdate";
	}
}