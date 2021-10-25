package com.example.demo.Controllers;

import java.util.ArrayList;

import com.example.demo.Models.CardBinModel;
import com.example.demo.Repositories.CardBindRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CardBindController {
    @Autowired
    CardBindRepository repository; 
    
    @GetMapping
    public ArrayList<CardBinModel> obtenerusuarios(){
        return CardBindRepository.obtenerusuarios;

    } 
}
