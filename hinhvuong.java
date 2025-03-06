package baitaptruutuong;

import java.util.Scanner;

public class hinhvuong extends hinhchunhat {
    public hinhvuong(){
        this.name="hinh vuong";
    }
    public void nhapcanh(){
        Scanner nc=new Scanner(System.in);
        System.out.print("nhap cạnh: ");
        this.dai=this.rong= nc.nextFloat();
    }
}
