package com.spgbt.controller;

import com.spgbt.model.ChuckNorris;
import com.spgbt.service.ChuckNorrisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("chuck-norris")
public class ChuckNorrisController {

    @Autowired
    private ChuckNorrisService chuckNorrisService;

    @GetMapping("/")
    public ChuckNorris getRandom(){
        return chuckNorrisService.getRandom();
    }
}
