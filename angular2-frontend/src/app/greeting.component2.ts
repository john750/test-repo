import { Greeting } from './greeting';
import { Service1Service } from './service1.service';
import { Component, OnInit } from '@angular/core';

@Component({  selector: 'app-greeting2',  templateUrl: './greeting.component2.html',})export class Greeting2Component implements OnInit {
  post_response: Greeting;  constructor(private Service1Service: Service1Service) {}

   ngOnInit() {
     this.Service1Service.post().subscribe(res => {
                                                 console.log(res);
                                                 this.post_response = res;
                                                }
                                        );
   }}
