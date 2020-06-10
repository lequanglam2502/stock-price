package com.colin.test.stock.service;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.colin.app.stock.model.ClientStockPrice;
import com.colin.app.stock.service.impl.ReutersService;

@RunWith(MockitoJUnitRunner.class)
public class ReuterServiceTest {
	@Mock
	ReutersService reutersService;

	@Test
	/**
	 * Test getRealTimeDataReuters
	 */
	public void testGetRealTimeDataReuters() {
		List<ClientStockPrice> result = reutersService.getRealTimeDataReuter();
		assertNotNull(result);
	}
}
