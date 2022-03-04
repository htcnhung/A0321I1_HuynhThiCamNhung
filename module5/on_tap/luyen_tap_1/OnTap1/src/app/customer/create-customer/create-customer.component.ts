import {Component, OnInit} from '@angular/core';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {Xe} from '../model/xe';
import {CustomerType} from '../model/loai-xe';
import {ActivatedRoute, Router} from '@angular/router';
import {CustomerServiceService} from '../customer-service.service';

@Component({
  selector: 'app-create-customer',
  templateUrl: './create-customer.component.html',
  styleUrls: ['./create-customer.component.css']
})
export class CreateCustomerComponent implements OnInit {
  public formCreateNewCustomer: FormGroup;
  listCustomerType: CustomerType[];

  constructor(private _formBuilder: FormBuilder,
              private _customerService: CustomerServiceService,
              private _router: Router) {
  }

  ngOnInit(): void {
    this._customerService.getAllCustomerType().subscribe(data => {
      this.listCustomerType = data;
    }, error => {
      console.log('Failed to get list customer type!');
    });

    this.formCreateNewCustomer = this._formBuilder.group({
      id: ['', [Validators.required]],
      // id: ['', [Validators.required, Validators.pattern('^KH-[\\d]{4}$')]],
      name: ['', [Validators.required]],
      birthday: ['', [Validators.required]],
      email: ['', [Validators.required, Validators.email]],
      customerType: ['', [Validators.required]]
    });
  }

  createCustomer() {
    if (this.formCreateNewCustomer.valid) {
      this._customerService.createCustomer(this.formCreateNewCustomer.value).subscribe(data => {
        console.log(data);
        this._router.navigateByUrl('/customer');
      });
    }
    console.log(this.formCreateNewCustomer);
  }

  onSubmit() {
    if (this.formCreateNewCustomer.valid) {
      this._customerService.createCustomer(this.formCreateNewCustomer.value).subscribe(data => {
        console.log(data);
        this._router.navigateByUrl('/customer');
      });
    }
  }
  compareFn(c1: any, c2: any): boolean {
    return c1 && c2 ? c1.id === c2.id : c1 === c2;
  }
}
