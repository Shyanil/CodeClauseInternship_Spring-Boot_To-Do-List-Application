package com.example.demo.Controller;


import Model.Model;
import com.example.demo.Respo.Repo;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Locale;

@RestController
@RequestMapping(value = "/todo")

public class Controllerd {
    @Autowired
    private Repo repo;

   @GetMapping
    public List<Model> data(){

       return repo.findAll();

   }
   @PostMapping
   public  Model datacall(@Valid @NotNull @RequestBody Model model){

       model.setDate(LocalDateTime.now());
    return repo.save(model);
   }
}
