package models;

public class BenhAnThuong extends BenhAn {
    private String phiNamVien;
    public BenhAnThuong() {
    }

    public BenhAnThuong(int sttBenhAn, String maBenhAn, String maBenhNhan, String tenBenhNhan, String ngaNhapVien, String ngayXuatVien, String lyDoNhapVien, String phiNamVien) {
        super(sttBenhAn, maBenhAn, maBenhNhan, tenBenhNhan, ngaNhapVien, ngayXuatVien, lyDoNhapVien);
        this.phiNamVien = phiNamVien;
    }

    public String getPhiNamVien() {
        return phiNamVien;
    }

    public void setPhiNamVien(String phiNamVien) {
        this.phiNamVien = phiNamVien;
    }

    @Override
    public String toString() {
        return super.toString() + " BenhAnThuong{" +
                "phiNamVien='" + phiNamVien + '\'' +
                '}';
    }
}
