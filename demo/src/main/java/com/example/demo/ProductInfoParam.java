package com.example.demo;


import lombok.Data;
import org.omg.PortableInterceptor.INACTIVE;

import java.math.BigDecimal;

@Data
public class ProductInfoParam {
    private String pid;

    private String barcode;

    private Integer sid;

    private String supplyName;

    private String supply_name;

    private String contactPhone;

    private String contactPerson;

    private Integer ifHidden;

    private String brand;

    private String cas;

    private String goodsno;

    private String spec;

    private String stockDetail;

    private String stock_detail;

    private String cnName;

    private String enName;

    private String qualitySpec;

    private BigDecimal listPrice;

    private BigDecimal offprice;

    private BigDecimal discountRate;

    private BigDecimal offPriceWithoutTax;

    private BigDecimal price;

    private BigDecimal promotionPrice;

    private String purity;

    private String mdl;

    private String molWeight;

    private String molFormat;
    private String delivery;

    private String thirdCode;

    private Integer stocknum;

    private Integer canGetNum;

    private Double canGetJiliang;

    private String supervisionCond;

    private String dmgLevel;

    private String storageTemprature;

    private String transportCond;

    //仓库相关
    private Integer areaId;

    private Integer storageId;

    private Integer departmentId;
    private String departmentIdStr;

    private Integer goodsType;
    private Integer uid;
    private String batchNum;

    //数量
    private Integer num;
    //收货数量
    private Integer receiveNum;
    //货位
    private String recommendGoodsPlace;
    //库存占用状态
    private Integer holdStatus;

    //订单产品
    private String taxRate;

    private String buyUserName;

    private Double maxJiliang;


    private Double jiliang;

    private String jiliangUnit;

    private Double currentJiliang;

    private BigDecimal roughWeight;

    private Double density;

    private Integer isBack;

    private Integer storageDetailProductId;

    private Integer isSpilt;

    private String fundsName;

    private String areaName;

    private String productFstType;

    private String coaFile;

    private String jiliangAndBack;
}
