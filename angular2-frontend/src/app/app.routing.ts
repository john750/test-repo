import { AppComponent } from './app.component';
import { GreetingComponent } from './greeting.component';
import { Routes, RouterModule } from '@angular/router';

const routes: Routes = [
   { path: '', component: AppComponent},
   { path: 'greeting', component: GreetingComponent}

];

export const routing = RouterModule.forRoot(routes);
