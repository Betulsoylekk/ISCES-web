package com.example.ISCESweb.controller;

import com.example.ISCESweb.entity.Election;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;

@RestController
@CrossOrigin("http://localhost:3000")
public class DemoController {


    @PostMapping("/electionDate")
    public Date setElectionDate(@RequestBody Date date){
        ?????????

    }
}
