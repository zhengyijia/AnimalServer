package animalManager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import animalManager.model.User;
import animalManager.repository.UserRepository;

@Controller    // This means that this class is a Controller
@RequestMapping(path="/user") // This means URL's start with /demo (after Application path)
public class UserController {
	@Autowired // This means to get the bean called userRepository
	           // Which is auto-generated by Spring, we will use it to handle the data
	private UserRepository userRepository;

	@GetMapping(path="/add") // Map ONLY GET Requests
	public @ResponseBody String addNewUser (@RequestParam String name
			, @RequestParam String password) {
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request

		User user = new User();
		user.setName(name);
		user.setPassword(password);
		userRepository.save(user);
		return "UserSaved";
	}

	@GetMapping(path="/all")
	public @ResponseBody Iterable<User> getAllUsers() {
		// This returns a JSON or XML with the users
		return userRepository.findAll();
	}
	
	@GetMapping(path="/find")
	public @ResponseBody Iterable<User> getUser(@RequestParam String name) {
		return userRepository.findUser(name);
	}

	@GetMapping(path="/delete")
	public @ResponseBody String deleteUser(@RequestParam String name){
		userRepository.deleteUser(name);
		return "UserDeleted";
	}

	@GetMapping(path="/update")
	public @ResponseBody String updateUser(@RequestParam String name, 
			@RequestParam String password){
		userRepository.updateUser(name, password);
		return "UserUpdate";
	}

	@GetMapping(path="/verify")
	public @ResponseBody String verifyUser(@RequestParam String name, 
			@RequestParam String password) {
		Iterable<User> users = userRepository.findUser(name);
		User user = null;
		for(User temp: users){
			user = temp;
		}
		if(user!=null && user.getPassword().equals(password)){
			return "True";
		}else{
			return "False";
		}
	}
}