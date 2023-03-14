package com.example.springbootdemo.example;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
public class example {
    @GetMapping("/")
//    @GetMapping("/{str}")
    public void example(){
        System.out.println("test");
    }

    // @RequestBody User user
    /* Controller - 주요 Annotation */
//    @PostMapping
//    @DeleteMapping
//    @PutMapping
//    @RequestMapping
//    @PathVariable
//    @RequestBody
    // Restful API
    // Rest규약

    /* Service - 주요 Annotation */
//    @Service
//    @Component
//    @Transactional

    //Controller - Service
}
