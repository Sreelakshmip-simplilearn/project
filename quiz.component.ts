import { Component, OnInit } from '@angular/core';
import { FormBuilder,Validators } from '@angular/forms';
import { HttpClient } from '@angular/common/http';
import { FormGroup } from '@angular/forms';

@Component({
  selector: 'app-quiz',
  templateUrl: './quiz.component.html',
  styleUrls: ['./quiz.component.css']
})
export class QuizComponent implements OnInit {
  public quizform!: FormGroup
  constructor(private formbuilder:FormBuilder,
    private http:HttpClient) { }

  ngOnInit(): void {
    this.quizform=this.formbuilder.group({
      q:[''],
      opt1:[''],
      opt2:[''],
      opt3:[''],
      answer:['']
    });
  }
  login()
  {
    this.http.get<any>("http://localhost:3000/Questions")
    .subscribe(res=>{
      
      const user=res.find((a:any)=>{
        if(user){
      this.quizform.value.opt1.checked ==this.quizform.value.answer
        }
      });
      if(user)
      {
        alert("correct answer");
        this.quizform.reset();
        
      }
      else{
        alert("incorrect answerS");
      }
    })
    
      }
    }
