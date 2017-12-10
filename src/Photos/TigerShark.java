package Photos;

import java.awt.*;
import javax.swing.*;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
/**
 * Write a description of class Win here.
 * 
 * @author Alina Kuzhiyil
 * Description
river image
 * Citation:
 * http://stackoverflow.com/questions/36395762/how-can-i-display-an-image-in-a-jpanel
 *  * http://www.rgagnon.com/javadetails/java-0581.html
 */

public class TigerShark extends JPanel
{
    Location l = new Location();   
    public TigerShark() throws IOException, URISyntaxException
    {
        String s = l.switchSlash();
        s = s.substring(0, 45);
        Color news = Color.decode("#73a1a2");
        setBackground(news);
        ImageIcon imageIcon = new ImageIcon(s + "/photos/tigershark.jpg");
        JLabel label = new JLabel(imageIcon);
        add(label);
    }
}
