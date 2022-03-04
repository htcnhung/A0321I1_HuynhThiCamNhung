import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {XeKhach} from "../model/xe-khach";
import {LoaiXe} from "../model/loai-xe";

@Injectable({
  providedIn: 'root'
})
export class XeKhachService {
  public API: string = 'http://localhost:3000/xe-khach';
  public API_TYPE = 'http://localhost:3000/loai-xe';

  constructor(private _http: HttpClient) {
  }

  getAllLoaiXe(): Observable<any[]> {
    return this._http.get<any>(this.API_TYPE);
  }

  getAllXeKhach(): Observable<any> {
    return this._http.get(this.API);
  }

  findById(id: number): Observable<XeKhach> {
    return this._http.get<XeKhach>(this.API + "/" + id);
  }

  //
  // search(searchName: string, searchDateExpiration: string): Observable<XeKhach[]> {
  //   return this._http.get<XeKhach[]>(this.API + '?loaixe_xekhach.name_like=' + searchName+ '&dateExpiration_like=' + searchDateExpiration);
  // }

  create(xekhach: XeKhach): Observable<any> {
    return this._http.post(this.API, xekhach);
  }

  delete(id: number): Observable<any> {
    return this._http.delete<any>(this.API + "/" + id)
  }

  edit(loaiXe: LoaiXe, id: any): Observable<any> {
    return this._http.put(this.API + "/" + id, loaiXe);
  }

  updateXeKhach(obj: any): Observable<any> {
    return this._http.put(this.API + '/' + obj.id, obj);
  }

  // @ts-ignore
  getXeKhachById(id: string): Observable<any> {
    return this._http.get(this.API + '/' + id)

  }
}
