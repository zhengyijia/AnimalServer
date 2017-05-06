package animalManager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import animalManager.model.Animal;
import animalManager.repository.AnimalRepository;

@Controller    // This means that this class is a Controller
@RequestMapping(path="/animal") // This means URL's start with /demo (after Application path)
public class AnimalController {
	@Autowired // This means to get the bean called userRepository
	           // Which is auto-generated by Spring, we will use it to handle the data
	private AnimalRepository animalRepository;

	@GetMapping(path="/add") // Map ONLY GET Requests
	public @ResponseBody String addNewAnimal (@RequestParam String id, 
			@RequestParam String name, @RequestParam String gender, 
			@RequestParam int age, @RequestParam String status, 
			@RequestParam String vaccine, @RequestParam String remark) {
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request

		Animal animal = new Animal();
		animal.setId(id);
		animal.setName(name);
		animal.setGender(gender);
		animal.setAge(age);
		animal.setStatus(status);
		animal.setVaccine(vaccine);
		animal.setRemark(remark);
		animalRepository.save(animal);
		return "AnimalSaved";
	}

	@GetMapping(path="/all")
	public @ResponseBody Iterable<Animal> getAllAnimals() {
		// This returns a JSON or XML with the users
		return animalRepository.findAll();
	}
	
	@GetMapping(path="/find")
	public @ResponseBody Iterable<Animal> getUser(@RequestParam String id) {
		return animalRepository.findAnimal(id);
	}

	@GetMapping(path="/delete")
	public @ResponseBody String deleteAnimal(@RequestParam String id){
		animalRepository.deleteAnimal(id);
		return "AnimalDeleted";
	}

	@GetMapping(path="/update")
	public @ResponseBody String updateAnimal(@RequestParam String id, 
			@RequestParam String name, @RequestParam String gender, 
			@RequestParam int age, @RequestParam String status, 
			@RequestParam String vaccine, @RequestParam String remark){
		animalRepository.updateAnimal(id, name, gender, age, status, vaccine, remark);
		return "AnimalUpdate";
	}
}