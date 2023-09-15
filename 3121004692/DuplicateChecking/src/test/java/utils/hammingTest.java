package utils;

import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: gpp
 * @Date: 2023/09/15/15:55
 * @Description:
 */
public class hammingTest {
    @Test
    public void testgetSimilarity(){
        String s1 = Fileu.readFile("F:\\JVAV\\DuplicateChecTxt\\orig.txt");
        String s2 = Fileu.readFile("F:\\JVAV\\DuplicateChecTxt\\orig_0.8_add.txt");
        String simHash1 = Simhash.getSimHash(s1);
        String simHash2 = Simhash.getSimHash(s2);
        double similarity = hamming.getSimilarity(simHash1, simHash2);
        String  str = String.format("%.2f",similarity);
        System.out.println(str + "%");
    }

    @Test
    public void testgetHammingDis(){
        String s1 = Fileu.readFile("F:\\JVAV\\DuplicateChecTxt\\orig.txt");
        String s2 = Fileu.readFile("F:\\JVAV\\DuplicateChecTxt\\orig_0.8_add.txt");
        String simHash1 = Simhash.getSimHash(s1);
        String simHash2 = Simhash.getSimHash(s2);
        int hammingDis = hamming.getHammingDis(simHash1, simHash2);
        System.out.println(hammingDis);
    }
}








