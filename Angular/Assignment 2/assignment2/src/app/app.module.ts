import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AdvertisementFormComponent } from './advertisement-form/advertisement-form.component';
import { AdvertisementTableComponent } from './advertisement-table/advertisement-table.component';
import { EditProductComponent } from './edit-product/edit-product.component';

@NgModule({
  declarations: [
    AppComponent,
    AdvertisementFormComponent,
    AdvertisementTableComponent,
    EditProductComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
