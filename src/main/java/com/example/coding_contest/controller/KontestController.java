package com.example.coding_contest.controller;

import com.example.coding_contest.models.KontestAll;
import com.example.coding_contest.service.KontestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(allowedHeaders = "*", origins = "http://localhost:3000")
public class KontestController {
    @Autowired
    KontestService kontestService;

    @GetMapping("/get/all")
    public KontestAll[] getAllKontest(){
        return kontestService.getAllKontest();
    }
}
