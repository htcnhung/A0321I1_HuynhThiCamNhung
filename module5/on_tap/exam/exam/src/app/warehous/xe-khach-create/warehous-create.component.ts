import {Component, OnInit} from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {IProduct} from "../../model/loai-xe";
import {XeKhachService} from "../../services/xe-khach.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-warehous-create',
  templateUrl: './warehous-create.component.html',
  styleUrls: ['./warehous-create.component.scss']
})
export class WarehousCreateComponent implements OnInit {

  public formCreateNewShipment: FormGroup;
  public products!: IProduct[];

  constructor(public _formBuilder: FormBuilder,
              public _shipmentService: XeKhachService,
              public _router: Router) {
  }

  ngOnInit(): void {
    this._shipmentService.getAllProduct().subscribe(data => {
      this.products = data;
    }, error => {
      console.log('Failed to get list customer type!');
    });

    this.formCreateNewShipment = this._formBuilder.group({
      shipment_id: ['', [Validators.required, Validators.pattern("^LH-[\\d]{4}$")]],
      product_shipment: ['', [Validators.required]],
      amount: ['', [Validators.required, Validators.pattern('^[0-9]*$')]],
      dateAdd: ['', [Validators.required]],
      dateProduce: ['', [Validators.required]],
      dateExpiration: ['', [Validators.required]]
    })
  }

  createShipment() {
    this._shipmentService.create(this.formCreateNewShipment.value).subscribe(data => {
      this._router.navigateByUrl('xe-khach-list');
    })
    console.log(this.formCreateNewShipment);
  }

  compareFn(c1: any, c2: any): boolean {
    return c1 && c2 ? c1.id === c2.id : c1 === c2;
  }


}
