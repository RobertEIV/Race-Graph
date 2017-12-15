
/**
 * Write a description of class Word here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Word implements WordInterface
{
    
    private String word;
    double Lscore,Wscore,Bscore,Ascore;
    double[] scores;
    
    public Word(String word, double l, double w, double b, double a){
     this.word = word;
     Lscore =l; Wscore=w;Bscore=b;Ascore=a;   
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
