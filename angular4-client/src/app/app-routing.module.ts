import { StockPriceComponent } from './stock-price/stock-price.component';

import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [
	{ path: '', redirectTo: 'user', pathMatch: 'full' },
	{ path: 'createUserAccess', component: StockPriceComponent }
];

@NgModule({
	imports: [RouterModule.forRoot(routes)],
	exports: [RouterModule]
})

export class AppRoutingModule { }
