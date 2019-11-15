/**
 * Created by zhangs on 3/19/2019.
 */
import java.awt.Canvas;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JFrame;

public class testpoly extends Canvas {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Drawing");
        Canvas canvas = new testpoly();
        canvas.setSize(400, 400);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);


    }

    testpoly() {
        num = 100;
        manycircles = new circle[num];
        manyshapes=new shape[num];
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            //manycircles[i] = new circle(r.nextInt(100), r.nextInt(100), r.nextInt(20));
            if (i%2==0)
                manyshapes[i] = new circle(r.nextInt(100), r.nextInt(100), r.nextInt(20));
            else
                manyshapes[i] = new rect(r.nextInt(100), r.nextInt(100), r.nextInt(20), r.nextInt(30));

        }
    }

    int num;
    circle manycircles[];
    shape manyshapes[];

    public void paint(Graphics g) {

        g.fillOval(100, 100, 400, 200);
        g.fillRect(200, 200, 500, 400);
        for (int i = 0; i < 100; i++) {
            //manycircles[i].drawme(g);
            manyshapes[i].drawme(g);
        }

    }
}
    class shape {
        public void drawme(Graphics g) {

        }
    }

    class circle extends shape {
        int cx, cy, radius;

        circle(int cx, int cy, int radius) {
            this.cx = cx;
            this.cy = cy;
            this.radius = radius;
        }

        public void drawme(Graphics g) {
            g.fillOval(cx - radius, cy - radius, 2 * radius, 2 * radius);

        }

    }



class rect extends shape {
    int cx, cy, height, width;

    rect(int cx, int cy, int width, int height) {
        this.cx = cx;
        this.cy = cy;
        this.width = width;
        this.height = height;
    }

    public void drawme(Graphics g) {
        g.fillRect(cx, cy, width, height);

    }


}