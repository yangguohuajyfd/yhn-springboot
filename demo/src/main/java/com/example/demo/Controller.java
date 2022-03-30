package com.example.demo;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonAlias;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class Controller
{

    @RequestMapping("/a")
    public SearchResult aa(String key){

        String s = HttpClient.doGet("http://127.0.0.1:8888/index.php?f=search&keyword=" + key);
        String s1 = JSON.toJSONString(JSON.parse(s));
        SearchResult searchResult = JSONObject.parseObject(s1, SearchResult.class);

        return null;
    }


    @RequestMapping("/b")
    public String ss(String key){



        return "aaa";
    }

}
