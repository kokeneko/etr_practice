package sample;
import lejos.hardware.Button;
import lejos.hardware.lcd.LCD;

public class EV3FirstProgram {
    public static void main(String[] args) {
        LCD.clear();
        LCD.drawString("First EV3 Program", 0, 5);
        Button.waitForAnyPress();
        LCD.clear();
        LCD.refresh();
    }
}