package com.yhn.elasticsearch;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test2 {



    @Autowired
    Person person;

    @RequestMapping("11")
    public Person getPerson(){
        System.out.println(person);
        person.setName("qwe");
        person.setValue("asd");
        Object o = person.GlobalTrigger.get("11");
        Object o1 = person.aaa.get().get("11");
        return person;
    }
}
