package buoi4_bai1;
import java.util.Scanner;


public class Buoi4_bai1 {

   
    
    

    private String masach;
    private String tensach;
    private String tentacgia;
    private String nhaxuatban;
    private int namxuatban;
    public Buoi4_bai1(){
    
}

public Buoi4_bai1(String masach, String tensach, String tentacgia, String nhaxuatban, int namxuatban) {
        this.masach = masach;
        this.tensach = tensach;
        this.tentacgia = tentacgia;
        this.nhaxuatban = nhaxuatban;
        this.namxuatban = namxuatban;
}        
        public String getmasach() {
            return masach;
        }

        public void setMasach(String masach) {
            this.masach = masach;
        }

        public String getTensach() {
            return tensach;
        }

        public void setTensach(String tensach) {
            this.tensach = tensach;
        }

        public String getTentacgia() {
            return tentacgia;
        }

        public void setTentacgia(String tentacgia) {
            this.tentacgia = tentacgia;
        }

        public String getNhaxuatban() {
            return nhaxuatban;
        }

        public void setNhaxuatban(String nhaxuatban) {
            this.nhaxuatban = nhaxuatban;
        }

        public int getNamxuatban() {
            return namxuatban;
        }

        public void setNamxuatban(int namxuatban) {
            this.namxuatban = namxuatban;
        }
public void nhap(){
      Scanner s = new Scanner(System.in);
    System.out.print("Ma sach :");
     masach= s.nextLine();
     System.out.println();
     System.out.print("Ten sach : ");
     tensach = s.nextLine();
     System.out.println();
     System.out.print("Tac gia: ");
        tentacgia = s.nextLine();
        System.out.println();
        System.out.print("Nha xuat ban: ");
        nhaxuatban = s.nextLine();
        System.out.println();
        System.out.print("Nam xuat ban: ");
        namxuatban = s.nextInt();
}
public void xuat(){
    System.out.printf("%-15s %-30s %-30s %-20s %-15s ", masach, tensach, tentacgia, nhaxuatban, namxuatban);
}
        
        
    

    
    public static void main(String[] args) {
//     
        Buoi4_bai1 [] book = new Buoi4_bai1[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Sach thu " + (i+1));
            book[i] = new Buoi4_bai1();
            book[i].nhap();
        }
        System.out.printf("%-15s %-30s %-30s %-20s %-15s ","Ma Sach", "Ten sach", "Tac gia", "Nha Xuat Ban", "Nam xuat ban");
        for (int i = 0 ; i < 5 ; i++){
            System.out.println();
            book[i].xuat();
        }  
    }
    
}
