package baitaptruutuong;

import java.util.Scanner;

public class hinhtron extends hinhhoc{
    public float bankinh;
    public hinhtron(){
        this.name="hinh tron";
    }
    public void nhapBankinh(){
        Scanner tc=new Scanner(System.in);
        System.out.print("nhap ban kinh hinh tron: ");
        this.bankinh=tc.nextFloat();
    }
    public void tinhChuVi(){
        chuvi= 2*PI*bankinh;
    }
    public void tinhdientich(){
        dientich=PI*bankinh*bankinh;
    }
}
