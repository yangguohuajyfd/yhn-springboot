package com.yhn.elasticsearch.config;

import com.yhn.elasticsearch.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;

@Configuration
public class TriggerConfig {


    @Autowired
    Person person;


    @Bean
    public void setPerson(){
        person.setValue("222");
        person.setName("333");
        person.GlobalTrigger.put("11",11);
        HashMap<String, Object> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("111" , 111);
        person.aaa.set(objectObjectHashMap);
        System.out.println(person);
    }

}
