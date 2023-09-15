import utils.Fileu;
import utils.Simhash;
import utils.hamming;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: gpp
 * @Date: 2023/09/14/20:55
 * @Description:
 */
public class App 
{
    public static void main(String[] args) {
        //读取参数
        String s1 = Fileu.readFile(args[0]);
        String s2 = Fileu.readFile(args[1]);
        //计算sim
        String simHash1 = Simhash.getSimHash(s1);
        String simHash2 = Simhash.getSimHash(s2);
        //获取相似度
        double similarity = hamming.getSimilarity(simHash1, simHash2);
        //打印
        String resultSimilarity = String.format("%.2f", similarity*100);
        String result =  args[0] + "与" + args[1] + "的相似度为：" + resultSimilarity + "\r\n";
        //把相似度写入最后的结果文件中
        Fileu.writeFile(args[2],result);
        System.out.println("相似度：" + resultSimilarity + "。 结果写入" + args[2] + "中。");
    }
}
