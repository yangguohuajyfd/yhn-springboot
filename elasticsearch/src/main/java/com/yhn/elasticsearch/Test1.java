package com.yhn.elasticsearch;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test1 {



    @Autowired
    Person person;



    @RequestMapping("22")
    public Person getPerson(){
        System.out.println(person);
        person.setName("123123");
        person.setValue("456");
        person.GlobalTrigger.put("22",22);
        person.aaa.get().put("22",22);
        person.GlobalTrigger.put("11",33);
        person.aaa.get().put("11",33);
        return person;
    }
}
