import {Component, OnInit} from '@angular/core';
import {ActivatedRoute, Router} from '@angular/router';
import {CustomerServiceService} from "../customer-service.service";
import {FormBuilder, FormGroup} from "@angular/forms";
import {Xe} from "../model/xe";
import {CustomerType} from "../model/loai-xe";

@Component({
  selector: 'app-edit-customer',
  templateUrl: './edit-customer.component.html',
  styleUrls: ['./edit-customer.component.css']
})
export class EditCustomerComponent implements OnInit {
  formEdit: FormGroup;
  customer: Xe;
  listCustomerType: CustomerType[];

  // tslint:disable-next-line:variable-name
  constructor(private _activeRouter: ActivatedRoute,
              // tslint:disable-next-line:variable-name
              private _customerService: CustomerServiceService,
              // tslint:disable-next-line:variable-name
              private _fb: FormBuilder,
              // tslint:disable-next-line:variable-name
              private _router: Router) {
  }

  ngOnInit(): void {
    this.createForm();
    this.getAllCustomerType();
    this._activeRouter.paramMap.subscribe(
      (param) => {
        const id = param.get('id');
        this._customerService.getCustomerById(id).subscribe(
          data => {
            this.customer = data;
            this.formEdit.setValue(this.customer);
          });
      });
  }

  createForm() {
    this.formEdit = this._fb.group({
      id: [],
      name: [],
      birthday: [],
      email: [],
      customerType: []
    });
  }

  getAllCustomerType() {
    this._customerService.getAllCustomerType().subscribe(
      data => {
        this.listCustomerType = data;
        console.log(data);
      }
    );
  }

  compareFn(c1: CustomerType, c2: CustomerType): boolean {
    return c1 && c2 ? c1.id === c2.id : c1 === c2;
  }

  onSubmit() {
    if (this.formEdit.valid) {
      this._customerService.updateCustomer(this.formEdit.value).subscribe(
        () => {
          this._router.navigateByUrl('/xekhach');
        }
        );
    }
  }
}
