package jp.ac.kagawa_u.infoexpr.Sensor;

import lejos.hardware.Sound;
import lejos.hardware.motor.Motor;
import lejos.hardware.port.SensorPort;
import lejos.robotics.RegulatedMotor;

public class Main {
    static TouchSensor touch = new TouchSensor(SensorPort.S1);
    static LightSensor rightLight = new LightSensor(SensorPort.S2);
    static LightSensor leftLight = new LightSensor(SensorPort.S3);
    static RegulatedMotor rightMotor  = Motor.B;
    static RegulatedMotor leftMotor  = Motor.C;

    public static void main (String[] args) {
        float middleValue = 0.40F;
        int straight = 500;
        int lowSpeed = 100;
        int highSpeed = 300;

        while ( ! touch.isPressed() ) {
        	 float leftvalue = leftLight.getLight();
             float rightvalue = rightLight.getLight();

        	// 黒&黒
            if (leftvalue < middleValue && rightvalue < middleValue) {

            }
            // 黒&白
            else if (leftvalue < middleValue && rightvalue >= middleValue) {
                motorSetSpeed(100, 550);
                motorForward();
            }
            // 白&黒
            else if (leftvalue >= middleValue && rightvalue < middleValue) {
                motorSetSpeed(500, 50);
                motorForward();
            }
            // 白&白
            else if (leftvalue >= middleValue && rightvalue >= middleValue) {
                motorSetSpeed(straight, straight);
                motorForward();
            }
            else {
                Sound.beep();
            }
        }
    }

    // Valueクラスに保存
    private static void motorSetSpeed (int leftMotorSpeed, int rightMotorSpeed) {
        leftMotor.setSpeed(leftMotorSpeed);
        rightMotor.setSpeed(rightMotorSpeed);
    }

    private static void motorForward () {
        leftMotor.forward();
        rightMotor.forward();
    }
}
