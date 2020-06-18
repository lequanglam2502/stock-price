package com.colin.test.stock.service;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.colin.app.stock.controller.StockPriceSocketController;
import com.colin.app.stock.model.ClientStockPrice;
import com.colin.app.stock.service.impl.ReutersService;

@RunWith(MockitoJUnitRunner.class)
public class ReuterServiceTest {
	@Mock
	ReutersService reutersService;

	@InjectMocks
	StockPriceSocketController stockPriceSocketController;

	/**
	 * Test service getRealTimeDataReuters
	 */
	@Test
	public void testGetRealTimeDataReuters() {
		ReutersService service = new ReutersService();

		List<ClientStockPrice> result = service.getRealTimeDataReuter();
		assertNotNull(result);
	}

	/**
	 * Test controller
	 */
	@Test
	public void testSendMessageController() {
		assertNotNull(stockPriceSocketController.sendMessage("client socket asks"));
	}
}
