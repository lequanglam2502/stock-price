package com.colin.test.stock.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import com.colin.app.stock.model.ClientStockPrice;
import com.colin.app.stock.service.impl.ReutersService;

/**
 * This test for service that getting real time data from Reuters
 * 
 * @author colinle
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class ReuterServiceTest {
	@InjectMocks
	ReutersService reutersService;

	/**
	 * Test service getRealTimeDataReuters
	 */
	@Test
	public void testGetRealTimeDataReuters() {
		List<ClientStockPrice> result = reutersService.getRealTimeDataReuter();
		assertNotNull(result);
		assertEquals(result.size(), 5);
	}

	/**
	 * Test adjustPrice method
	 */
	@Test
	public void testAdjustPrice() {
		String result = reutersService.adjustPrice(5);
		assertEquals(result, "50000.00");
	}

}
