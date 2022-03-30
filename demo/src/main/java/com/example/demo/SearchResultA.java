package com.example.demo;


import lombok.Data;

import java.util.List;

@Data
public class SearchResultA {


    private List<String> usualyBrand;

    private List<String> usualySpec;


    private List<String> usualySupply;


    private List<String> usualyProduct;


    private List<String> storageType;

    private double searchCostTime;

    private String searchType;

    List<SearchResultB> searchRespGroupParams;
}
