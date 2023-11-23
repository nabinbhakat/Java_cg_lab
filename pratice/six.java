//  Draw a circle using Midpoint method via
// drawMidpointCircle(int r, Graphics g) in java

import java.awt.*;
import javax.swing.*;

public class six {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Draw Circle");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 400);

            JPanel panel = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    int r = 50;
                    int centerX = 200;
                    int centerY = 200;
                    drawMidpointCircle(r, centerX, centerY, g);
                }
            };

            frame.add(panel);
            frame.setVisible(true);
        });
    }

    public static void drawMidpointCircle(int r, int centerX, int centerY, Graphics g) {
        int x = r;
        int y = 0;
        int err = 0;

        while (x >= y) {
            g.drawLine(centerX + x, centerY + y, centerX + x, centerY + y);
            g.drawLine(centerX + y, centerY + x, centerX + y, centerY + x);
            g.drawLine(centerX - y, centerY + x, centerX - y, centerY + x);
            g.drawLine(centerX - x, centerY + y, centerX - x, centerY + y);
            g.drawLine(centerX - x, centerY - y, centerX - x, centerY - y);
            g.drawLine(centerX - y, centerY - x, centerX - y, centerY - x);
            g.drawLine(centerX + y, centerY - x, centerX + y, centerY - x);
            g.drawLine(centerX + x, centerY - y, centerX + x, centerY - y);

            if (err <= 0) {
                y += 1;
                err += 2 * y + 1;
            }

            if (err > 0) {
                x -= 1;
                err -= 2 * x + 1;
            }
        }
    }
}