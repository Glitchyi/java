class Employee{
    String Name,Address;
    int Age;
    long PhoneNumber;
    float Salary;
    Employee(int age,long pno,float sal,String nam,String addr){
        Name=nam;
        Age=age;
        Address=addr;
        PhoneNumber=pno;
        Salary=sal;
    }
    void print_Salary(){
        System.out.println(""+Salary);
    }
}
class Officer extends Employee{
    String Specialization;
    Officer(int age,long pno,float sal,String nam,String addr,String spec){
        super(age, pno,sal, nam, addr);
        Specialization=spec;
    }
    void displaydetails(){
        System.out.println("Name:"+Name+" Age:"+Age+" Address:"+Address+" Phone Number:"+PhoneNumber+        " Salary:"+Salary+" Specialization:"+Specialization);
    }
}
class Manager extends Employee{
    String Department;
    Manager(int age,long pno,float sal,String nam,String addr,String dept){
        super(age, pno, sal, nam, addr);
        Department=dept;
    }
    void displaydetails(){
        System.out.println("Name:"+Name+" Age:"+Age+" Address:"+Address+" Phone Number:"+PhoneNumber+" Salary:"+Salary+" Specialization:"+Department);
    }
}
public class InheritanceClass {
    public static void main(String[] args) {
        final Officer O = new Officer(40, 01234567, 5000, "Babu", "Tripunithura, Ernakulam", "Systems Engineer");
        O.displaydetails();
        final Manager M = new Manager(40, 01234567, 5000, "Babu", "Tripunithura, Ernakulam", "Analytics");
        M.displaydetails();;
    }
}
