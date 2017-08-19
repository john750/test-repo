import { Greeting } from './greeting';
import { Service1Service } from './service1.service';
import { Component, OnInit } from '@angular/core';

@Component({  selector: 'app-greeting',  templateUrl: './greeting.component.html',})export class GreetingComponent implements OnInit {
  greeting: Greeting;  constructor(private Service1Service: Service1Service) {}

   ngOnInit() {
    this.Service1Service.get().subscribe(res => {
                                                 console.log(res);
                                                 this.greeting = res;
                                                }
                                        );
   }
