import { TestBed, async } from '@angular/core/testing';
import { StockPriceComponent } from './stock-price.component';
import { DataService } from '../data-server.service';

/* The test for StockPriceComponent */
describe('StockPriceComponent', () => {
	beforeEach(async(() => {
		TestBed.configureTestingModule({
			declarations: [
				StockPriceComponent
			],
			providers: [DataService]
		}).compileComponents();
	}));

	it('should make the stock price component', () => {
		const fixture = TestBed.createComponent(StockPriceComponent);
		const stockPrice = fixture.debugElement.componentInstance;
		expect(stockPrice).toBeTruthy();
	});

	it(`should have as title 'DBS Stock Price'`, () => {
		const fixture = TestBed.createComponent(StockPriceComponent);
		const app = fixture.debugElement.componentInstance;
		expect(app.title).toEqual('DBS Stock Price');
	});

	it('should render colum ', async(() => {
		const fixture = TestBed.createComponent(StockPriceComponent);
		fixture.detectChanges();
		const compiled = fixture.debugElement.nativeElement;
		expect(compiled.querySelector('th').textContent).toContain('Symbol');
	}));
});
