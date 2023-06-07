import { Component, OnInit } from '@angular/core';
import { FormBuilder,Validators } from '@angular/forms';
import { HttpClient } from '@angular/common/http';
import { FormGroup } from '@angular/forms';

import { QuestService } from '../quest.service';
import { Routes,RouterModule, RouterLink } from '@angular/router';
import { QuizComponent } from '../quiz/quiz.component';

@Component({
  selector: 'app-userlogin',
  templateUrl: './userlogin.component.html',
  styleUrls: ['./userlogin.component.css']
})
export class UserloginComponent implements OnInit {
 public loginform!: FormGroup
  constructor(private formbuilder:FormBuilder,
    private http:HttpClient,
    
    ) { }

  ngOnInit(): void {
    this.loginform=this.formbuilder.group({
      id:[''],
      password:['']
    });
  }
  login()
  {
    this.http.get<any>("http://localhost:3000/user")
    .subscribe(res=>{
      const user=res.find((a:any)=>{
        return a.id == this.loginform.value.id && a.password ==this.loginform.value.password
      });
      if(user)
      {
        alert("login success you can take the test");
        this.loginform.reset();
        const routes: Routes = [
          
          { path: 'about', component: QuizComponent }
        
        ];
      }
      else{
        alert("login failed");
      }
    })
    
      }
    }
    
      

  

