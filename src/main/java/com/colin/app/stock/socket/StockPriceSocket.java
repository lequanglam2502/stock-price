package com.colin.app.stock.socket;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.colin.app.stock.model.ClientStockPrice;
import com.colin.app.stock.service.IReuterService;

/**
 * This controller is a socket to listen to the client request and return the
 * real time data getting from Reuters
 * 
 * @author colinle
 *
 */
@Controller
public class StockPriceSocket {

	@Autowired
	IReuterService reuterService;

	/**
	 * The socket to return real time data to client
	 * 
	 * @param message
	 * @return
	 */
	@MessageMapping("/ping/data")
	@SendTo("/update")
	public List<ClientStockPrice> sendMessage(String message) {
		return reuterService.getRealTimeDataReuter();
	}
}
