package models;

import java.io.Serializable;

public abstract class BenhAn implements Serializable {
    private static final long serialVersionUID = -811563150209637411L;
    private int sttBenhAn;
    private String maBenhAn;
    private String maBenhNhan;
    private String tenBenhNhan;
    private String ngaNhapVien;
    private String ngayXuatVien;
    private String lyDoNhapVien;

    public BenhAn() {
    }

    public BenhAn(int sttBenhAn, String maBenhAn, String maBenhNhan, String tenBenhNhan, String ngaNhapVien, String ngayXuatVien, String lyDoNhapVien) {
        this.sttBenhAn = sttBenhAn;
        this.maBenhAn = maBenhAn;
        this.maBenhNhan = maBenhNhan;
        this.tenBenhNhan = tenBenhNhan;
        this.ngaNhapVien = ngaNhapVien;
        this.ngayXuatVien = ngayXuatVien;
        this.lyDoNhapVien = lyDoNhapVien;
    }

    public String getMaBenhNhan() {
        return maBenhNhan;
    }

    public void setMaBenhNhan(String maBenhNhan) {
        this.maBenhNhan = maBenhNhan;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getSttBenhAn() {
        return sttBenhAn;
    }

    public void setSttBenhAn(int sttBenhAn) {
        this.sttBenhAn = sttBenhAn;
    }

    public String getMaBenhAn() {
        return maBenhAn;
    }

    public void setMaBenhAn(String maBenhAn) {
        this.maBenhAn = maBenhAn;
    }

    public String getTenBenhNhan() {
        return tenBenhNhan;
    }

    public void setTenBenhNhan(String tenBenhNhan) {
        this.tenBenhNhan = tenBenhNhan;
    }

    public String getNgaNhapVien() {
        return ngaNhapVien;
    }

    public void setNgaNhapVien(String ngaNhapVien) {
        this.ngaNhapVien = ngaNhapVien;
    }

    public String getNgayXuatVien() {
        return ngayXuatVien;
    }

    public void setNgayXuatVien(String ngayXuatVien) {
        this.ngayXuatVien = ngayXuatVien;
    }

    public String getLyDoNhapVien() {
        return lyDoNhapVien;
    }

    public void setLyDoNhapVien(String lyDoNhapVien) {
        this.lyDoNhapVien = lyDoNhapVien;
    }

    @Override
    public String toString() {
        return "BenhAn{" +
                "sttBenhAn=" + sttBenhAn +
                ", maBenhAn='" + maBenhAn + '\'' +
                ", tenBenhNhan='" + tenBenhNhan + '\'' +
                ", ngaNhapVien='" + ngaNhapVien + '\'' +
                ", ngayXuatVien='" + ngayXuatVien + '\'' +
                ", lyDoNhapVien='" + lyDoNhapVien + '\'' +
                '}';
    }
}
