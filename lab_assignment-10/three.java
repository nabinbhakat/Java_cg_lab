import java.awt.*;
import javax.swing.*;

public class three {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("DDA Line Drawing Algorithm");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(800, 600);
                frame.setLocationRelativeTo(null);

                JPanel panel = new JPanel() {
                    protected void paintComponent(Graphics g) {
                        super.paintComponent(g);
                        drawDDALine(50, 100, 200, 200, g);
                    }
                };

                frame.add(panel);
                frame.setVisible(true);
            }
        });
    }

    public static void drawDDALine(int x1, int y1, int x2, int y2, Graphics g) {
        int dx = Math.abs(x2 - x1);
        int dy = Math.abs(y2 - y1);
        int steps = Math.max(dx, dy);

        float xIncrement = (x2 - x1) / (float) steps;
        float yIncrement = (y2 - y1) / (float) steps;

        float x = x1;
        float y = y1;

        for (int i = 0; i <= steps; i++) {
            g.drawRect((int) x, (int) y, 0, 0);
            x += xIncrement;
            y += yIncrement;
        }
    }
}