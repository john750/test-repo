import { Greeting } from './greeting';
import { Service1Service } from './service1.service';
import { Component, OnInit } from '@angular/core';

@Component({
  greeting: Greeting;

   ngOnInit() {
    this.Service1Service.get().subscribe(res => {
                                                 console.log(res);
                                                 this.greeting = res;
                                                }
                                        );
   }