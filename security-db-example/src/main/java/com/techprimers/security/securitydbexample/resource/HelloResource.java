package com.techprimers.security.securitydbexample.resource;

import com.techprimers.security.securitydbexample.model.Users;
import com.techprimers.security.securitydbexample.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/rest/hello")
@RestController
public class HelloResource {

    @Autowired
    UsersRepository repository;

    @GetMapping("/all")
    public String hello(){
        return "Hello People";
    }

    @GetMapping("/allUser")
    public List<Users> allUsers(){
        return repository.findAll();
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/secured/all")
    public String secureHello(){
        return "Secure Hello";
    }
}
