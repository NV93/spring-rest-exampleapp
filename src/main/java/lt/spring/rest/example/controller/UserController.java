package lt.spring.rest.example.controller;


import lt.spring.rest.example.entity.User;
import lt.spring.rest.example.entity.requests.AddUserRequest;
import lt.spring.rest.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by nevyt on 10/4/2017.
 */

//TODO someday make a timer web service(maybe?)
@RestController
@RequestMapping("/users")
public class UserController {

    private UserRepository userRepository;


    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

//TODO write add user method, and some other database manipulation methods. ggwp

    @RequestMapping(method = RequestMethod.POST)
    public void addUser(@RequestBody AddUserRequest addUserRequest) {
        User user = new User();
        user.setName(addUserRequest.getName());
        user.setSurname(addUserRequest.getSurname());
        userRepository.save(user);

    }


}
