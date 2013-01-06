/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ImagePrecessing;

import edu.wpi.first.smartdashboard.camera.WPICameraExtension;
import edu.wpi.first.smartdashboard.robot.Robot;
import edu.wpi.first.wpilibj.networking.NetworkTable;
import edu.wpi.first.wpilibj.tables.ITable;
import edu.wpi.first.smartdashboard.xml.SmartDashboardXMLReader;
import edu.wpi.first.wpijavacv.WPIColorImage;
import edu.wpi.first.wpijavacv.WPIImage;

/**
 *
 * @author YoungAsus
 */
public class ImageProcessing extends WPICameraExtension
{
    static double x = 0;
    static double y = 0;
    @Override
    public WPIImage processImage(WPIColorImage rawImage)
    {
        x++;
        y++;
        ITable table = Robot.getTable();
        table.putNumber("x", x);
        table.putNumber("y", y);
        return rawImage.getGreenChannel();
    }
}
