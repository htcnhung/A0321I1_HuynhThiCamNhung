import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { XeKhachCreateComponent } from './xe-khach-create.component';

describe('XeKhachCreateComponent', () => {
  let component: XeKhachCreateComponent;
  let fixture: ComponentFixture<XeKhachCreateComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ XeKhachCreateComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(XeKhachCreateComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
