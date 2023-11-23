import java.awt.*;
import javax.swing.*;

public class two {
    private class two extends JPanel {
        int w, h;

        two(int w, int h) {
            this.w = w;
            this.h = h;
        }

        private void plotPixel(Graphics g, int x, int y) {
            g.fillRect(x + (w / 2), (h / 2) - y, 1, 1);
        }

        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            drawBresenhamCircle(50, g);
        }

        private void drawBresenhamCircle(int radius, Graphics g) {
            int x = radius - 1;
            int y = 0;
            int dx = 1;
            int dy = 1;
            int err = dx - (radius << 1);

            while (x >= y) {
                plotPixel(g, x, y);
                plotPixel(g, y, x);
                plotPixel(g, -x, y);
                plotPixel(g, -y, x);
                plotPixel(g, -x, -y);
                plotPixel(g, -y, -x);
                plotPixel(g, x, -y);
                plotPixel(g, y, -x);

                if (err <= 0) {
                    y++;
                    err += dy;
                    dy += 2;
                }

                if (err > 0) {
                    x--;
                    dx += 2;
                    err += dx - (radius << 1);
                }
            }
        }
    }

    two(int h, int w) {
        JFrame frm = new JFrame("Paint Demo");
        frm.setSize(w, h);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Canvas canvas = new Canvas(w, h);
        frm.add(canvas);
        frm.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new two(300, 300);
            }
        });
    }
}