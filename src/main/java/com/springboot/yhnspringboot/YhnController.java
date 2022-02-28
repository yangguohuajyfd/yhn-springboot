package com.springboot.yhnspringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class YhnController {


    @RequestMapping("hello")
    public String helloWord(){
        return "helloWord";
    }

}
