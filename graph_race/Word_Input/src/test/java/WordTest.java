
import org.deeplearning4j.models.embeddings.loader.WordVectorSerializer;
import org.deeplearning4j.models.word2vec.Word2Vec;
import org.junit.Test;
import java.io.File;

public class WordTest extends Word{

    @Test
    public void testWordString(){
	wordCreator wc = new wordCreator();
	String s = "college";
	Word w = wc.makeWord(s);
	System.out.println("should print out college and prints out: " + w);
    }

    @Test
    public void testGetScores(){
	wordCreator wc = new wordCreator();
	String s = "college";
	Word w = wc.makeWord(s);
	System.out.println("should print out an array of four elements with scores: " + w.getScores());
    }

}
