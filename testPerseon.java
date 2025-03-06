package baitapPerson;

public class testPerseon {
    public static void main(String[]args){
        // nhan vien
        Employee el=new Employee("Nguyen Thien Tan","B5/??T, Tran Dai Nghia",50000);
        System.out.println("Employee:");
        el.display();
        //khach hang
        Customer ct = new Customer("Chung Tan Phat", "BV Tam than", 55000);
        System.out.println("Customer: ");
        ct.display();
    }
}
