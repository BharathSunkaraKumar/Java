
class Calculater {
    public int add(int n1, int n2) {
        System.out.println("added");
        return n1 + n2;
    }

    public int add(int n1, int n2, int n3) {
        System.out.println("added");
        return n1 + n2 + n3;
    }

    public void playMusic() {
        System.out.println("playing music...");
    }

    public int cost(int money) {
        return money;
    }

    public String modeOn() {
        return "mode on";
    }
}

class Demo {
    public static void main(String arg[]) {

        int num1 = 10;
        int num2 = 15;
        int num3 = 15;
        // int result = num1 + num2;
        // System.out.println(result);

        Calculater calc = new Calculater();
        int calResult = calc.add(num1, num2, num3);
        System.out.println(calResult);

        calc.playMusic();
        int sendMoney = calc.cost(10);
        System.out.println(sendMoney);
        String mode = calc.modeOn();
        System.out.println(mode);
    }
}