import { Component, OnInit } from '@angular/core';
import { FormBuilder,Validators } from '@angular/forms';
import { AdminserviceService } from '../adminservice.service';

@Component({
  selector: 'app-adminreg',
  templateUrl: './adminreg.component.html',
  styleUrls: ['./adminreg.component.css']
})
export class AdminregComponent implements OnInit 
{
msg:string="";
  constructor(private build:FormBuilder,
    private adminser:AdminserviceService ) { }

  ngOnInit(): void {
  }
regadmin=this.build.group({
  id: this.build.control('',[Validators.required]),
  password: this.build.control('',[Validators.required])
});
Registeradmin()
{
  this.adminser.CreateNewAdmin(this.regadmin.value).subscribe(data=>
    {
    console.log(data);
      this.msg="new person added";
}
  );
}
}