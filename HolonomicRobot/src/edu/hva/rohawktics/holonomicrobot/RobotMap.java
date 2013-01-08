package edu.hva.rohawktics.holonomicrobot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // Motors
    public static final int FRONT_LEFT_MOTOR = 1;
    public static final int REAR_LEFT_MOTOR = 2;
    public static final int FRONT_RIGHT_MOTOR = 3;
    public static final int REAR_RIGHT_MOTOR = 4;
    
    // Sensors
    public static final int GYRO_PORT = 1;

    // Joysticks
    public static final int XBOX_CONROLLER = 1;
}
