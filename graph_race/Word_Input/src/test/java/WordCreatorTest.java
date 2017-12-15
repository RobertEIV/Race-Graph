
import org.deeplearning4j.models.embeddings.loader.WordVectorSerializer;
import org.deeplearning4j.models.word2vec.Word2Vec;
import org.junit.Test;
import java.io.File;

public class WordCreatorTest extends wordCreator{

    @Test
    public void testMakeWord(){
        wordCreator wc = new wordCreator();
	String s = "college";
	Word w = wc.makeWord(s);
	System.out.println("scores for college: " + w.getScores());
    }

}
