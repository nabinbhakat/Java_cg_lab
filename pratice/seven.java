import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public class seven {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Draw Line and Transform");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 800);

            JPanel panel = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    int centerX = 200;
                    int centerY = 200;
                    int r = 50;

                    // Draw a circle using Midpoint Circle algorithm
                    ArrayList<Point> circlePoints = new ArrayList<>();
                    int x = r;
                    int y = 0;
                    int err = 0;

                    while (x >= y) {
                        for (int i = -x; i <= x; i++) {
                            circlePoints.add(new Point(centerX + i, centerY + y));
                            circlePoints.add(new Point(centerX + i, centerY - y));
                        }
                        for (int i = -y; i < y; i++) {
                            circlePoints.add(new Point(centerX + i, centerY + x));
                            circlePoints.add(new Point(centerX + i, centerY - x));
                        }
                        y += 1;
                        if (err > 0) {
                            x -= 1;
                        }
                        err += 2 * y + 1;
                    }

                    // Translate circle points
                    ArrayList<Point> translatedPoints = new ArrayList<>();
                    for (Point p : circlePoints) {
                        translatedPoints.add(new Point(p.x + 50, p.y - 50));
                    }

                    // Rotate translated points
                    ArrayList<Point> rotatedPoints = new ArrayList<>();
                    int rotationCenterX = translatedPoints.get(0).x;
                    int rotationCenterY = translatedPoints.get(0).y;
                    for (Point p : translatedPoints) {
                        int dx = p.x - rotationCenterX;
                        int dy = p.y - rotationCenterY;
                        double theta = Math.toRadians(30);
                        int xp = (int) (dx * Math.cos(theta) - dy * Math.sin(theta)) + rotationCenterX;
                        int yp = (int) (dx * Math.sin(theta) + dy * Math.cos(theta)) + rotationCenterY;
                        rotatedPoints.add(new Point(xp, yp));
                    }

                    // Draw circle, translated circle, and rotated circle
                    for (Point p : circlePoints) {
                        g.drawLine(p.x, p.y, p.x, p.y);
                    }
                    // for (Point p : translatedPoints) {
                    //     g.drawLine(p.x, p.y, p.x, p.y);
                    // }
                    for (Point p : rotatedPoints) {
                        g.drawLine(p.x, p.y, p.x, p.y);
                    }
                }
            };
            frame.add(panel);
            frame.setVisible(true);
        });
    }
}