package baitaptruutuong;

import java.util.Scanner;

public class hinhchunhat extends hinhhoc {
    public float dai;
    public float rong;
    public hinhchunhat(){
        this.name="hinh chu nhat";
    }

    public void nhapHCN() {
        Scanner dc= new Scanner(System.in);
        System.out.print("nhap chieu dai hinh chu nhat: ");
        this.dai= dc.nextFloat();
        System.out.print("nhap chieu rong hinh chu nhat: ");
        this.rong=dc.nextFloat();
    }
    public void tinhchuvi(){
        chuvi=(dai+rong)*2;
    }
    public void tinhdientich(){
        dientich=dai*rong;
    }
}
