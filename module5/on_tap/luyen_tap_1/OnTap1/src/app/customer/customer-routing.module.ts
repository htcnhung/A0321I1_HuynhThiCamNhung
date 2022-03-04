import {NgModule} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';
import {ListCustomerComponent} from './list-customer/list-customer.component';
import {EditCustomerComponent} from './edit-customer/edit-customer.component';
import {CreateCustomerComponent} from './create-customer/create-customer.component';


const routes: Routes = [
  {
    path: '',
    component: ListCustomerComponent
  },
  {
    path: 'edit/:id',
    component: EditCustomerComponent
  }, {
    path: 'create',
    component: CreateCustomerComponent
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class CustomerRoutingModule {
}
