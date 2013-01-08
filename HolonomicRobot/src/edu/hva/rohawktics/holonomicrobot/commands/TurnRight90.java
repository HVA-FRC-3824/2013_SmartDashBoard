/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hva.rohawktics.holonomicrobot.commands;

import edu.wpi.first.wpilibj.PIDController;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 * @author Aaron
 */
public class TurnRight90 extends CommandBase
{
    private static PIDController PIDcontroller;
    
    private static final double DEFAULT_P = 2.0;
    private static final double DEFAULT_I = 2.0;
    private static final double DEFAULT_D = 2.0;
    
    private static final double GYRO_NINETY_DEGREES = 90;
    
    private static final double TURN_TOLORENCE = .1;
    
    public TurnRight90()
    {
        requires(driveTrain);
        requires(orientation);
        
        SmartDashboard.putNumber("TurnRightP", DEFAULT_P);
        SmartDashboard.putNumber("TurnRightI", DEFAULT_I);
        SmartDashboard.putNumber("TurnRightD", DEFAULT_D);
        
        PIDcontroller = new PIDController(DEFAULT_P, DEFAULT_I, DEFAULT_D, orientation.getGyro(), driveTrain);
    }

    // Called just before this Command runs the first time
    protected void initialize()
    {
        // Set the Setpoint to 90 degrees from current heading
        PIDcontroller.setSetpoint(orientation.getHeading() + GYRO_NINETY_DEGREES);
        PIDcontroller.enable();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute()
    {
        SmartDashboard.putNumber("Error", orientation.getHeading() - PIDcontroller.getSetpoint());
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished()
    {
        return Math.abs(orientation.getHeading() - PIDcontroller.getSetpoint()) < TURN_TOLORENCE;
    }

    // Called once after isFinished returns true
    protected void end()
    {
        PIDcontroller.disable();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted()
    {
        end();
    }
    
    public static void setPIDValue(double p, double i, double d)
    {
        PIDcontroller.setPID(p, i, d);
    }
}
