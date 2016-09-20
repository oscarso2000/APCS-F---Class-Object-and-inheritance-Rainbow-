//Oscar SO APCS P7 180947
// Chapter 5 Question 27

// ________________________________________________

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Rainbow extends JPanel
{
  // Declare skyColor:
  private Color skyColor = Color.CYAN;

  public Rainbow()
  {
    setBackground(skyColor);
  }

  // Draws the rainbow.
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);
    int width = getWidth();    
    int height = getHeight();
    int xCenter = width/2;
    int yCenter = height*3/4;
    
    
    // Declare and initialize local int variables xCenter, yCenter
    // that represent the center of the rainbow rings:
    // ________________________________________________
 
    // Declare and initialize the radius of the large semicircle:
    int largeRadius = width/4; 
    // ________________________________________________

    g.setColor(Color.RED);

g.fillArc(xCenter - largeRadius/2,yCenter - largeRadius/2 + largeRadius/4 -height/4,largeRadius,largeRadius,0,180);


    int smallRadius = height/4;
 int mediumRadius = (int) Math.sqrt(smallRadius * largeRadius);
 g.setColor(Color.GREEN);
g.fillArc(xCenter-(mediumRadius)/2,yCenter-(mediumRadius)/2 + largeRadius/4 -height/4,mediumRadius,mediumRadius,0,180);


 g.setColor(Color.MAGENTA);
g.fillArc(xCenter-(smallRadius)/2,yCenter-(smallRadius)/2 + largeRadius/4 -height/4,smallRadius,smallRadius,0,180);

 int skyRadius = (int)((2 * Math.sqrt(smallRadius * largeRadius)) - width/4);
 
 g.setColor(skyColor);
 g.fillArc(xCenter-(skyRadius)/2,yCenter-(skyRadius)/2+largeRadius/4 - height/4,skyRadius,skyRadius,0,180);

  }

  public static void main(String[] args)
  {
    JFrame w = new JFrame("Rainbow");
    w.setBounds(300, 300, 300, 200);
    w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container c = w.getContentPane();
    c.add(new Rainbow());
    w.setVisible(true);
  }
}
