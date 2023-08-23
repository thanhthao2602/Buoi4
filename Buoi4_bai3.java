package buoi4_bai3;

import java.util.Scanner;
public class Buoi4_bai3 {
private String msv;
private String hoten;
private Float diemtoan;
private Float diemly;
private Float diemhoa;
public Buoi4_bai3(){
    
}

    public Buoi4_bai3(String msv, String hoten, Float diemtoan, Float diemly, Float diemhoa) {
        this.msv = msv;
        this.hoten = hoten;
        this.diemtoan = diemtoan;
        this.diemly = diemly;
        this.diemhoa = diemhoa;
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public Float getDiemtoan() {
        return diemtoan;
    }

    public void setDiemtoan(Float diemtoan) {
        this.diemtoan = diemtoan;
    }

    public Float getDiemly() {
        return diemly;
    }

    public void setDiemly(Float diemly) {
        this.diemly = diemly;
    }

    public Float getDiemhoa() {
        return diemhoa;
    }

    public void setDiemhoa(Float diemhoa) {
        this.diemhoa = diemhoa;
    }

public void nhap(){
    Scanner s = new Scanner(System.in);
    System.out.print("Ma sinh vien : ");
    msv = s.nextLine();
    System.out.println();
    System.out.print("Ho va ten ");
    hoten= s.nextLine();
    System.out.println();
    System.out.print("Diem toan ");
    diemtoan = s.nextFloat();
    System.out.println();
    System.out.print("Diem ly ");
    diemly = s.nextFloat();
    System.out.println();
    System.out.print("Diem hoa ");
    diemhoa = s.nextFloat();
    
}
float diemtb(){
 return(diemtoan+diemly+diemhoa)/3;
}
public void xuat() {
        System.out.printf("%-15s %-30s %-15s  %-15s  %-15s %-15s", msv, hoten, diemly, diemhoa, diemtoan, diemtb());
    }
    
    public static void main(String[] args) {
        Buoi4_bai3 []hs = new Buoi4_bai3[5];
         for (int i = 0; i < 5; i++) {
            System.out.println("Hoc sinh thu " + (i+1));
            hs[i] = new Buoi4_bai3();
            hs[i].nhap();
        }
         System.out.printf("%-15s %-30s %-30s %-20s %-15s ","Ma sinh vien ", "Ho ten ", "diem toan ", "diem ly", "diem hoa", "Diem TB");
        for (int i = 0 ; i < 5 ; i++){
            System.out.println();
            hs[i].xuat();
        }  
    }
    
}
