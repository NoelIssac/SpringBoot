package com.ns.controller;
//import org.springframework.web.bind.annotation.RESTController;

import com.ns.model.DetailsModel;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sample")
public class HelloController {

    @PostMapping(path = "sample",
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public void HelloWorld(@RequestBody DetailsModel details){
        System.out.println("Inside Posy");
        System.out.println(details.getId());
    }
}
