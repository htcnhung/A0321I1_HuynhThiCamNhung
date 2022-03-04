import { TestBed } from '@angular/core/testing';

import { XeKhachServiceService } from './xe-khach-service.service';

describe('XeKhachServiceService', () => {
  let service: XeKhachServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(XeKhachServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
