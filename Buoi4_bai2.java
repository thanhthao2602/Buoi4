package buoi4_bai2;

import java.util.Scanner;

public class Buoi4_bai2 {

    private float dai;
    private float rong;

    public Buoi4_bai2() {

    }

    public Buoi4_bai2(float dai, float rong) {
        this.dai = dai;
        this.rong = rong;
    }

    public float getDai() {
        return dai;
    }

    public void setDai(float dai) {
        this.dai = dai;
    }

    public float getRong() {
        return rong;
    }

    public void setRong(float rong) {
        this.rong = rong;
    }
public void nhap(){
    Scanner s = new Scanner(System.in);
    System.out.print("nhap chieu dai hinh chu nhat : ");
    dai = s.nextFloat();
    System.out.print("nhap chieu rong hinh chu nhat : ");
    rong = s.nextFloat();
}
public void vehinhchunhat(){
    for(int i=1 ; i<= dai ; i++){
        for(int j=1 ; j<= rong ; j++){
         if(i==1 || i == dai || j==1 || j==rong) {
             System.out.print("* ");
         }else{
             System.out.print(" ");
         }  
        }
        System.out.println();
    }
}
public float chuvi(){
    return(dai+rong)*2;
}
public float dientich(){
    return dai*rong;
}

    public static void main(String[] args) {
        Buoi4_bai2 hcn = new Buoi4_bai2();
        hcn.nhap();
        hcn.vehinhchunhat();
        System.out.print("chu vi hinh chu nhat : ");
        System.out.println( hcn.chuvi());
       System.out.print("dien tich hinh chu nhat : ");
       System.out.println(hcn.dientich());
        
    }

}
