package models;

public class BenhAnVIP extends BenhAn {
    private String thoiHanVIP;
    private String loaiVIP;
    public BenhAnVIP() {
    }
    //- Loại VIP gồm các gói VIP I, VIP II và VIP III.
    //- Thời hạn VIP.


    public BenhAnVIP(int sttBenhAn, String maBenhAn, String maBenhNhan, String tenBenhNhan, String ngaNhapVien, String ngayXuatVien, String lyDoNhapVien, String thoiHanVIP, String loaiVIP) {
        super(sttBenhAn, maBenhAn, maBenhNhan, tenBenhNhan, ngaNhapVien, ngayXuatVien, lyDoNhapVien);
        this.thoiHanVIP = thoiHanVIP;
        this.loaiVIP = loaiVIP;
    }

    @Override
    public String toString() {
        return super.toString() + " BenhAnVIP{" +
                "thoiHanVIP='" + thoiHanVIP + '\'' +
                ", loaiVIP='" + loaiVIP + '\'' +
                '}';
    }
}
