package com.example.SecondClassApplication.controller;

import com.example.SecondClassApplication.entity.SecondClass;
import com.example.SecondClassApplication.service.SecondClassService;

import jakarta.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

//import javax.validation.Valid;
import java.util.Arrays;
import java.util.List;

@RestController
//@RequestMapping(value = "/SecondClass")
public class ApiController {

    @Autowired(required=true)
    private SecondClassService secondClassService;

    @Autowired
    private RestTemplate restTemplate;

    private final Logger LOGGER =  LoggerFactory.getLogger(ApiController.class);

    private static String url="http://localhost:8089/FirstClass";

    @GetMapping("/FirstClass")
    public List<Object> getName(){
        LOGGER.info("Inside getName of FirstClassController");
        Object[] firstClass = restTemplate.getForObject(url, Object[].class);
        return Arrays.asList(firstClass);
    }

    @PostMapping("/SecondClass/saveName")
    public SecondClass saveName(@Valid @RequestBody SecondClass secondClass) {
        LOGGER.info("Inside saveName of SecondClassController");
        return secondClassService.saveName(secondClass);
    }

    @GetMapping("/SecondClass")
    public List<SecondClass> getAll() {
        LOGGER.info("Inside getAll of SecondClassController");
        return secondClassService.getAll();
    }



    @GetMapping("/SecondClass/getById/{id}")
    public SecondClass getById(@PathVariable("id")Integer id){
        LOGGER.info("Inside getById of SecondClassController");
        return secondClassService.getById(id);
    }

    @PutMapping("/SecondClass/updateById/{id}")
    public SecondClass updateById(@PathVariable("id") Integer id, @RequestBody SecondClass secondClass) {
        LOGGER.info("Inside updateById of SecondClassController");
        return secondClassService.updateById(id,secondClass);
    }

    @DeleteMapping("/SecondClass/deleteById/{id}")
    public String deleteById(@PathVariable("id") Integer id) {
        LOGGER.info("Inside deleteById of SecondClassController");
        secondClassService.deleteById(id);
        return "Successfully deleted";
    }
}
