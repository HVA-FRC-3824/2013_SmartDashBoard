/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hva.rohawktics.holonomicrobot.commands;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 * @author Aaron
 */
public class UpdateTurnRightPID extends CommandBase
{
    public UpdateTurnRightPID()
    {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize()
    {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute()
    {
        TurnRight90.setPIDValue(SmartDashboard.getNumber("TurnRightP"), 
                                SmartDashboard.getNumber("TurnRightI"), 
                                SmartDashboard.getNumber("TurnRightD"));
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished()
    {
        return true;
    }

    // Called once after isFinished returns true
    protected void end()
    {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted()
    {
    }
}
