package com.colin.app.stock.service.impl;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.colin.app.stock.model.ClientStockPrice;
import com.colin.app.stock.service.IReuterService;

/**
 * This service used to get real time data from Reuters and return data to
 * server socket
 * 
 * @author colinle
 *
 */
@Service
public class ReutersService implements IReuterService {

	/**
	 * call real time Reuters API or service here to get the list of updated stock
	 * price
	 */
	@Override
	public List<ClientStockPrice> getRealTimeDataReuter() {
		List<ClientStockPrice> realtimeData = new ArrayList<ClientStockPrice>();

		ClientStockPrice apple = new ClientStockPrice("AAPL", adjustPrice(Math.random()) + "$", rateTrend());
		ClientStockPrice google = new ClientStockPrice("GOOGL", adjustPrice(Math.random()) + "$", rateTrend());
		ClientStockPrice amazon = new ClientStockPrice("AMZN", adjustPrice(Math.random()) + "$", rateTrend());
		ClientStockPrice microsoft = new ClientStockPrice("MSFT", adjustPrice(Math.random()) + "$", rateTrend());
		ClientStockPrice dbs = new ClientStockPrice("DBS", adjustPrice(Math.random()) + "$", rateTrend());

		realtimeData.add(apple);
		realtimeData.add(google);
		realtimeData.add(amazon);
		realtimeData.add(microsoft);
		realtimeData.add(dbs);

		return realtimeData;
	}

	/**
	 * This method used to format price by ####0.00
	 * 
	 * @param price
	 * @return
	 */
	public String adjustPrice(double price) {
		DecimalFormat df = new DecimalFormat("####0.00");

		return df.format(price * 10000);

	}

	/**
	 * This method used to rate the trend The trend based on the business logic or
	 * by calling real time stock pricing from Reuters The Math.ramdom() used for
	 * demo purpose
	 * 
	 * @return
	 */
	private String rateTrend() {
		double price = Math.random();

		if (price < 0.4) {
			return "Up";
		} else if (price > 0.4 && price < 0.6) {
			return "Equal";
		} else {
			return "Down";
		}
	}

}
