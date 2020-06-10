package com.colin.app.stock.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.colin.app.stock.model.ClientStockPrice;
import com.colin.app.stock.service.IReuterService;

@Controller
public class StockPriceSocketController {

	@Autowired
	IReuterService reuterService;

	@MessageMapping("/ping/data")
	@SendTo("/update")
	public List<ClientStockPrice> sendMessage(String message) {
		return reuterService.getRealTimeDataReuter();
	}
}
