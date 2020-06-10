import { Injectable, Input } from '@angular/core';
import 'rxjs/add/operator/toPromise';

import { StockPrice } from './stockprice';

declare var SockJS;
declare var Stomp;

@Injectable()
export class DataService {
	// create connection
	public stompClient;
	public data: StockPrice[];

	constructor() {
		this.initializeWebSocketConnection();
	}

	public initializeWebSocketConnection() {
		const serverUrl = 'http://localhost:8181/stock';
		const ws = new SockJS(serverUrl);
		this.stompClient = Stomp.over(ws);
		const that = this;
		this.stompClient.connect({}, function(frame) {
			that.stompClient.subscribe('/update', (receivedData) => {
				if (receivedData.body) {
					that.data = JSON.parse(receivedData.body);
				} else {
					this.handleError("");
				}
			});
		});
	}

	public pingData() {
		this.stompClient.send('/app/ping/data', {}, "Client Asks Updated Data");
	}

	private handleError(error: any): Promise<any> {
		console.error('Error', error); // for test purposes only
		return Promise.reject(error.message || error);
	}
}
