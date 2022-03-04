import {LoaiXe} from './loai-xe';

export interface Xe {
  xekhach_id: number,
  loai_xe: LoaiXe,
  ten_nha_xe: string,
  diem_di: string,
  diem_den: string,
  tel: number,
  gio_di: string,
  gio_den: string
}
