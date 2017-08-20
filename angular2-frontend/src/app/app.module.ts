import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import { routing } from './app.routing';

import { AppComponent } from './app.component';
import { GreetingComponent } from './greeting.component';
import { Greeting2Component } from './greeting.component2';
import { Service1Service } from './service1.service';

@NgModule({
  declarations: [
    AppComponent,
    GreetingComponent,
    Greeting2Component
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    routing
  ],
  providers: [Service1Service],
  bootstrap: [AppComponent]
})
export class AppModule { }
