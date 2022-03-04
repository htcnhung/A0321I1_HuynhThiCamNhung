import {Component, OnInit} from '@angular/core';
import {CustomerServiceService} from "../customer-service.service";
import {Xe} from "../model/xe";
import {FormBuilder, FormGroup} from "@angular/forms";
import {DeleteCustomerComponent} from "../delete-customer/delete-customer.component";
import {MatDialog} from "@angular/material/dialog";

@Component({
  selector: 'app-list-customer',
  templateUrl: './list-customer.component.html',
  styleUrls: ['./list-customer.component.css']
})
export class ListCustomerComponent implements OnInit {
  customerList: Xe[];
  p = 1;
  formSearch: FormGroup;

  constructor(private _customerService: CustomerServiceService,
              private _fb: FormBuilder,
              private matDialog: MatDialog) {
  }

  ngOnInit(): void {
    this.createForm();
    this._customerService.getAllCustomer().subscribe(
      data => {
        this.customerList = data;
        console.log(this.customerList);
      }
    );
  }

  search() {
    this._customerService.searchCustomer(this.formSearch.value).subscribe(
      data => {
        this.p = 1;
        this.customerList = data;
      }
    );

  }

  createForm() {
    this.formSearch = this._fb.group({
      name: [''],
      email: [''],
      customerType: ['']
    });
  }

  openDialogDelete(id: number, name: string): void {
    this._customerService.getCustomerById(id).subscribe(dataCustomer => {
      const dialogDelete = this.matDialog.open(DeleteCustomerComponent, {
        data: {id: id, name: name},
        width: '500px'
      });
      dialogDelete.afterClosed().subscribe(() => {
        console.log('The dialog was closed');
        this.ngOnInit();
      });
    });

  }
}
