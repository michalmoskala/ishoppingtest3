package com.example.myapp.Users.Controller;


import com.example.myapp.Users.Repository.Entity.UserEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UsersRestController {


    @GetMapping("/{id}")
    public UserEntity userEntity(@PathVariable long id) {
        System.out.println("==== in greeting ====");
        return new UserEntity(id,"mihu","m@m.c","admin1");
    }

}


