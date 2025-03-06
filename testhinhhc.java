package baitaptruutuong;

public class testhinhhc {
    public static void main(String[] args){
        //hinh tron
        hinhtron ht=new hinhtron();
        ht.nhapBankinh();
        ht.tinhChuVi();
        ht.tinhdientich();
        ht.xuatten();
        ht.Chuvi();
        ht.Dientich();
        System.out.println("===============================================================================================");

        //hinh chu nhat
        hinhchunhat hcn=new hinhchunhat();
        hcn.nhapHCN();
        hcn.tinhchuvi();
        hcn.tinhdientich();
        hcn.xuatten();
        hcn.Chuvi();
        hcn.Dientich();
        System.out.println("===============================================================================================");

        //hinh tru
        hinhtru htc=new hinhtru();
        htc.HT();
        htc.xuatten();
        htc.tinhThetich();
        htc.Thetich();
        System.out.println("===============================================================================================");

        //hinh vuong
        hinhvuong hv=new hinhvuong();
        hv.nhapcanh();
        hv.tinhchuvi();
        hv.tinhdientich();
        hv.xuatten();
        hv.Chuvi();
        hv.Dientich();
        System.out.println("===============================================================================================");
    }
}
