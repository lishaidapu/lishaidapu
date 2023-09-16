package utils;

import org.junit.Test;

public class SimhashTest {
    @Test
    public void TestgetSimHash(){
        String s = Fileu.readFile("F:\\JVAV\\DuplicateChecTxt\\orig.txt");
        String simHash = Simhash.getSimHash(s);
        System.out.println(simHash);
    }

    @Test
    public void TestgetHash(){
        String s = Fileu.readFile("F:\\JVAV\\DuplicateChecTxt\\orig.txt");
        String hash = Simhash.getHash(s);
        System.out.println(hash);
    }
}
