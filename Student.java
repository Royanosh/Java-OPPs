class Main {
  public static void main(String[] args) {
    System.out.println("Student Data Class");
    Student Yogesh = new Student();
    Student Umesh = new Student(012, "Umesh Kumawat", 22, "Masai School", 90);
    System.out.println("Roll Number "+ Yogesh.roll + " Name " + Yogesh.name + " Age " + Yogesh.age + " Scholl Name "+ Yogesh.schoolName + " Marks " + Yogesh.marks);
    System.out.println("Roll Number "+ Umesh.roll + " Name " + Umesh.name + " Age " + Umesh.age + " Scholl Name "+ Umesh.schoolName + " Marks " + Umesh.marks);
    // System.out.println(Umesh);
  }
}

class Student {
  int roll;
  String name;
  int age;
  String schoolName;
  int marks;

  Student() {
    // this call will be like "new Student(...agruments overhere)"" and this call
    // should be first in constructor)
    // this (0,"Default Name",0,"Masai School",0);
    this.roll = 0;
    this.name = "Default Name";
    this.age = 0;
    this.schoolName = "Masai School";
    this.marks = 0;

  }

  Student(int roll, String name, int age, String schoolName, int marks) {
    this.roll = roll;
    this.name = name;
    this.age = age;
    this.schoolName = schoolName;
    this.marks = marks;
  }

}