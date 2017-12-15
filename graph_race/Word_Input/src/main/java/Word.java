
/**
 * Write a description of class Word here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Word implements WordInterface
{
    
    public String word;
    double Ascore,Bscore,Lscore,Wscore;
    double[] scores;
    
    public Word(String word, double a, double b, double l, double w){
     this.word = word;
     Ascore=a; Bscore=b; Lscore =l; Wscore=w;   
     scores = new double[4];
    }

    public Word() {


    }
    
    public String getWord(){
        return word;
    }
    
    public void setScores(double[] s){
        this.scores = s;
    }
    
    public double[] getScores(){
        return scores;
        
    }
    
    public String toString(){
     return word;
    }
    
   
}
