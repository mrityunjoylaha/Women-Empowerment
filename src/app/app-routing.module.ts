import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { NgoComponent } from './ngo/ngo.component';
import { StepComponent } from './step/step.component';
import { HomeComponent } from './home/home.component';



const routes: Routes = [
  
  {path: 'home', component: HomeComponent},
  {path: 'ngo', component: NgoComponent},
  {path: 'step', component: StepComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
export const routingComponents = [HomeComponent, NgoComponent,StepComponent]
