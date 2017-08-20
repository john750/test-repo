import { Greeting } from './greeting';
import { Service1Service } from './service1.service';
import { Component, OnInit } from '@angular/core';
import {ActivatedRoute, Route, Params} from '@angular/router';

@Component({  selector: 'app-greeting',  templateUrl: './greeting.component.html',})

export class GreetingComponent implements OnInit {
  greeting: Greeting;
  greetingID: number;

  constructor(private Service1Service: Service1Service, private route: ActivatedRoute) {}

   ngOnInit() {
        this.route.params.subscribe( params =>
            this.greetingID = params['greeting-id']
    );

        this.Service1Service.get(+this.greetingID)
    .subscribe(res => {
                       console.log(res);
                       this.greeting = res;
                      }
                    );

   }}
