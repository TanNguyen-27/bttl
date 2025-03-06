package baitapPerson;

public class Employee extends Person {
    public int salary;
    public Employee(String name, String address, int salary){
        super(name, address);
        this.salary=salary;
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Salary: "+salary);
    }
}
