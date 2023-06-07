import { Component, OnInit } from '@angular/core';
import { FormBuilder,Validators} from '@angular/forms';
import { UserService } from '../user.service';
import { HttpClient } from '@angular/common/http';
@Component({
  selector: 'app-newuserreg',
  templateUrl: './newuserreg.component.html',
  styleUrls: ['./newuserreg.component.css']
})
export class NewuserregComponent implements OnInit {
msg:string="";
  constructor(
    private builder:FormBuilder,
    private userser:UserService
    ) { }

  ngOnInit(): void {
  }
 regperson=this.builder.group({
  id: this.builder.control('',[Validators.required]),
  password: this.builder.control('',[Validators.required])
 });

 Registeruser()
 {
  this.userser.CreateNewUser(this.regperson.value).subscribe(data=>
    {
      console.log(data);
      this.msg="new person added";
      this.regperson.reset;
    });
 }
}
