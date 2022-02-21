package com.wairimuianmoon.stock.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Builder
@Getter
@Setter
public class StockEntity {

    private String company;
    private BigDecimal price;

}
