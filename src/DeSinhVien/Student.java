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
public class Student extends Person{
    private String MaSV;
    private String Email;
    private float DiemTK;

    public Student() {
    }

    public Student(String MaSV, String Email, float DiemTK) {
        this.MaSV = MaSV;
        this.Email = Email;
        this.DiemTK = DiemTK;
    }

    public Student(String MaSV, String Email, float DiemTK, String HoTen, String NgaySinh, String DiaChi, String GioiTinh) {
        super(HoTen, NgaySinh, DiaChi, GioiTinh);
        this.MaSV = MaSV;
        this.Email = Email;
        this.DiemTK = DiemTK;
    }

    @Override
    public String toString() {
        return super.toString() + MaSV + "$" + Email + "$" + DiemTK;
    }

    public String getMaSV() {
        return MaSV;
    }

    public void setMaSV(String MaSV) {
        this.MaSV = MaSV;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public float getDiemTK() {
        return DiemTK;
    }

    public void setDiemTK(float DiemTK) {
        this.DiemTK = DiemTK;
    }
    
    
}
