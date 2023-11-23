import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class five {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Bresenham's Circle Drawing");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 400);
            frame.add(new CirclePanel());
            frame.setVisible(true);
        });
    }
}

class CirclePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawBresenhamCircle(150, 150, 100, g);
    }

    private void drawBresenhamCircle(int centerX, int centerY, int radius, Graphics g) {
        int x = 0;
        int y = radius;
        int d = 3 - 2 * radius;

        while (x <= y) {
            plotCirclePoints(centerX, centerY, x, y, g);
            if (d <= 0) {
                d = d + 4 * x + 6;
            } else {
                d = d + 4 * (x - y) + 10;
                y--;
            }
            x++;
        }
    }

    private void plotCirclePoints(int centerX, int centerY, int x, int y, Graphics g) {
        int x0 = centerX;
        int y0 = centerY;
        g.fillRect(x0 + x, y0 + y, 1, 1);
        g.fillRect(x0 - x, y0 + y, 1, 1);
        g.fillRect(x0 + x, y0 - y, 1, 1);
        g.fillRect(x0 - x, y0 - y, 1, 1);
        g.fillRect(x0 + y, y0 + x, 1, 1);
        g.fillRect(x0 - y, y0 + x, 1, 1);
        g.fillRect(x0 + y, y0 - x, 1, 1);
        g.fillRect(x0 - y, y0 - x, 1, 1);
    }
}
