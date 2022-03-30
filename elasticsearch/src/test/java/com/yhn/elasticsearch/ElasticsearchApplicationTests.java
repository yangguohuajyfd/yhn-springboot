package com.yhn.elasticsearch;

import com.alibaba.fastjson.JSON;
import lombok.Data;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexRequestBuilder;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.xcontent.XContentType;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.naming.directory.SearchResult;
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


    //elastic search api

    @Test
    public void search() throws IOException {

        SearchRequest searchRequest = new SearchRequest();


        searchRequest.indices("bank");
        SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
        searchSourceBuilder.query(QueryBuilders.matchAllQuery());


        searchSourceBuilder.from(1);
        searchSourceBuilder.size(100);

        searchRequest.source(searchSourceBuilder);
        SearchResponse search = client.search(searchRequest, RequestOptions.DEFAULT);

        System.out.println(search.toString());

    }

    @Data
    class User{
        private String name ;
        private Integer age ;
        private String gender ;
    }

}
