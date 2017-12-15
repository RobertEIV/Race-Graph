import java.util.Arrays;
import java.util.Random;

public class WordProfile{

    /**
     * WordProfile takes a Word, a char (either L, A, W, or B) and
     * an array of scores(double)for the four races.
     */
    double closestScore;
    double[] scores;
    char race;
    String word;
    float hue;

    protected double a;
    protected double b;
    protected double l;
    protected double wh;
    protected int ranka = 4;
    protected int rankb = 4;
    protected int rankl = 4;
    protected int rankw = 4;
    
    
    public WordProfile(Word w) {

        this.word = w.getWord();
        this.scores = w.getScores();
        a = w.scores[0];
        b = w.scores[1];
        l = w.scores[2];
        wh = w.scores[3];
        
        randomHue();
        rankScores();
    }
    /**
     * rankScores ranks each of the scores from 0-3, 0 being the lowest 
     * score and 3 the highest and stores them in the variables
     * ranka, rankb, rankl, rankw 
     */ 
    
    private void rankScores(){
        Arrays.sort(scores);
    
        for (int i = 0; i<4 ; i++){
            double s = scores[i];
            if ((Double.compare(s,a) == 0) && (ranka== 4)){
                ranka = i;
            }else if ((Double.compare(s,b) == 0) && (rankb== 4)){
                rankb = i;
            }else if ((Double.compare(s,l) == 0) && (rankl== 4)){
                rankl = i;
            }
            else if ((Double.compare(s,wh) == 0) && (rankw== 4)){
                rankw = i;}
        }
    }
               
    /**
     * randomHue generates a random float from 0 to 360 stored in hue
     * This will be used to generate a random hue to be used
     * in getHSV that returns a color
     */

    public void randomHue() {
        Random rand = new Random();
        float h = rand.nextFloat()*361;
        this.hue = h;
    }
    
}
