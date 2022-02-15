package com.codegym.thi_m4.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity(name = "khuyenmai")
public class KhuyenMai {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idKhuyenMai;

    @NotBlank(message = "Tên không được để trống.")
    @Size(min = 5, max = 100)
    private String title;

    @NotNull(message = "Please choose start day")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date start_date;

    @NotNull(message = "Please choose end day")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date end_date;

    @NotBlank(message = "Vui lòng nhập mức giảm giá!")
    @Min(value = 10000, message = "Mức giảm giá phải lớn hơn 10.000 VNĐ !")
    private String mucGiamGia;

    @NotBlank(message = "Nhập chi tiết")
    @Size(min = 5, message = "Vui lòng nhập tối thiếu 5 ký tự.")
    private String details;

    public KhuyenMai() {
    }

    public int getIdKhuyenMai() {
        return idKhuyenMai;
    }

    public void setIdKhuyenMai(int idKhuyenMai) {
        this.idKhuyenMai = idKhuyenMai;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public String getMucGiamGia() {
        return mucGiamGia;
    }

    public void setMucGiamGia(String mucGiamGia) {
        this.mucGiamGia = mucGiamGia;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}

