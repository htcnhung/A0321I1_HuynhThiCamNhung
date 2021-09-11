package services.impl;

import controllers.FuramaController;
import models.Facility;
import models.House;
import models.Room;
import models.Villa;
import services.FacilityService;
import utils.ReadAndWriteFile;
import utils.RegexData;

import java.util.*;

public class FacilityServiceImpl implements FacilityService {
    private static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    private Scanner scanner = new Scanner(System.in);
    private static final String ID_SERVICE_VILLA_REGEX = "^(SVVL)-\\d{4}$";
    private static final String ID_SERVICE_HOUSE_REGEX = "^(SVHO)-\\d{4}$";
    private static final String ID_SERVICE_ROOM_REGEX = "^(SVRO)-\\d{4}$";
    private static final String SERVICE_RENT_TYPE_REGEX = "^[nN](gay)|[tT](hang)|[nN](am)|[gG](io)$";
    private static final String NAME_SERVICE_REGEX = "^[A-Z0-9][a-z0-9_]*$";
    private static final String POOL_AREA_REGEX = "^(([3-9])([0-9])|([1-9]\\d{2,}))(|\\.[0-9]+)$";
    private static final String AMOUNT_MAX_REGEX = "^((0*[1-9])|1([0-9]))$";
    private static final String PRICE_RENT_REGEX = "^(\\d+)(|\\.[0-9]+)$";
    private static final String BIRTHDAY_REGEX = "(^(((0[1-9]|1[0-9]|2[0-8])[/](0[1-9]|1[012]))|((29|30|31)[/]" +
            "(0[13578]|1[02]))|((29|30)[/](0[4,6,9]|11)))[/](19\\d\\d|200[0-1])$)|(^29[/]02[/]((19)" +
            "(04|08|12|16|20|24|28|32|36|40|44|48|52|56|60|64|68|72|76|80|84|88|92|96)|2000)$)";
    private static final String TIME_FILM_REGEX = "^((0*\\d)|1[012])\\:[0-5][0-9] (AM|PM)$";
    private static final String NUMBER_SEAT_REGEX = "^\\[[A-Z][0-9][1-9]\\]$";


    @Override
    public void display() {
        facilityIntegerMap = (Map<Facility, Integer>) ReadAndWriteFile.read("D:\\CODEGYM\\A0321I1_HuynhThiCamNhung\\case_study_2\\src\\data\\facility.csv");
        if (facilityIntegerMap == null) {
            facilityIntegerMap = new LinkedHashMap<>();
            System.out.println("Danh sách facility service hiện đang trống, hãy thêm mới!");
            FuramaController.displayFacilityManagement();
        } else {
            System.out.println("Facility service list: ");
            for (Map.Entry<Facility, Integer> element : facilityIntegerMap.entrySet()) {
                System.out.println("Service: " + element.getKey() + "Số lần thuê: " + element.getValue());
            }
        }
    }

    @Override
    public void displayMaintain() {

    }

    @Override
    public void addNewVilla() {
        Villa villa = new Villa();
        System.out.println("Nhập service ID:");
        int serviceID = Integer.parseInt(inputVillaID());
        villa.setServiceID(serviceID);
        String serviceName = inputServiceName();
        villa.setServiceName(serviceName);
        double usableArea = Double.parseDouble(inputUseArea());
        villa.setUsableArea(usableArea);
        String rentExpense = inputRentPrice();
        villa.setRentExpense(rentExpense);
        int maximumNumberOfPeople = Integer.parseInt(inputNumberOfPeople());
        villa.setMaximumNumberOfPeople(maximumNumberOfPeople);
        String typesOfRent = inputRentType();
        villa.setTypesOfRent(typesOfRent);
        System.out.println("Nhập kiểu phòng: ");
        String standardRoom = scanner.nextLine();
        villa.setStandardRoom(standardRoom);
        String poolArea = inputPoolArea();
        villa.setPoolArea(poolArea);
        int floorNumber = Integer.parseInt(inputFloorNumber());
        villa.setFloorNumber(floorNumber);
        facilityIntegerMap.put(villa, 0);
        ReadAndWriteFile.writeMap(facilityIntegerMap, "D:\\CODEGYM\\A0321I1_HuynhThiCamNhung\\case_study_2\\src\\data\\facility.csv");
        System.out.println("Đã thêm mới villa thành công!");
    }
    private String inputVillaID(){
        System.out.println("Nhập ID mã dịch vụ Vilaa:");
        return RegexData.regexStr(scanner.nextLine(),ID_SERVICE_VILLA_REGEX, "Bạn đã nhập sai định dang, mã dịch vụ Villa phải có định dạng: " +
                "SVVL-YYYY, với YYYY là các số từ 0-9" );
    }
    private String inputHouseID(){
        System.out.println("Nhập ID mã dịch vụ House:");
        return RegexData.regexStr(scanner.nextLine(),ID_SERVICE_HOUSE_REGEX, "Bạn đã nhập sai định dang, mã dịch vụ House phải có định dạng: " +
                "SVHO-YYYY, với YYYY là các số từ 0-9" );
    }
    private String inputRoomID(){
        System.out.println("Nhập ID mã dịch vụ Room:");
        return RegexData.regexStr(scanner.nextLine(),ID_SERVICE_ROOM_REGEX, "Bạn đã nhập sai định dang, mã dịch vụ Room phải có định dạng: " +
                "SVRO-YYYY, với YYYY là các số từ 0-9" );
    }
    private String inputServiceName(){
        System.out.println("Nhập tên dịch vụ:");
        return RegexData.regexStr(scanner.nextLine(),NAME_SERVICE_REGEX, "Bạn đã nhập sai định dang, " +
                "tên dịch vụ phải viết hoa ký tự đầu, các ký tự sau là ký tự bình thường" );
    }
    private String inputUseArea(){
        System.out.println("Nhập diện tích sử dụng:");
        return RegexData.regexStr(scanner.nextLine(),POOL_AREA_REGEX, "Bạn đã nhập sai định dang, " +
                "diện tích sử dụng phải là số thực lớn hơn 30m2" );
    }
    private String inputPoolArea(){
        System.out.println("Nhập diện tích hồ bơi:");
        return RegexData.regexStr(scanner.nextLine(),POOL_AREA_REGEX, "Bạn đã nhập sai định dang, " +
                "diện tích hồ bơi phải là số thực lớn hơn 30m2" );
    }
    private String inputRentPrice(){
        System.out.println("Nhập giá thuê:");
        return RegexData.regexStr(scanner.nextLine(),PRICE_RENT_REGEX, "Bạn đã nhập sai định dang, chi phí thuê phải là số dương" );
    }
    private String inputNumberOfPeople(){
        System.out.println("Nhập số người tối đa:");
        return RegexData.regexStr(scanner.nextLine(),AMOUNT_MAX_REGEX, "Bạn đã nhập sai định dang, số lượng người tối đa phải >0 và nhỏ hơn <20" );
    }
    private String inputRentType(){
        System.out.println("Nhập kiểu thuê:");
        return RegexData.regexStr(scanner.nextLine(),SERVICE_RENT_TYPE_REGEX, "Bạn đã nhập sai định dang, kiểu thuê phải là: năm, tháng, ngày, giờ" );
    }

    private String inputFloorNumber(){
        System.out.println("Nhập số tầng:");
        return RegexData.regexStr(scanner.nextLine(),PRICE_RENT_REGEX, "Bạn đã nhập sai định dang, số tầng phải là số dương!" );
    }


    @Override
    public void addNewHouse() {
        int serviceID = Integer.parseInt(inputHouseID());
        String serviceName = inputServiceName();
        double usableArea = Double.parseDouble(inputUseArea());
        String rentExpense = inputRentPrice();
        int maximumNumberOfPeople = Integer.parseInt(inputNumberOfPeople());
        String typesOfRent = inputRentType();
        System.out.println("Nhập tiêu chuẩn phòng:");
        String standardRoom = scanner.nextLine();
        String poolArea = inputPoolArea();
        int floorNumber = Integer.parseInt(inputFloorNumber());
        House house = new House(serviceID, serviceName, usableArea, rentExpense, maximumNumberOfPeople, typesOfRent, standardRoom, floorNumber);
        facilityIntegerMap.put(house, 0);
        ReadAndWriteFile.writeMap(facilityIntegerMap, "D:\\CODEGYM\\A0321I1_HuynhThiCamNhung\\case_study_2\\src\\data\\facility.csv");
        System.out.println("Đã thêm mới house thành công!");
    }

    @Override
    public void addNewRoom() {
        int serviceID = Integer.parseInt(inputHouseID());
        String serviceName = inputServiceName();
        double usableArea = Double.parseDouble(inputUseArea());
        String rentExpense = inputRentPrice();
        int maximumNumberOfPeople = Integer.parseInt(scanner.nextLine());
        String typesOfRent = inputRentType();
        System.out.println("Nhập dịch vụ miễn phí kèm theo: ");
        String freeService = scanner.nextLine();
        Room room = new Room(serviceID, serviceName, usableArea, rentExpense, maximumNumberOfPeople, typesOfRent, freeService);
        facilityIntegerMap.put(room, 0);
        ReadAndWriteFile.writeMap(facilityIntegerMap, "D:\\CODEGYM\\A0321I1_HuynhThiCamNhung\\case_study_2\\src\\data\\facility.csv");
        System.out.println("Đã thêm mới room thành công!");
    }
}
