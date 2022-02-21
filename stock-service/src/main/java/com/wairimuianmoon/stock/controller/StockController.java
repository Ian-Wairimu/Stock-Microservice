package com.wairimuianmoon.stock.controller;

import com.wairimuianmoon.stock.services.StockService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/stock")
public class StockController {
    private final StockService stockService;

    public StockController(StockService stockService) {
        this.stockService = stockService;
    }
    @GetMapping("/price/{name}")
    public ResponseEntity<Object> getStock(@PathVariable("name") String stockName)throws IOException {
        return ResponseEntity.ok(stockService.getStock(stockName));
    }
}
