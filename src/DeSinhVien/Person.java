/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DeSinhVien;

/**
 *
 * @author er1nzz
 */
public class Person {
    protected String HoTen;
    protected String NgaySinh;
    protected String DiaChi;
    protected String GioiTinh;

    public Person() {
    }

    public Person(String HoTen, String NgaySinh, String DiaChi, String GioiTinh) {
        this.HoTen = HoTen;
        this.NgaySinh = NgaySinh;
        this.DiaChi = DiaChi;
        this.GioiTinh = GioiTinh;
    }

    @Override
    public String toString() {
        return HoTen + "$" + NgaySinh + "$" + DiaChi + "$" + GioiTinh + "$";
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }
    
    
}
