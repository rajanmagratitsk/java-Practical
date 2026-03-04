import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class ColorMixer extends JFrame {

    JSlider redSlider, greenSlider, blueSlider;
    JPanel colorPanel;

    ColorMixer() {
        super("RGB Color Mixer");

        // Sliders for Red, Green, Blue
        redSlider = new JSlider(0, 255, 0);
        greenSlider = new JSlider(0, 255, 0);
        blueSlider = new JSlider(0, 255, 0);

        redSlider.setMajorTickSpacing(50);
        greenSlider.setMajorTickSpacing(50);
        blueSlider.setMajorTickSpacing(50);

        redSlider.setPaintTicks(true);
        greenSlider.setPaintTicks(true);
        blueSlider.setPaintTicks(true);

        redSlider.setPaintLabels(true);
        greenSlider.setPaintLabels(true);
        blueSlider.setPaintLabels(true);

        // Panel to show color
        colorPanel = new JPanel();
        colorPanel.setBackground(new Color(0, 0, 0));
        colorPanel.setBounds(20, 20, 350, 150);

        // Add change listeners
        ChangeListener listener = e -> updateColor();
        redSlider.addChangeListener(listener);
        greenSlider.addChangeListener(listener);
        blueSlider.addChangeListener(listener);

        // Layout setup
        setLayout(null);
        colorPanel.setBounds(20, 20, 350, 150);
        redSlider.setBounds(20, 190, 350, 50);
        greenSlider.setBounds(20, 250, 350, 50);
        blueSlider.setBounds(20, 310, 350, 50);

        add(colorPanel);
        add(redSlider);
        add(greenSlider);
        add(blueSlider);

        setSize(400, 420);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // Update panel color based on sliders
    void updateColor() {
        int r = redSlider.getValue();
        int g = greenSlider.getValue();
        int b = blueSlider.getValue();
        colorPanel.setBackground(new Color(r, g, b));
    }

    public static void main(String[] args) {
        new ColorMixer();
    }
}