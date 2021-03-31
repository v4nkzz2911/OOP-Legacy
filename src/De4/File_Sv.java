/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author winan
 */
public class File_Sv {

    ArrayList<Student> listST = new ArrayList<>();

    public void FileWrite(String s) throws IOException {
        try {
            File f = new File("sinhvien.dat");
            FileWriter fw = new FileWriter(f);
            fw.append(s);
            fw.close();
            System.out.println("Save thành công 1 sinh viên!");
        } catch (Exception e) {
            System.out.println("Lỗi ghi file: " + e);
        }

    }

    public void ReadFile() {
        try {
            File f = new File("sinhvien.dat");
            String[] result;
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                Student st = new Student();
                result = line.split("\\$");
                st.setDC(result[0]);
                st.setDTK(result[1]);
                st.setEmailString(result[2]);
                st.setGT(result[3]);
                st.setHT(result[4]);
                st.setMSV(result[5]);
                st.setNS(result[6]);
                listST.add(st);
            }
            for (int i = 0; i < listST.size(); i++) {
                System.out.println(listST.get(i).toString());
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Lỗi đọc file: " + e);
        }
    }

    public void menu() {
        System.out.println("1. Nhập vào thông tin");
        System.out.println("2. Lưu vào file");
        System.out.println("3. Đọc từ file ra table");
        System.out.println("4. Thoát");
        System.out.print("Chọn: ");
    }

    public void show_tbl() {
        SV_Form sv_tb = new SV_Form();
        sv_tb.setVisible(true);
        while (true) {            
            if (SV_Form.exitcode==1) {
                
                return;
            }
        }
        
        
    }
}
