import javax.swing.*;
import java.awt.*;

public class SplatPanel extends JPanel {
    private Circle circle1;

    public SplatPanel(int diameter, Color color, int x, int y) {
        // Initialize the circle with user-provided values
        circle1 = new Circle(diameter, color, x, y);
        setPreferredSize(new Dimension(300, 200));
        setBackground(Color.black);
    }

    //-----------------------------------------------------------------
    // Draws this panel by requesting that each circle draw itself.
    //-----------------------------------------------------------------
    public void paintComponent(Graphics page) {
        super.paintComponent(page);
        circle1.draw(page);
    }
}
