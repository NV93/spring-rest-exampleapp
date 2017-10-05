package lt.spring.rest.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by nevyt on 10/5/2017.
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hi(){
        return "Hi";
    }

}
