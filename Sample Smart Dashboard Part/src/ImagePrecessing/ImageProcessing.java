/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ImagePrecessing;

import edu.wpi.first.smartdashboard.camera.WPICameraExtension;
import edu.wpi.first.wpijavacv.WPIColorImage;
import edu.wpi.first.wpijavacv.WPIImage;

/**
 *
 * @author YoungAsus
 */
public class ImageProcessing extends WPICameraExtension
{
    @Override
    public WPIImage processImage(WPIColorImage rawImage)
    {
        return rawImage.getRedChannel();
    }
}
