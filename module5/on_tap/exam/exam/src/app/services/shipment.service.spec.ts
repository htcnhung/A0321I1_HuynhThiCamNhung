import { TestBed } from '@angular/core/testing';

import { XeKhachService } from './xe-khach.service';

describe('ShipmentService', () => {
  let service: XeKhachService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(XeKhachService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
