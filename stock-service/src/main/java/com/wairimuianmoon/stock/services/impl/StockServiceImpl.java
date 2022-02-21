package com.wairimuianmoon.stock.services.impl;

import com.wairimuianmoon.stock.entity.StockEntity;
import com.wairimuianmoon.stock.services.StockService;
import org.springframework.stereotype.Service;
import yahoofinance.Stock;
import yahoofinance.YahooFinance;

import java.io.IOException;
import java.util.Optional;

@Service
public class StockServiceImpl implements StockService {

    @Override
    public StockEntity getStock(String stockName) throws IOException {
        Stock stock = YahooFinance.get(stockName.toUpperCase() + ".SA");
        if(Optional.ofNullable(stock).isEmpty()) return null;

        return StockEntity.builder()
                .company(stock.getName())
                .price(stock.getQuote(true).getPrice())
                .build();
    }
}
