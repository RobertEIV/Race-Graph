import org.deeplearning4j.models.embeddings.loader.WordVectorSerializer;
import org.deeplearning4j.models.word2vec.Word2Vec;

import java.io.File;

public class WordSim {

    File gModel = new File("src/main/resources/text8-vector.bin");
    Word2Vec vec = WordVectorSerializer.readWord2VecModel(gModel);

    String l = "latino";
    String w = "white";
    String b = "black";
    String a = "asian";

    public double cosSimW(String s){
        double vecScoreW = vec.similarity(s, w);
        return vecScoreW;
    }

    public double cosSimB(String s){
        double vecScoreB = vec.similarity(s, b);
        return vecScoreB;
    }

    public double cosSimL(String s){
        double vecScoreL = vec.similarity(s, l);
        return vecScoreL;
    }

    public double cosSimA(String s){
       double vecScoreA = vec.similarity(s, a);
        return vecScoreA;
    }

    //public void WordSim(String s){
    //    double cosSimA = vec.similarity(s, a);
    //    double cosSimL = vec.similarity(s, l);
    //    double cosSimB = vec.similarity(s, b);
    //    double cosSimW = vec.similarity(s, w);
        //return vecScoreL, vecScoreA;
    //}

    //public void main(String a, String b) {
    //    vec.similarity(a, b);
    //}
}
