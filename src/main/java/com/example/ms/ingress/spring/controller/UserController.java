package com.example.ms.ingress.spring.controller;


import com.example.ms.ingress.spring.model.User;
import com.example.ms.ingress.spring.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

import static org.springframework.http.HttpStatus.CREATED;


@RestController
@RequestMapping("v1/user/")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;


    @PostMapping
    @ResponseStatus(CREATED)
    public void createUser(@RequestBody User user){
        UUID uuid = UUID.randomUUID();
        String uuidAsString = uuid.toString();
        System.out.println("id -> "+uuidAsString);
        userService.createUser(uuidAsString,user);
    }
    @PutMapping("/{id}")
    public void updateUser(@PathVariable String id,@RequestBody User user){
        userService.updateUser(id,user);
    }

    @GetMapping("/{id}")
    public String getUser(@PathVariable String id, @RequestParam Long fromAge,@RequestParam Long toAge){
       return userService.getUser(id,fromAge,toAge);
    }




}

// v1/bookings/{id} -GET
// v1/bookings - GET
// v1/bookings/{id} -DELETE
// v1/bookings/{id} -PUT
// v1/bookings -POST
// v1/lombard-credits?fromAmount=1000&toAmount=5000&page=1&size=10&sortBy=date,DESC
// v1/competitions/{competition_id}/teams/{team_id}
