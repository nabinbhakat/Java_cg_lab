import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Transformation {
    private class Canvas extends JPanel{
        int w;
        int h;
        ArrayList<Integer> xcoord=new ArrayList<>();
        ArrayList<Integer> ycoord=new ArrayList<>();
        Canvas(int w,int h){
            this.w=w;
            this.h=h;
        }
        private void plotPixel(int x,int y,Graphics g){
            g.fillRect(x+(w/2),(h/2)-y, 1, 1);
        }
        private void drawBresenhamLine(int x1,int y1,int x2,int y2,Graphics g){
            int dx=(x2-x1);
            int dy=y2-y1;
            int x=x1,y=y1;
            int p=2*dy-dx ;
            while(x<=x2 && y<=y2){
                xcoord.add(x);
                ycoord.add(y);
                plotPixel(x,y,g);
                if(p<0){
                    x=x+1;
                    p=p+2*dy;
                }
                else{
                    x=x+1;
                    y=y+1;
                    p=p+2*dy-2*dx;
                }
            }
        }
        private void translateLine(Graphics g){
            for(int i=0;i<xcoord.size();i++){
                plotPixel(xcoord.get(i)+50, ycoord.get(i)+50, g);
            }
        }
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
            drawBresenhamLine(1, 1, 100, 100, g);
            translateLine(g);
        }
    }
    Transformation(int w,int h){
        JFrame frame= new JFrame("Transformation of line");
        frame.setSize(w, h);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Canvas canvas=new Canvas(w, h);
        frame.add(canvas);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new Transformation(500, 500);
            }
        });
    }
}
