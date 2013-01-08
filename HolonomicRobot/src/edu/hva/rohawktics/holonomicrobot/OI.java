
package edu.hva.rohawktics.holonomicrobot;

import edu.hva.rohawktics.holonomicrobot.commands.UpdateTurnRightPID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.InternalButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI
{
    public Joystick xboxControler = new Joystick(RobotMap.XBOX_CONROLLER);
    private InternalButton updateTurnRightPIDButton = new InternalButton();

    public OI()
    {
        updateTurnRightPIDButton.whenPressed(new UpdateTurnRightPID());
        SmartDashboard.putData("UpdatePID", updateTurnRightPIDButton);
    }
}

