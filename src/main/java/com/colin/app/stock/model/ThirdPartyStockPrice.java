package com.colin.app.stock.model;

/**
 * This is the model to map with Third Party data e.g Reuters data
 * 
 * @author colinle
 *
 */
public class ThirdPartyStockPrice {
	private String symbol;

	private String askPrice;

	private String bidPrice;

	private String eventTime;

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getAskPrice() {
		return askPrice;
	}

	public void setAskPrice(String askPrice) {
		this.askPrice = askPrice;
	}

	public String getBidPrice() {
		return bidPrice;
	}

	public void setBidPrice(String bidPrice) {
		this.bidPrice = bidPrice;
	}

	public String getEventTime() {
		return eventTime;
	}

	public void setEventTime(String eventTime) {
		this.eventTime = eventTime;
	}

}
