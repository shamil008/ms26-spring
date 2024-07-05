package com.example.ms.ingress.spring.controller;


import com.example.ms.ingress.spring.service.UserService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;



@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    private void test(){
        userService.test();
    }
}

// v1/bookings/{id} -GET
// v1/bookings - GET
// v1/bookings/{id} -DELETE
// v1/bookings/{id} -PUT
// v1/bookings -POST
// v1/lombard-credits?fromAmount=1000&toAmount=5000&page=1&size=10&sortBy=date,DESC
// v1/competitions/{competition_id}/teams/{team_id}
