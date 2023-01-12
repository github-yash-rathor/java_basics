package com.yr.springapplication.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping( "/c1" )
public class SpringControllerCh1 {

    @GetMapping(produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<String> getCall() {
        return ResponseEntity.ok("This is a get call");
    }

    @GetMapping(value =  "/{id}", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<String>  getCallwithPath(@PathVariable String id) {
        return ResponseEntity.ok("This is a get call with id : " + id);
    }

    @PostMapping(produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<String> postCall() {
        return ResponseEntity.ok("This is a Post call");
    }

    @PutMapping (produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<String>  putCall() {
        return ResponseEntity.ok("This is a Put call");
    }

    @DeleteMapping(produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<String>  deleteCall() {
        return ResponseEntity.ok("This is a Delete call");
    }
}
