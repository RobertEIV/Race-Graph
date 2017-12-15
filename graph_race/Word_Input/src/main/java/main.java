import java.util.Scanner;
import javax.swing.*;
import java.awt.*;

public class main{


    public static void main(String[] args){

        Scanner user_input = new Scanner(System.in);
        String word;
        System.out.print("Enter your word: ");
        word = user_input.next();

        //Word wd = new Word(word,0.92, 0.95, 0.94, 0.93);
        wordCreator wc = new wordCreator();
        Word w = wc.makeWord(word);
        WordProfile profile = new WordProfile(w);
        JFrame frame = new JFrame();
        ColorScale s = new ColorScale(profile);

        s.init();

        //s.paint();

        frame.setContentPane(s);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 500);
        frame.setVisible(true);
    }

}