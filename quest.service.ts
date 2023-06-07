import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class QuestService {

  constructor(private http:HttpClient) { }
  httpurl="http://localhost:3000/quest"
  CreateNewquestion(questinfo:any):Observable<any>
  {
     return this.http.post(this.httpurl,questinfo);
  }
}
