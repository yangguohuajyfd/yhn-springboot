package com.yhn.elasticsearch;

import com.alibaba.fastjson.JSON;
import lombok.Data;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexRequestBuilder;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.xcontent.XContentType;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

@SpringBootTest
class ElasticsearchApplicationTests {

    @Autowired
    private RestHighLevelClient client;

    @Test
    void contextLoads() throws IOException {
        IndexRequest user = new IndexRequest("user");



        user.id();
        User user1 = new User();
        user1.setAge(18);
        user1.setName("yanghongnian");
        user1.setGender("n");
        String s = JSON.toJSONString(user1);
         user.source(s, XContentType.JSON);

        client.index(user, RequestOptions.DEFAULT);

    }

    @Data
    class User{
        private String name ;
        private Integer age ;
        private String gender ;
    }

}
