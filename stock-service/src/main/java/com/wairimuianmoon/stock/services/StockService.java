package com.wairimuianmoon.stock.services;

import com.wairimuianmoon.stock.entity.StockEntity;

import java.io.IOException;

public interface StockService {

    StockEntity getStock(String stockName) throws IOException;
}
