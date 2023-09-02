// data.service.ts
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class DataService {
  private modalUrl = 'assets/data.json';;

  private basicProjectInfoUrl = '../modules/projects/data.json';

  constructor(private http: HttpClient) { }

  getData(dataSource: 'projectModal' | 'basicProjectInfo'): Observable<any[]> {
    const url = dataSource === 'projectModal' ? this.modalUrl : this.basicProjectInfoUrl;
    return this.http.get<any[]>(url);
  }
}
