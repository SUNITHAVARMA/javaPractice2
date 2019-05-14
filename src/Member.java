 class MemberDetails {
    String name;
    int age;
    double salary;
     void display(){
         System.out.println("Member name"+" "+name);
         System.out.println("Member age"+" "+age);
         System.out.println("Member salary"+" "+salary);
    }

}
public class Member{
    public static void main(String args[]){
        MemberDetails m=new MemberDetails();
        m.name="Harry";
        m.age=30;
        m.salary=2500;
        m.display();
    }

}
