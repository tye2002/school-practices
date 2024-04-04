import java.awt.*;
import javax.swing.*;

public class MyCanvas extends JComponent{  
     
	Image img;
	
    public void paint(Graphics g) {  
		Graphics2D g2 = (Graphics2D) g;

		img = new ImageIcon(getClass().getResource("mapimage.jpg")).getImage();
		g2.drawImage(img,0,0, getWidth(), getHeight(), null);
    }     
}   
