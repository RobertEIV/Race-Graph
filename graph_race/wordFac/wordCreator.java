
/**
 * Write a description of class wordCreator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class wordCreator extends wordFactory
{
    double Lscore,Wscore,Bscore,Ascore;
    WordSim sim = new WordSim();
    public Word makeWord(String s){
        Lscore = sim.cosSimL(s);
        Wscore = sim.cosSimW(s);
        Bscore = sim.cosSimW(s);
        Ascore = sim.cosSimW(s);
        Word word = new Word(s,Lscore,Wscore,Bscore,Ascore);
        
        double[] scores = new double[3];
        scores[0] = Ascore;
        scores[1] = Bscore;
        scores[2] = Lscore;
        scores[3] = Wscore;
        
        word.setScores(scores);
        
    }
    

    
}
