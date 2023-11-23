import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.*;
import javax.swing.SwingUtilities;

public class BresenhamCircle {
    private class Canvas extends JPanel {
        // int x1,y1,x2,y2;
        // Canvas(int x1,int y1,int x2,int y2){
        //     this.x1=x1;
        //     this.x2=x2;
        //     this.y1=y1;
        //     this.y2=y2;
            // this.setBackground(Color.LIGHT_GRAY);
        // }
        int w,h;
        Canvas(int w,int h){
            this.w=w;
            this.h=h;
        }
        private void plotPixel(Graphics g,int x,int y){
            g.fillRect(x+(w/2), (h/2)-y, 1, 1);
        }
        private void drawBresenhamCircle(int x1,int y1,Graphics g){
            int x=x1,r=y1,y=y1;
            int p=3-2*r;
            while(x<=y){
                plotPixel(g,x,y);
                plotPixel(g, -x, y);
                plotPixel(g, -x, -y);
                plotPixel(g, x, -y);
                plotPixel(g,y,x);
                plotPixel(g,y,-x);
                plotPixel(g,-y,-x);
                plotPixel(g,-y,x);
                if(p<0){
                    x=x+1;
                    p=p+4*x+6;
                }
                else{
                    x=x+1;
                    y=y-1;
                    p=p+4*(x-y)+10;
                }
            
            }
        }
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
            drawBresenhamCircle(0,100, g);
            // g.drawLine(x1,y1,x2,y2);
        }
    }
    BresenhamCircle(int h, int w){
        JFrame frame=new JFrame("Paint Demo");
        // frame.setSize(300,300);
        frame.setSize(w,h);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Canvas canvas =new Canvas(100,100,200,150);
        Canvas canvas=new Canvas(w, h);
        frame.add(canvas);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new BresenhamCircle(500,500);
            }
        });
    }
}
