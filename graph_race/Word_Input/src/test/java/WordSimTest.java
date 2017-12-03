import org.deeplearning4j.models.embeddings.loader.WordVectorSerializer;
import org.deeplearning4j.models.word2vec.Word2Vec;
import org.junit.Test;
import java.io.File;

public class WordSimTest extends WordSim {

    String s = "college";

    @Test
    public void testWord() {
        System.out.println("A: " + cosSimA(s) +
                            "| B: " + cosSimB(s) +
                            "| L: " + cosSimL(s) +
                            "| W: " + cosSimW(s));

    }

}
