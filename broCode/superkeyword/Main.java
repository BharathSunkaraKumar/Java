
class Person {
    String fName;
    String lName;

    Person(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
    }

    void getPerson() {
        System.out.println(fName + " " + lName);
    }
}

class Student extends Person {
    int gpa;

    Student(int gpa, String fName, String lName) {
        super(fName, lName);
        this.gpa = gpa;
    }

    void getStudent() {
        System.out.println(fName + " " + lName + " got " + gpa + " gpa");
    }
}

class Employee extends Person {
    int salary;

    Employee(int salary, String fName, String lName) {
        super(fName, lName);
        this.salary = salary;
    }

    void getEmployee() {
        System.out.println(fName + " " + lName + " get " + salary + " salary per month");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("super keyword");
        Person person = new Person("bharath", "kumar");
        Student student = new Student(99, "walter", "white");
        Employee employee = new Employee(40000, "jesse", "pinkman");
        person.getPerson();
        student.getStudent();
        employee.getEmployee();
    }
}
