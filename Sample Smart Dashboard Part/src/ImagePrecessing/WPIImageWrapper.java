/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ImagePrecessing;

import com.googlecode.javacv.cpp.opencv_core.IplImage;
import edu.wpi.first.wpijavacv.WPIImage;
import java.awt.image.BufferedImage;

/**
 *
 * @author Young
 */
public class WPIImageWrapper extends WPIImage
{
    public WPIImageWrapper(BufferedImage image)
    {
        super(image);
    }
    
    public WPIImageWrapper(IplImage image)
    {
        super(image);
    }
    
    public IplImage getIplImage()
    {
        return image;
    }

}

