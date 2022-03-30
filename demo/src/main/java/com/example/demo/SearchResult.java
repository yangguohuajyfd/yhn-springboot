package com.example.demo;


import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.util.List;

@Data
public class SearchResult {

    private Integer code ;

    private String message;

    private List<SearchResultA> data;

}





