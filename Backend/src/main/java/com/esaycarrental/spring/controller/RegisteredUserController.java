package com.esaycarrental.spring.controller;

import com.esaycarrental.spring.dto.RegisteredUserDTO;
import com.esaycarrental.spring.service.RegisteredUserService;
import com.esaycarrental.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * @author Helitha Sri
 * @created 7/6/2022 - 11:25 PM
 * @project Easy Car Rental
 */

@RestController
@RequestMapping("api/user")
@CrossOrigin
public class RegisteredUserController {

    @Autowired
    RegisteredUserService userService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil getAllUsers(){
        return new ResponseUtil(200,"Ok",userService.getAllUsers());
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil saveUser(@ModelAttribute RegisteredUserDTO userDTO){
        userService.saveUser(userDTO);
        return new ResponseUtil(200,"New User Create Successfully",null);
    }

}
