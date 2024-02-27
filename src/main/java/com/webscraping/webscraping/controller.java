package com.webscraping.webscraping;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class controller {

    @Autowired
    private service sv;

    @GetMapping("/getData")
    public Map<String, String>  getInfo(){
        return sv.extractData();
    }
}
