package com.escola.uniforme.user;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import at.favre.lib.crypto.bcrypt.BCrypt;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;


import at.favre.lib.crypto.bcrypt.BCrypt;




@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserRepository userRepository;

    @GetMapping("/one")
    public String getMethodName() {
        return "teste";
    }
    
    /* 
    @PostMapping("/")
    public UserModel getUser(@RequestBody UserModel usermodel) {
        var userteste = this.userRepository.save(usermodel);
        return userteste;
    } 
        //
     codigo sem tratamento para usuarios ja existente
    */

    @PostMapping("/")
    public ResponseEntity getUser(@RequestBody UserModel usermodel) {
        var user = this.userRepository.findByUsername(usermodel.getUsername());

        if (user != null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("ja cadstrado");
        }

        var passwordHashred = BCrypt.withDefaults()
                .hashToString(12, usermodel.getPassword().toCharArray());

        usermodel.setPassword(passwordHashred);

        var emailHash = BCrypt.withDefaults()
                .hashToString(12, usermodel.getEmail().toCharArray());

        usermodel.setEmail(emailHash);
        var userteste = this.userRepository.save(usermodel);
        return ResponseEntity.status(HttpStatus.CREATED).body(userteste);

        }


        
    }
    
    

