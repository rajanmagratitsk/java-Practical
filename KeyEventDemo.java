import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyEventDemo extends JPanel {
    private String keyInfo = "Press any key";
    private StringBuilder typedText = new StringBuilder();
    
    public KeyEventDemo() {
        setFocusable(true);
        setPreferredSize(new Dimension(500, 300));
        setBackground(Color.WHITE);
        
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                keyInfo = String.format("Key Pressed: %s (code: %d)", 
                                       KeyEvent.getKeyText(e.getKeyCode()), 
                                       e.getKeyCode());
                
                // Check for modifier keys
                if (e.isShiftDown()) keyInfo += " + Shift";
                if (e.isControlDown()) keyInfo += " + Ctrl";
                if (e.isAltDown()) keyInfo += " + Alt";
                
                // Handle special keys
                switch(e.getKeyCode()) {
                    case KeyEvent.VK_ENTER:
                        keyInfo += " [ENTER]";
                        break;
                    case KeyEvent.VK_SPACE:
                        keyInfo += " [SPACE]";
                        break;
                    case KeyEvent.VK_ESCAPE:
                        keyInfo += " [ESCAPE]";
                        break;
                    case KeyEvent.VK_F1:
                        keyInfo += " [F1 HELP]";
                        break;
                }
                repaint();
            }
            
            @Override
            public void keyReleased(KeyEvent e) {
                keyInfo = "Key Released: " + KeyEvent.getKeyText(e.getKeyCode());
                repaint();
            }
            
            @Override
            public void keyTyped(KeyEvent e) {
                char keyChar = e.getKeyChar();
                typedText.append(keyChar);
                keyInfo = String.format("Key Typed: '%c' (unicode: %d)", keyChar, (int)keyChar);
                repaint();
            }
        });
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString(keyInfo, 20, 50);
        g.drawString("Typed text: " + typedText.toString(), 20, 80);
        g.drawString("Hold Shift/Ctrl/Alt for modifier keys", 20, 120);
        g.drawString("Try: F1, Enter, Escape, Space", 20, 150);
    }
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Key Events Demo");
        KeyEventDemo demo = new KeyEventDemo();
        frame.add(demo);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        demo.requestFocusInWindow(); // Request focus for key events
    }
}