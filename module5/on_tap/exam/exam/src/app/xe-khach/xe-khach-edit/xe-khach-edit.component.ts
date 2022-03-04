import {Component, OnInit} from '@angular/core';
import {LoaiXe} from "../../model/loai-xe";
import {XeKhachService} from "../../services/xe-khach.service";
import {ActivatedRoute, Router} from "@angular/router";
import {FormBuilder, FormGroup} from "@angular/forms";
import {XeKhach} from "../../model/xe-khach";

@Component({
  selector: 'app-xe-khach-edit',
  templateUrl: './xe-khach-edit.component.html',
  styleUrls: ['./xe-khach-edit.component.scss']
})
export class XeKhachEditComponent implements OnInit {

  formEdit: FormGroup;
  xe_khach: XeKhach;
  loai_xe_list: LoaiXe[];

  constructor(private _activeRouter: ActivatedRoute,
              private _xeKhachService: XeKhachService,
              private _fb: FormBuilder,
              private _router: Router) {
  }

  ngOnInit(): void {
    this.createForm();
    this.getAllLoaiXe();
    this._activeRouter.paramMap.subscribe(
      (param) => {
        const id = param.get('id');
        this._xeKhachService.getXeKhachById(id).subscribe(
          data => {
            this.xe_khach = data;
            this.formEdit.setValue(this.xe_khach);
          });
      });
  }

  createForm() {
    this.formEdit = this._fb.group({
      xekhach_id: [],
      loai_xe: [],
      ten_nha_xe: [],
      diem_di: [],
      diem_den: [],
      tel: [],
      gio_di: [],
      gio_den: []
    });
  }

  getAllLoaiXe() {
    this._xeKhachService.getAllLoaiXe().subscribe(
      data => {
        this.loai_xe_list = data;
        console.log(data);
      }
    );
  }

  compareFn(c1: LoaiXe, c2: LoaiXe): boolean {
    return c1 && c2 ? c1.id_loai_xe === c2.id_loai_xe : c1 === c2;
  }

  onSubmit() {
    if (this.formEdit.valid) {
      this._xeKhachService.updateXeKhach(this.formEdit.value).subscribe(
        () => {
          this._router.navigateByUrl('/xe-khach-list');
        }
      );
    }
  }

}
