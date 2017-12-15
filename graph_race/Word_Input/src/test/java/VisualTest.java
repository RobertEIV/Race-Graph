/*
 *VisualTest tests the visualizations in ColorScale 
 */
import org.deeplearning4j.models.embeddings.loader.WordVectorSerializer;
import org.deeplearning4j.models.word2vec.Word2Vec;
import org.junit.Test;
import java.io.File;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.util.Iterator;
import java.applet.*;
import static java.awt.Color.*;
import java.awt.event.*;

public class VisualTest extends ColorScale{
    
    
    @Test
    public void testVis(){

        Word wd = new Word("hello",0.92, 0.95, 0.94, 0.93);
        //wordCreator wc = new wordCreator();
        //String s = "college";
        //Word w = wc.makeWord(s);
        WordProfile profile = new WordProfile(wd);
        ColorScale test = new ColorScale(profile);
       // test.init();
        //test.paint();
    }
}
