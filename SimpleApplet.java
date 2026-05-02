import java.applet.Applet;
import java.awt.Graphics;

/* <applet code="SimpleApplet.class" width=300 height=200></applet> */

public class SimpleApplet extends Applet {
    
    @Override
    public void paint(Graphics g) {
        g.drawString("Hello, Rajan! This is a Java Applet.", 50, 100);
    }
}
