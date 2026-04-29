import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseEventDemo extends JPanel {
    private String message = "Move mouse here";
    private int mouseX, mouseY;
    
    public MouseEventDemo() {
        setPreferredSize(new Dimension(400, 300));
        setBackground(Color.LIGHT_GRAY);
        
        // MouseListener for click, press, release, enter, exit
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                message = String.format("Clicked at (%d, %d) - %d clicks", 
                                       e.getX(), e.getY(), e.getClickCount());
                if (e.getButton() == MouseEvent.BUTTON1)
                    message += " (Left button)";
                else if (e.getButton() == MouseEvent.BUTTON2)
                    message += " (Middle button)";
                else if (e.getButton() == MouseEvent.BUTTON3)
                    message += " (Right button)";
                repaint();
            }
            
            @Override
            public void mousePressed(MouseEvent e) {
                message = "Mouse pressed";
                repaint();
            }
            
            @Override
            public void mouseReleased(MouseEvent e) {
                message = "Mouse released";
                repaint();
            }
            
            @Override
            public void mouseEntered(MouseEvent e) {
                message = "Mouse entered the area";
                repaint();
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
                message = "Mouse exited the area";
                repaint();
            }
        });
        
        // MouseMotionListener for drag and move
        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                mouseX = e.getX();
                mouseY = e.getY();
                message = String.format("Mouse moving at (%d, %d)", mouseX, mouseY);
                repaint();
            }
            
            @Override
            public void mouseDragged(MouseEvent e) {
                message = String.format("Dragging at (%d, %d)", e.getX(), e.getY());
                repaint();
            }
        });
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString(message, 50, 50);
        g.drawString(String.format("Position: (%d, %d)", mouseX, mouseY), 50, 70);
    }
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Mouse Events Demo");
        frame.add(new MouseEventDemo());
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}