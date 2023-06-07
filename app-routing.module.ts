import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { UserloginComponent } from './userlogin/userlogin.component';
import { AdminloginComponent } from './adminlogin/adminlogin.component';
import { NewuserregComponent } from './newuserreg/newuserreg.component';
import { AdminregComponent } from './adminreg/adminreg.component';
import { Router } from '@angular/router';
import { QuizComponent } from './quiz/quiz.component';

const routes: Routes = [
  { path:'login',component:UserloginComponent},
    {path:'adminlogin',component:AdminloginComponent},
    {path:'Admin Registration',component:AdminregComponent},
    {path:'NewUser',component:NewuserregComponent},
    {path:'Taketest',component:QuizComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
