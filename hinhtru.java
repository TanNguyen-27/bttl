package baitaptruutuong;

import java.util.Scanner;

public class hinhtru extends hinhtron  {
   public float chieucao;
    public hinhtru(){
        this.name="hinh tru";
    }
    public void HT(){
        Scanner bc= new Scanner(System.in);
        System.out.print("nhap chieu cao: ");
        this.chieucao=bc.nextFloat();
        System.out.print("nhap ban kinh: ");
        this.bankinh= bc.nextFloat();
    }
    public void tinhThetich() {
        thetich=PI*bankinh*bankinh*chieucao;
    }
}
