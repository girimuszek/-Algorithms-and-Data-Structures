import javax.swing.*;
import java.awt.*;

public class Splat {
    public static void SplatTest() {
        // Prompt the user for circle properties
        int diameter = Integer.parseInt(JOptionPane.showInputDialog("Enter the diameter of the circle:"));

        int r = Integer.parseInt(JOptionPane.showInputDialog("Enter the red value (0-255) for the circle color:"));
        int g = Integer.parseInt(JOptionPane.showInputDialog("Enter the green value (0-255) for the circle color:"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Enter the blue value (0-255) for the circle color:"));
        Color color = new Color(r, g, b);

        int x = Integer.parseInt(JOptionPane.showInputDialog("Enter the x-coordinate of the circle:"));
        int y = Integer.parseInt(JOptionPane.showInputDialog("Enter the y-coordinate of the circle:"));

        // Create the frame and panel, passing user inputs to SplatPanel
        JFrame frame = new JFrame("Splat");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new SplatPanel(diameter, color, x, y));
        frame.pack();
        frame.setVisible(true);
    }
}
