import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { XeKhachListComponent } from './xe-khach-list.component';

describe('XeKhachListComponent', () => {
  let component: XeKhachListComponent;
  let fixture: ComponentFixture<XeKhachListComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ XeKhachListComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(XeKhachListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
