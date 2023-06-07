import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class AdminserviceService {

  constructor(private http:HttpClient) { }
  private httpurl="http://localhost:3000/Admin"
  CreateNewAdmin(Admininfo:any):Observable<any>
  {
    return this.http.post(this.httpurl, Admininfo);
  }
}
