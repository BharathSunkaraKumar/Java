class Computer {
    public int brightness;
    public String volume;

    public void setBrightness(int brightness) {
        this.brightness = brightness;
        System.out.println(brightness);
    }

    public void setVolume(String volume) {
        this.volume = volume;
        System.out.println(volume);
    }

    public void resetSettings() {
        this.setBrightness(0);
        this.setVolume("");
        ;
    }
}

public class Demo {
    public static void main(String[] args) {
        Computer pc = new Computer();
        pc.setBrightness(100);
        pc.setVolume("medium");
        pc.resetSettings();
    }
}
