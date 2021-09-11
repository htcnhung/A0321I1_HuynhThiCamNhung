package services.impl;

import controllers.MainController;
import models.BenhAnThuong;
import models.BenhAnVIP;
import services.BenhAnVipService;
import utils.ReadAndWriteFile;
import utils.RegexData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BenhAnVipServiceImpl implements BenhAnVipService {
    static List<BenhAnVIP> benhAnVIPList = new ArrayList<>();
    public Scanner scanner = new Scanner(System.in);
    public static int idCount = 1;
    private static final String ID_BENHAN_REGEX = "^(BA)-\\d{3}$";
    private static final String ID_BENHNHAN_REGEX = "^(BN)-\\d{3}$";
    private static final String NAME_REGEX= "^(([A-Z][a-z]+)(| ))+$";
    private static final String BIRTHDAY_REGEX = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";


    @Override
    public void display() {
        benhAnVIPList = (List<BenhAnVIP>) ReadAndWriteFile.read("D:\\CODEGYM\\A0321I1_HuynhThiCamNhung\\thi_module_2\\src\\data\\benhanvip.csv");
        if (benhAnVIPList == null) {
            benhAnVIPList = new ArrayList<>();
            System.out.println("Danh sách bệnh án vip hiện đang trống, hãy thêm một bệnh án vip mới!");
            MainController.displayThemBenhAnManagement();
        } else {
            System.out.println("Danh sách bệnh án vip hiện có là: ");
            for (BenhAnVIP benhAnVIPList : benhAnVIPList) {
                System.out.println(benhAnVIPList.toString());
            }
        }
        MainController.displayMainMenu();
    }

    @Override
    public void addNew() {
        //Số thứ tự bệnh án, Mã bệnh án, Tên bệnh nhân, Ngày nhập viện, Ngày ra viện, Lý do nhập viện.
//super(sttBenhAn, maBenhAn, tenBenhNhan, ngaNhapVien, ngayXuatVien, lyDoNhapVien);
//        this.thoiHanVIP = thoiHanVIP;
//        this.loaiVIP = loaiVIP;

        System.out.println("Nhập mã bệnh án: ");
        String maBenhAn =  RegexData.regexStr(scanner.nextLine(),ID_BENHAN_REGEX,"Vui lòng nhập đúng BA-XXX");
        System.out.println("Nhập mã bệnh nhân: ");
        String maBenhNhan = RegexData.regexStr(scanner.nextLine(),ID_BENHNHAN_REGEX,"Vui lòng nhập đúng BN-XXX");
        System.out.println("Nhập Tên bệnh nhân: ");
        String tenBenhNhan = RegexData.regexStr(scanner.nextLine(),NAME_REGEX,"Vui lòng nhập tên đúng");
        System.out.println("Nhập Ngày nhập viện: ");
        String ngayNhapVien = RegexData.regexStr(scanner.nextLine(),BIRTHDAY_REGEX,"Vui lòng nhập đúng định dạng dd/MM/yyyy");
        System.out.println("Nhập Ngày ra viện: ");
        String ngayRaVien = RegexData.regexStr(scanner.nextLine(),BIRTHDAY_REGEX,"Vui lòng nhập đúng định dạng dd/MM/yyyy");
        System.out.println("Nhập Lý do nhập viện: ");
        String lyDoNhapVien = scanner.nextLine();
        System.out.println("Nhập thời hạn VIP: ");
        String thoiHanVip = RegexData.regexStr(scanner.nextLine(),BIRTHDAY_REGEX,"Vui lòng nhập đúng định dạng dd/MM/yyyy");
        System.out.println("Nhập loại vip: ");
        //Loại VIP (gói VIP I, VIP II, VIP III)
        String loaiVip = scanner.nextLine();
        BenhAnVIP benhAnVIP = new BenhAnVIP(idCount, maBenhAn,maBenhNhan, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien, loaiVip, thoiHanVip);
        benhAnVIPList.add(benhAnVIP);
        idCount++;
        ReadAndWriteFile.write(benhAnVIPList, "D:\\CODEGYM\\A0321I1_HuynhThiCamNhung\\thi_module_2\\src\\data\\benhanvip.csv");
        System.out.println("Đã thêm mới benh an vip thành công!");
        MainController.displayThemBenhAnManagement();
    }

    @Override
    public void delete() {
        System.out.println("Nhập ID bệnh án vip bạn muốn xóa");
        int idEdit = Integer.parseInt(scanner.nextLine());
        for (BenhAnVIP benhAnVIP : benhAnVIPList) {
            if (idEdit == benhAnVIP.getSttBenhAn()) {
                System.out.println("Bạn có muốn xóa hay không\n" +
                        "1./ Yes\n" + "2./ No");

                if (scanner.nextInt() == 1)
                    benhAnVIPList.remove(benhAnVIP);

                break;
            } else if (scanner.nextInt() == 2) {
                MainController.displayMainMenu();
                break;
            } else {
                System.out.println("Nhập sai vui lòng nhập lại");
                delete();
                break;
            }
        }
    }
}
