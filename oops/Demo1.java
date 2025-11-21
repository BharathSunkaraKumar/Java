class Keyboard {

    String keyAction;
    int numberOfKeys;

    // encapsulation
    private String color;

    // constructor
    public Keyboard() {
        keyAction = "key pressed";
        numberOfKeys = 100;
        color = "black";
    }

    public void press() {
        System.out.println(keyAction);
    }

    public void keys() {
        System.out.println(numberOfKeys);

    }

    public void keyboardColor() {
        System.out.println(color);
    }
}

class SuperKeyboard extends Keyboard {
    String ai = "ai installed in this keyboard";

    // public void aiKey() {
    // System.out.println(ai);
    // }

    public void keys() {
        System.out.println("pressed in superkeyboard");
    }
}

class Demo1 {
    public static void main(String arg[]) {

        Keyboard obj;
        obj = new SuperKeyboard();

        // obj.color = "white";

        obj.press();
        obj.keys();
        // obj.aiKey();
        obj.keyboardColor();
    }
}
