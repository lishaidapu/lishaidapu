package utils;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: gpp
 * @Date: 2023/09/15/10:55
 */
public class FileTest {
    @Test
    public  void TestreadFile(){
        String fileName="F:\\jtest\\gpp.txt";
        String s = Fileu.readFile(fileName);
        System.out.println(s);

    }

    @Test
    public  void TestwriteFile(){
        String fileName="F:\\jtest\\gpp.txt";
        String date="测试成功！";
        Fileu.writeFile(fileName,date);
    }

    @Test
    public  void TestreadFileEcp(){
        String fileName="F:\\jtest\\sys.log";
        Fileu.readFile(fileName);
    }

    @Test
    public  void TestwriteFileEcp(){
        String fileName="F:\\jtest\\sys.log";
        String date="测试成功！";
        Fileu.writeFile(fileName,date);
    }
}
