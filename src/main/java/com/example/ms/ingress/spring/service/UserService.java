package com.example.ms.ingress.spring.service;

import com.example.ms.ingress.spring.model.User;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {
    Map<String, User> map = new HashMap<>();
    public void createUser(String id,User user){

        map.put(id,user);
        System.out.println("createUser ----> "+map);
    }
    public void updateUser(String id,User user){
        map.replace(id,user);
        System.out.println("updateUser ---> "+map);

    }

    public String getUser(String id,Long fromAge,Long toAge){
        User user = map.get(id);
        if(fromAge<user.getAge() && toAge> user.getAge())
            return user.toString();
        else
            return  null;
    }

}
