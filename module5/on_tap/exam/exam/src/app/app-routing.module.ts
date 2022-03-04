import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {HomeComponent} from "./home/home.component";
import {PageNotFoundComponent} from "./page-not-found/page-not-found.component";

import {XeKhachListComponent} from "./xe-khach/xe-khach-list/xe-khach-list.component";
import {XeKhachEditComponent} from "./xe-khach/xe-khach-edit/xe-khach-edit.component";


const routes: Routes = [
{path: '', component: HomeComponent},
  {path: 'xe-khach-list', component: XeKhachListComponent },
  {path: 'edit/:id', component: XeKhachEditComponent},

  {path: '**', component: PageNotFoundComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
