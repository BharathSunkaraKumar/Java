
class Student {
    int rollno;
    int marks;
    String name;
}

class ArrayOfObject {
    public static void main(String arg[]) {

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.rollno = 16;
        s1.marks = 97;
        s1.name = "Bharath";

        s2.rollno = 18;
        s2.marks = 99;
        s2.name = "Kohli";

        s3.rollno = 01;
        s3.marks = 100;
        s3.name = "Elliot";

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        // System.out.println(students[0]);

        // for (int i = 0; i < students.length; i++) {
        // System.out.println(i);
        // System.out.println(students[i].name + " : " + students[i].rollno);
        // }

        for (Student s : students) {
            System.out.println(s.name + " : " + s.rollno);
        }
    }
}
