import {Component, OnInit} from '@angular/core';
import {XeKhach} from "../../model/xe-khach";
import {XeKhachService} from "../../services/xe-khach.service";
import {ActivatedRoute, Router} from "@angular/router";
import {LoaiXe} from "../../model/loai-xe";
import {FormBuilder} from "@angular/forms";

@Component({
  selector: 'app-xe-khach-list',
  templateUrl: './xe-khach-list.component.html',
  styleUrls: ['./xe-khach-list.component.scss']
})
export class XeKhachListComponent implements OnInit {

  public xe_khach_list: XeKhach[];
  public page = 1;

  // public searchValue: string="";
  // public searchDateExpiration: string="";

  public xekhach_id : number;
  public id_loai_xe!: string;

  constructor(private _xeKhachService: XeKhachService,
              private _fb: FormBuilder,
              private _router: Router,
              private _activeRouter: ActivatedRoute) {
  }

  ngOnInit(): void {
    this._xeKhachService.getAllXeKhach().subscribe(data => {
      this.xe_khach_list = data;
      console.log(data);
    })
  }

  deleteXeKhach(id: number) {
    this._xeKhachService.delete(id).subscribe(data => {
      // this.router.navigateByUrl('listCus');
      this.ngOnInit();
      this.page = 1;
    })
  }

  getXeKhachId(id: number) {
    this._xeKhachService.findById(id).subscribe(data => {
      this.xekhach_id = data.xekhach_id;
    });
  }

}
