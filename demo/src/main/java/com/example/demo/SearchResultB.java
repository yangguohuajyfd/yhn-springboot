package com.example.demo;


import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = false)
public class SearchResultB{

    private String casNo;


    private String cnName;

    private String enName;

    private String mdl;

    private String molFormat;

    private String molWeight;

    private String dmgLevel;

    private String supervisionCond;

    private List<String> usualyBrand;

    private List<String> usualySpec;

    private List<String> usualySupply;

    private List<List<ProductInfoParam>> productInfoParamList;
}
