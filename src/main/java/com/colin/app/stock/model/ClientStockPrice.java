package com.colin.app.stock.model;

/**
 * This model to map in our client data
 * 
 * @author colinle
 *
 */
public class ClientStockPrice {
	private String symbol;

	private String price;

	private String trend;

	public ClientStockPrice(String symbol, String price, String trend) {
		this.symbol = symbol;
		this.price = price;
		this.trend = trend;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getTrend() {
		return trend;
	}

	public void setTrend(String trend) {
		this.trend = trend;
	}
}
