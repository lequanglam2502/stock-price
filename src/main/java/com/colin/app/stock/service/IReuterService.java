package com.colin.app.stock.service;

import java.util.List;

import com.colin.app.stock.model.ClientStockPrice;

/**
 * Reuters service interface
 * 
 * @author colinle
 *
 */
public interface IReuterService {
	
	List<ClientStockPrice> getRealTimeDataReuter();

}
