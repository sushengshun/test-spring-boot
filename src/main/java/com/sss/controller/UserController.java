package com.sss.controller;

import com.sss.model.User;
import com.sss.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getAll")
    public List<User> getAll(){

        User user = new User();
        user.setName("sss");
        user.setAddress("上饶");
        List<User> result = userService.getAll();
        System.out.println(result.get(0));

        List<User> resultb = userService.getAllB();
        System.out.println(resultb.get(0));

        //userService.updateTest("1","123");

        return result;

    }
}
