import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { XeKhachEditComponent } from './xe-khach-edit.component';

describe('XeKhachEditComponent', () => {
  let component: XeKhachEditComponent;
  let fixture: ComponentFixture<XeKhachEditComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ XeKhachEditComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(XeKhachEditComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
