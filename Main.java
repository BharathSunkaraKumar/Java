// class Mobile {
//     // attributes(properties or variabels or instancevariables)
//     int price = 25000;
//     String model = "K20pro";
//     String brand = "Red mi";
//     String processor = "snapdragon 855";

//     // methods(actions)
//     public void chip() {
//         System.out.println(processor);
//     }

//     public void Company() {
//         System.out.println(brand + " " + model);
//     }

//     public void price() {
//         System.out.println(price);
//     }

//     public int camera(int megaPixal) {
//         return megaPixal;
//     }

//     public String display(String size) {
//         return size;
//     }

// }

// class AiMobile extends Mobile {
//     public void show() {
//         System.out.println(price);
//     }
// }

// class Student {
//     int rollno;
//     String name;
// }

// class Apple {
//     int price;
//     String model;
//     static String brand;

//     public void reaction() {
//         System.out.println("this is non static");
//     }

//     static void action() {
//         System.out.println("is static method");
//     }

//     static {
//         System.out.println("this is static statement");
//     }
// }

// class Human {
//     private int age;
//     private String name;

// this keyword
// public void setAge(int age) {
// this.age = age;
// }

// public void setName(String name) {
// this.name = name;
// }

// constructor
// public Human() {
// age = 26;
// name = "bharath";
// }

// public Human(int age, String name) {
// this.age = age;
// this.name = name;
// }

// public int getAge() {
// return age;
// }

// public String getName() {
// return name;
// }

// }

//this() and super()
// class A {
//     public A() {
//         System.out.println("A default");
//     }

//     public A(int n) {
//         System.out.println("A perameter");
//     }
// }

// class B extends A {
//     public B() {
//         super(5);
//         System.out.println("B default");
//     }

//     public B(int n) {
//         this();
//         System.out.println("B perameter");
//     }
// }

//method overriding
class Calc {
    public int add(int a, int b) {
        return a + b;
    }
}

class SuperCalc extends Calc {
    public int add(int a, int b) {
        return a + b + 5;
    }
}

public class Main {

    public static void main(String[] arg) {
        // primitive data types

        // int n = 40;
        // boolean b = true;
        // float f = 4.99f;
        // char c = 'b';
        // double d = 1456;

        // non-primitive data types

        // Strings

        // String str = "sbk";
        // String str1 = new String("bharath");
        // int s = str.length();

        // Arrays

        // int[] arr = { 1, 2, 3, 4 };
        // for (int i = 0; i < arr.length; i++) {
        // System.out.println(arr[i]);
        // }

        // String[] arr = { "sbk", "bharath", "java", "javascript" };
        // for (String a : arr) {
        // System.out.println(a);
        // }

        // Dynamic arrays
        // String[][] arr = new String[3][4];

        // // System.out.println(arr[0][1]);

        // for (int i = 0; i < 3; i++) {
        // // System.out.println(arr[i]);

        // for (int j = 0; j < 4; j++) {
        // arr[i][j] = "*";
        // System.out.print(arr[i][j] + " ");
        // }
        // System.out.println();
        // }

        // AiMobile obj1 = new AiMobile();
        // obj1.chip();
        // obj1.Company();
        // obj1.price();

        // int mobileCamera = obj1.camera(48);
        // System.out.println(mobileCamera + " " + "mega pixal camera");

        // String mobileDisplay = obj1.display("6.2inch display");
        // System.out.println(mobileDisplay);

        // obj1.show();

        // var

        // var a = 20;
        // System.out.println(a);

        // array of objects

        // Student s1 = new Student();
        // Student s2 = new Student();
        // Student s3 = new Student();

        // s1.name = "bharath";
        // s1.rollno = 21;

        // s2.name = "virat";
        // s2.rollno = 18;

        // s3.name = "elliot";
        // s3.rollno = 01;

        // Student students[] = new Student[3];
        // students[0] = s1;
        // students[1] = s2;
        // students[2] = s3;

        // for (int i = 0; i < students.length; i++) {
        // System.out.println(students[i].name + " : " + students[i].rollno);
        // }

        // String str = new String("bharath");

        // System.out.println(str.concat(" kumar").concat(" sunkara"));

        // StringBuffer s1 = new StringBuffer();
        // System.out.println(s1.append("kumar"));

        // Apple obj1 = new Apple();
        // Apple obj2 = new Apple();

        // obj1.model = "16";
        // obj1.price = 50000;
        // Apple.brand = "iphone";

        // obj2.model = "15";
        // obj2.price = 76000;
        // Apple.brand = "oneplus";

        // Apple.brand = "apple iphone";

        // System.out.println(Apple.brand + " " + obj1.model + " " + obj1.price);
        // System.out.println(Apple.brand + " " + obj2.model + " " + obj2.price);

        // static

        // obj1.reaction();
        // Apple.action();

        // Human obj = new Human();
        // Human obj1 = new Human(25, "sbk");

        // obj.setAge(25);
        // obj.setName("sbk");
        // System.out.println(obj.getName() + " " + obj.getAge());
        // System.out.println(obj1.getName() + " " + obj1.getAge());

        // B obj = new B(3);

        SuperCalc obj = new SuperCalc();
        int result = obj.add(5, 10);
        System.out.println(result);

    }
}
