class Student {
    int rollNo;
    String name;
    String email;

    Student(int rollNo, String name, String email) {
        this.rollNo = rollNo;
        this.name = name;
        this.email = email;
    }

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    Student() {
        email = "elliot1010@gmail.com";
        name = "mr.Robot";
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("overriding constructors");

        Student student1 = new Student(18, "Bharath", "bharathkumar11992@gamil.com");
        Student student2 = new Student(01, "elliot");
        Student student3 = new Student();
        System.out.println(student1.name + " " + student1.email + " " + student1.rollNo);
        System.out.println(student2.name + " " + student2.rollNo);
        System.out.println(student3.name + " " + student3.email);

    }

}
