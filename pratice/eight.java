import java.awt.*;
import javax.swing.*;

public class eight {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                drawBezier(50, 50, 300, 50, 300, 300, g);
            }
        };

        frame.add(panel);
        frame.setVisible(true);
    }

    public static void drawBezier(int x1, int y1, int x2, int y2, int x3, int y3, Graphics g) {
        int startX = x1;
        int startY = y1;
        for (double t = 0.0; t <= 1.0; t += 0.01) {
            int x = (int) (Math.pow(1 - t, 2) * x1 + 2 * t * (1 - t) * x2 + Math.pow(t, 2) * x3);
            int y = (int) (Math.pow(1 - t, 2) * y1 + 2 * t * (1 - t) * y2 + Math.pow(t, 2) * y3);
            g.drawLine(startX, startY, x, y);
            startX = x;
            startY = y;
        }
    }
}