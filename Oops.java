//class Pen{
//    String color;
//    String type;
//    public void write(){
//        System.out.println("Writing Something");
//    }
//    public void printColor(){
//        System.out.println(this.color);
//    }
//}
class Student{
    String name;
    int age;
    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(int age){
        System.out.println(age);
    }
    Student(String name,int age){//parameterized constructor
        this.name=name;
        this.age=age;
    }
    Student(Student s2){
        this.name=s2.name;
        this.age=s2.age;
    }
    Student(){

    }
}

//class Shape{
//    String color;
//}
//class Triangle extends Shape{
//
//}

public class Oops {
    public static void main(String args[]){
//        Pen pen1=new Pen();
//        pen1.color="blue";
//        pen1.type="get";
//       pen1.write();
//        Pen pen2=new Pen();
//        pen2.color="black";
//        pen2.type="ballpoint";
//        pen1.printColor();
//        pen2.printColor();
//        Student s1=new Student();
//        s1.name="Aman";
//        s1.age=24;
//        Student s2=new Student(s1);
//        s1.printInfo(s1.age);

//        Triangle t1=new Triangle();
//        t1.color="red";
        }
    }
