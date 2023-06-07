import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private http:HttpClient) { }

  private apiurl="http://localhost:3000/user"
  CreateNewUser(Userinfo:any):Observable<any>
  {
    return this.http.post(this.apiurl, Userinfo);
  }
}
