import { Greeting } from './greeting';
import { Service1Service } from './service1.service';
import { Component, OnInit } from '@angular/core';

@Component({
  post_response: Greeting;

   ngOnInit() {
     this.Service1Service.post().subscribe(res => {
                                                 console.log(res);
                                                 this.post_response = res;
                                                }
                                        );
   }