/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hva.rohawktics.holonomicrobot.subsystems;

import edu.hva.rohawktics.holonomicrobot.RobotMap;
import edu.hva.rohawktics.holonomicrobot.commands.DriveWithXboxContoller;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * DriveTrain is the driving system of the robot.
 * @author YoungAsus
 */
public class DriveTrain extends Subsystem
{
    private RobotDrive robotDrive = new RobotDrive(RobotMap.FRONT_LEFT_MOTOR, RobotMap.REAR_LEFT_MOTOR, RobotMap.FRONT_RIGHT_MOTOR, RobotMap.REAR_RIGHT_MOTOR);

    public DriveTrain()
    {
        robotDrive.setSafetyEnabled(false);
        robotDrive.setInvertedMotor(RobotDrive.MotorType.kFrontLeft, true);
        robotDrive.setInvertedMotor(RobotDrive.MotorType.kFrontRight, false);
        robotDrive.setInvertedMotor(RobotDrive.MotorType.kRearLeft, true);
        robotDrive.setInvertedMotor(RobotDrive.MotorType.kRearRight, false);
    }

    public void initDefaultCommand()
    {
        setDefaultCommand(new DriveWithXboxContoller());
    }

    public void holonomicDrive(double magnitude, double direction, double rotatation)
    {
        robotDrive.mecanumDrive_Polar(magnitude, direction, rotatation);
    }

}
