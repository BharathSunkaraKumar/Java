
// Polymorphism: Polymorphism means many behaviours, there are two types of polymorphism run time and compile time polymorphism 

// Compile time polymorphism: the behave is defined at compile time is called compile time polymorphism. When compile which method is executed we know is called compile time polymorphism. overloading is part of compile time.

// Run time polymorphism: the behave is defined at Run time is called run time polymorphism. Which method is executed on run time is run time polymorphism. Overriding is part of run time.

// Dynamic method dispatch in java
class A {
    public void show() {
        System.out.println("in class A");
    }
}

class B extends A {
    public void show() {
        System.out.println("in class B");
    }
}

class C extends B {
    public void show() {
        System.out.println("in class B");
    }
}

public class Demo {
    public static void main(String arg[]) {
        System.out.println("polymorphism");

        A obj = new A();

        obj.show();

        obj = new B();
        obj.show();

        obj = new C();
        obj.show();
    }
}
