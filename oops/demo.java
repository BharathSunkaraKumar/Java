class Mobile {
    double display = 6.4;
    String processor = "Snapdragon 8 Gen 3";

    public void screen() {
        System.out.println("dispaly size" + " " + display);
    }

    public void performance() {
        System.out.println("power paked performance" + " " + processor);
    }
}

class SuperMobile extends Mobile {
    String chip = "gaming";

    public void smartChip() {
        System.out.println("this supermobile have extra chip for" + " " + chip);
    }
}

class Demo {
    public static void main(String arg[]) {

        SuperMobile obj;
        obj = new SuperMobile();

        obj.screen();
        obj.performance();
        obj.smartChip();
    }
}