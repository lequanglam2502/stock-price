import { DataService } from '../data-server.service';
import { Component, OnInit } from '@angular/core';

import 'rxjs/add/observable/interval';
import 'rxjs/add/operator/startWith';
import 'rxjs/add/operator/switchMap';

/* The component to show stock price data board */
@Component({
	selector: 'stock-price',
	templateUrl: './stock-price.component.html'
})

export class StockPriceComponent implements OnInit {
	private id: NodeJS.Timer;
	public updatedData = [];

	constructor(private dataService: DataService) {
	}

	ngOnInit() {
		this.id = setInterval(() => {
			this.pingData();
		}, 1000);
	}

	public pingData() {
		this.dataService.pingData();
		this.updatedData = this.dataService.data;

	}
}

export class style { }
