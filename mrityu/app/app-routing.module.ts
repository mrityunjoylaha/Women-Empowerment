import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { NgoComponent } from './ngo/ngo.component';
import { StepComponent } from './step/step.component';
import { Home2Component } from './home2/home2.component';
import { AboutUsComponent } from './about-us/about-us.component';
import { ContactUsComponent } from './contact-us/contact-us.component';
import { RegistrationComponent } from './step/registration/registration.component';
import { LoginComponent } from './step/login/login.component';
import { StepHomeComponent } from './step/step-home/step-home.component';
import { FormsModule,ReactiveFormsModule} from '@angular/forms';
import { LegislationsPolicyComponent } from './legislations-policy/legislations-policy.component';




const routes: Routes = [
  {path:'home',component:HomeComponent },
  {path:'ngo',component:NgoComponent },
  {path: 'step',component:StepComponent},
  {path: 'home2',component:Home2Component},
  {path: 'about-us',component:AboutUsComponent},
  {path: 'contact-us',component:ContactUsComponent},
  {path: 'registration',component:RegistrationComponent},
  {path: 'login',component:LoginComponent},
  {path: 'step-home',component:StepHomeComponent},
  {path: 'legislations-policy',component:LegislationsPolicyComponent}

  


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
  
  export const routingComponents = [ HomeComponent, NgoComponent,StepComponent,Home2Component, AboutUsComponent,ContactUsComponent,RegistrationComponent,LoginComponent,StepHomeComponent,LegislationsPolicyComponent];
