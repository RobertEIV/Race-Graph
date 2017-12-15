
/**
 * Write a description of class wordCreator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class wordCreator
{
    double Ascore,Bscore,Lscore,Wscore;
    WordSim sim = new WordSim();
    public Word makeWord(String s){
        Lscore = sim.cosSimL(s);
        Wscore = sim.cosSimW(s);
        Bscore = sim.cosSimB(s);
        Ascore = sim.cosSimA(s);
        Word word = new Word(s,Ascore,Bscore,Lscore,Wscore);
        
        double[] scores = new double[4];
        scores[0] = Ascore;
        scores[1] = Bscore;
        scores[2] = Lscore;
        scores[3] = Wscore;
        
        word.setScores(scores);
        return word;
    }

    
}
