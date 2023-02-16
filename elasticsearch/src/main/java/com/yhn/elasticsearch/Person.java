package com.yhn.elasticsearch;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
@Data
public class Person {

    String name;

    String value;

    public static HashMap<String, Object> GlobalTrigger = new HashMap<>();


    public ThreadLocal<HashMap<String, Object>> aaa = new ThreadLocal<>();
}
