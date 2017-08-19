import { Injectable } from '@angular/core';
import { Http, Response, Headers } from '@angular/http';
import { Observable } from 'rxjs/Observable';
import { Greeting } from './greeting';
import 'rxjs/add/operator/map';

@Injectable()
export class Service1Service {
  private baseUrl = 'http://localhost:8091';


 constructor(private http: Http) {
  }

  private getHeaders() {
    const headers = new Headers();
    headers.append('Accept', 'application/json');
    headers.append('Content-Type', 'application/json');
    return headers;
  }

    get(): Observable<Greeting> {
    const greeting$ = this.http
      .get(`${this.baseUrl}/greeting`, {headers: this.getHeaders()})
      .map(mapGreeting);
      return greeting$;
  }
/*
  getAll(id: number): Observable<Greeting[]> {
    const greetings$ = this.http
      .get(`${this.baseUrl}/greeting`, {headers: this.getHeaders()})
      .map(mapGreetings);
      return greetings$;
  }*/
}


function toGreeting(r: any): Greeting {
  const greeting = <Greeting>({
    id: r.id,
    content: r.content
  });
  console.log('Parsed greeting:', greeting);
  return greeting;
}


  function mapGreetings(response: Response): Greeting[] {
  return response.json().map(toGreeting);
}

function mapGreeting(response: Response): Greeting {
  return toGreeting(response.json());
}





  /*
  get(id: number): Observable<Person> {
    const person$ = this.http
      .get(`${this.baseUrl}/Person/${id}`, {headers: this.getHeaders()})
      .map(mapPerson);
      return person$;
  }

  getAll(): Observable<Person[]> {
     const person$ = this.http
      .get(`${this.baseUrl}/Person`, {headers: this.getHeaders()})
      .map(mapPersons);
    return person$;
  }

  save(person: Person): Observable<Response> {
    console.log('Saving person ' + JSON.stringify(person));
    return this.http.put(`${this.baseUrl}/Person`, JSON.stringify(person), {headers: this.getHeaders()});
  }


}




function mapPerson(response: Response): Person {
  return toPerson(response.json());
}

function toPerson(r: any): Person {
  return r;*/

