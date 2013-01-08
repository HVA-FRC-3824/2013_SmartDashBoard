/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hva.rohawktics.holonomicrobot.subsystems;

import edu.hva.rohawktics.holonomicrobot.RobotMap;
import edu.wpi.first.wpilibj.Gyro;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author Aaron
 */
public class Orientation extends Subsystem
{
    private Gyro gyro = new Gyro(RobotMap.GYRO_PORT);
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public void initDefaultCommand()
    {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public Gyro getGyro()
    {
        return gyro;
    }
    
    public double getHeading()
    {
        return gyro.getAngle();
    }
}
