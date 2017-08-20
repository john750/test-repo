import { AppComponent } from './app.component';
import { GreetingComponent } from './greeting.component';
import { Greeting2Component } from './greeting.component2';
import { Routes, RouterModule } from '@angular/router';

const routes: Routes = [
   { path: '', component: AppComponent},
   { path: 'greetings', component: Greeting2Component},
   { path: 'greetings/:greeting-id', component: GreetingComponent}

];

export const routing = RouterModule.forRoot(routes);
