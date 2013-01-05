/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package team3824.smartdashboard.extension.sample_part;

import edu.wpi.first.smartdashboard.gui.StaticWidget;
import edu.wpi.first.smartdashboard.properties.Property;
import javax.swing.JLabel;

/**
 *
 * @author YoungAsus
 */
public class TutorialLabel extends StaticWidget
{
    JLabel label;
    
    @Override
    public void init()
    {

        // Initialize the Label
        label = new JLabel("Hello World!");

        add(label);
    }

    @Override
    public void propertyChanged(Property prprt)
    {

    }
}
