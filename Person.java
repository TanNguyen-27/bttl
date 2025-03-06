package baitapPerson;

public class Person {
    String name;
    String address;
    public Person(String name, String address){
        this.name= this.name;
        this.address= this.address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address){
        this.address=address;
    }

    public String getAddress() {
        return address;
    }
    public void display(){
        System.out.println("hoc va ten:"+name);
        System.out.println("dia chi nha: "+address);
    }
}
