import { TestBed, async } from '@angular/core/testing';
import { AppComponent } from './app.component';

/* The test for the app component */
describe('AppComponent', () => {
	beforeEach(async(() => {
		TestBed.configureTestingModule({
			declarations: [
				AppComponent
			],
		}).compileComponents();
	}));

	it('should make the app', () => {
		const fixture = TestBed.createComponent(AppComponent);
		const app = fixture.debugElement.componentInstance;
		expect(app).toBeTruthy();
	});

	it(`should have as title 'DBS Stock Price'`, () => {
		const fixture = TestBed.createComponent(AppComponent);
		const app = fixture.debugElement.componentInstance;
		expect(app.title).toEqual('DBS Stock Price');
	});

	it('should render title DBS Real Time Stock Pricing Display in a h2 tag', async(() => {
		const fixture = TestBed.createComponent(AppComponent);
		fixture.detectChanges();
		const compiled = fixture.debugElement.nativeElement;
		expect(compiled.querySelector('h2').textContent).toContain('DBS Real Time Stock Pricing Display');
	}));
});
