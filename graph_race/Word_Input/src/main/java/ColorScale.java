/*
 * ColorScale creates a visualization with circles of a word's scores 
 * using color intensity
 * The race score with the highest value gets the most intense color circle
 */
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.util.Iterator;
import java.applet.*;
import static java.awt.Color.*;
import java.awt.event.*;

public class ColorScale extends JApplet {
    
    WordProfile profile;

    ArrayList<Circle> circles;
    Circle circlea;
    Circle circleb;
    Circle circlel;
    Circle circlew;
    Image offimage;
    Graphics offg;

    protected static final int RADIUS = 30;
    protected static final int CENTERY = 100;
    protected static final int CENTERXA = 150;
    protected static final int CENTERXB = 250;
    protected static final int CENTERXL = 350;
    protected static final int CENTERXW = 450;
    protected static final int CENTERYLABEL = 50;
    protected static final int WORDX = 10;
    protected static final int WORDY = CENTERY;
    
    // ColorScale constructor stores the WordProfile to use for visualizations
    public ColorScale(WordProfile profile){
        this.profile = profile;
    }

    /**
     * setColor takes in a rank (int from 0 to 3) and
     * returns a color of a specific intensity based on the rank
     */
    public Color setColor(int rank) {

        float hue = profile.hue;
        Color color;

        /**
         * set saturation to be the float(0.25, 0.5, 0.75 or 1.0) based on rank
         * set hue to be random hue from WordProfile set value to be 1.0
         */
        switch (rank) {
            case 0:
                color = getHSBColor(hue, (float) 0.1, (float) 1.0);
                break;
            case 1:
                color = getHSBColor(hue, (float) 0.4, (float) 1.0);
                break;
            case 2:
                color = getHSBColor(hue, (float) 0.7, (float) 1.0);
                break;
            case 3:
                color = getHSBColor(hue, (float) 1.0, (float) 1.0);
                break;
            default:
                color = Color.WHITE;
        }
        return color;
    }
    
    /**
     * Circle class stores the color, x and y coordinates, and the radius
     * of the circle to be drawn
     */

    class Circle {

        Color color;
        int centerX, centerY;
        int radius;

        Circle(Color c, int centerx, int centery) {
            color = c;
            centerX = centerx;
            centerY = centery;
            radius = RADIUS;
        }
    }

    public void init() {
        setSize(700, 500);
        double a = profile.a;
        double b = profile.b;
        double l = profile.l;
        double wh = profile.wh;
        int ranka = profile.ranka;
        int rankb = profile.rankb;
        int rankl = profile.rankl;
        int rankw = profile.rankw;
        
        /**
         * The for loop creates new Circles for each race
         * based off of the scores and rank
         */
        circles = new ArrayList<Circle>();
        for (double s : profile.scores) {

            if (s == a) {
                Color color = setColor(ranka);
                circlea = new Circle(color, CENTERXA, CENTERY);
                circles.add(circlea);
            }
            if (s == b) {
                Color color = setColor(rankb);
                circleb = new Circle(color, CENTERXB, CENTERY);
                circles.add(circleb);
            }
            if (s == l) {
                Color color = setColor(rankl);
                circlel = new Circle(color, CENTERXL, CENTERY);
                circles.add(circlel);
            }
            if (s == wh) {
                Color color = setColor(rankw);
                circlew = new Circle(color, CENTERXW, CENTERY);
                circles.add(circlew);
            }
        }
        //this.paint(g);
    }

    //paint draws the actual visualization onto the applet

    public void paint(Graphics g) {

        if (offimage == null) {
            offimage = createImage(getWidth(), getHeight());
            offg = offimage.getGraphics();

        }
        Graphics2D g2D = (Graphics2D) offg;
        for (Circle c : circles) {

            g2D.setColor(c.color);

            g2D.fillOval(c.centerX - c.radius, c.centerY - c.radius, 
                    2 * c.radius, 2 * c.radius);

        }

        g.drawImage(offimage, 0, 0, this);
        g.drawString(profile.word, WORDX, WORDY);
        g.drawString("Asian", CENTERXA, CENTERYLABEL);
        g.drawString("Black", CENTERXB, CENTERYLABEL);
        g.drawString("Latino", CENTERXL, CENTERYLABEL);
        g.drawString("White", CENTERXW, CENTERYLABEL);  
        g.drawString(String.valueOf(profile.a), CENTERXA, CENTERYLABEL+200);
        g.drawString(String.valueOf(profile.b), CENTERXB, CENTERYLABEL+250);
        g.drawString(String.valueOf(profile.l), CENTERXL, CENTERYLABEL+300);
        g.drawString(String.valueOf(profile.wh), CENTERXW, CENTERYLABEL+350);
    }
     //Graphics g = getGraphics();

//    public static void main(String[] args){
//
//        Scanner user_input = new Scanner(System.in);
//        String word;
//        System.out.print("Enter your word: ");
//        word = user_input.next();
//
//        //Word wd = new Word(word,0.92, 0.95, 0.94, 0.93);
//        wordCreator wc = new wordCreator();
//        Word w = wc.makeWord(word);
//        WordProfile profile = new WordProfile(w);
//        JFrame frame = new JFrame();
//        ColorScale s = new ColorScale(profile);
//
//        s.init();
//
//        //s.paint();
//
//        frame.setContentPane(s);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(600, 400);
//        frame.setVisible(true);
//    }

}
