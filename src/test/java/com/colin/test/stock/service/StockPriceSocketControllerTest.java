package com.colin.test.stock.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.colin.app.stock.model.ClientStockPrice;
import com.colin.app.stock.service.impl.ReutersService;
import com.colin.app.stock.socket.StockPriceSocket;

/**
 * This test for controller of stock price socket
 * 
 * @author colinle
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class StockPriceSocketControllerTest {
	@Mock
	ReutersService reutersService;

	@InjectMocks
	StockPriceSocket stockPriceSocketController;
	
	private List<ClientStockPrice> realtimeData;
	
	@Before
    public void setUp() {
		List<ClientStockPrice> assumeData = new ArrayList<ClientStockPrice>();

		ClientStockPrice apple = new ClientStockPrice("AAPL", 10000 + "$", "Up");
		ClientStockPrice google = new ClientStockPrice("GOOGL", 100000 + "$", "Up");
		ClientStockPrice amazon = new ClientStockPrice("AMZN", 1000000 + "$", "Down");
		ClientStockPrice microsoft = new ClientStockPrice("MSFT", 1000000 + "$", "Up");
		ClientStockPrice dbs = new ClientStockPrice("DBS", 1000000 + "$", "Up");

		assumeData.add(apple);
		assumeData.add(google);
		assumeData.add(amazon);
		assumeData.add(microsoft);
		assumeData.add(dbs);
		
		this.realtimeData = assumeData;
    }
 
    @After
    public void tearDown() {
    	this.realtimeData = null;
    }

	/**
	 * Test server socket controller
	 */
	@Test
	public void testSendMessageController() {
		Mockito.when(reutersService.getRealTimeDataReuter()).thenReturn(this.realtimeData); 
		
		List<ClientStockPrice> result = stockPriceSocketController.sendMessage("client socket asks");

		assertNotNull(result);
		assertEquals(result.size(), 5);
	}
}
