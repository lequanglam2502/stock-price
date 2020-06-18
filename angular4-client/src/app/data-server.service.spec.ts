import { TestBed } from '@angular/core/testing';
import { DataService } from './data-server.service';


describe('UsersService', () => {
	let dataService: DataService;
	
	

	beforeEach(() => {
		TestBed.configureTestingModule({
			providers: [DataService]
		});

		dataService = TestBed.get(DataService);
	});

	it('should be created', () => {
		expect(dataService).toBeTruthy();
	});

	/*describe('pingData', () => {
		it('should return stock price data', () => {
			dataService.initializeWebSocketConnection();
			dataService.pingData();

			expect(dataService.data).toBeTruthy();
		});
	});*/

});