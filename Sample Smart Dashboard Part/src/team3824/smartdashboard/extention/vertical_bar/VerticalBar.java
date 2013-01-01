/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package team3824.smartdashboard.extention.vertical_bar;

import edu.wpi.first.smartdashboard.gui.Widget;
import edu.wpi.first.smartdashboard.properties.ColorProperty;
import edu.wpi.first.smartdashboard.properties.DoubleProperty;
import edu.wpi.first.smartdashboard.properties.Property;
import edu.wpi.first.smartdashboard.types.DataType;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

/**
 *
 * @author YoungAsus
 */
public class VerticalBar extends Widget
{

    public static final String NAME = "Vertical Percentage Bar";
    public static final DataType[] TYPES =
    {
        DataType.NUMBER
    };
    public final ColorProperty foreground = new ColorProperty(this, "Foreground Color", Color.GREEN);
    public final DoubleProperty max = new DoubleProperty(this, "Maximum", 100);
    private double value = 0.0;

    @Override
    public void setValue(Object value)
    {
        this.value = ((Number) value).doubleValue();

        repaint();
    }

    @Override
    public void init()
    {
        setPreferredSize(new Dimension(64, 200));
    }

    @Override
    public boolean validatePropertyChange(Property property, Object value)
    {
        if (property == max && ((Number) value).doubleValue() <= 0)
        {
            return false;
        }
        return true;
    }

    @Override
    public void propertyChanged(Property property)
    {
        if (property == foreground)
        {
            repaint();
        }
        else if (property == max)
        {
            repaint();
        }
    }

    @Override
    protected void paintComponent(Graphics g)
    {
        Dimension size = getSize();

        g.setColor(Color.BLACK);
        g.fillRect(0, 0, size.width, size.height);

        int barHeight = (int) (size.height * value / max.getValue());
        g.setColor(foreground.getValue());
        g.fillRect(0, size.height - barHeight, size.width, barHeight);

        g.setColor(Color.BLACK);
        g.drawRect(0, 0, size.width - 1, size.height - 1);
    }
}
