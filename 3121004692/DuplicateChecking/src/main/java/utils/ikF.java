package utils;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.analysis.tokenattributes.CharTermAttribute;
import org.wltea.analyzer.lucene.IKAnalyzer;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
/**
 * Created with IntelliJ IDEA.
 *
 * @Author: gpp
 * @Date: 2023/09/14/20:55
 */

public class ikF {
    public static List<String> getString(String data,boolean useSmart) {
        List<String> result=new ArrayList();
        try {
            //创建分词对象 true则按照最大长度划分，false则划分出所有可以划分的词
            Analyzer anal = new IKAnalyzer(useSmart);
            StringReader reader = new StringReader(data);
            //记录分词数据
            TokenStream ts = anal.tokenStream("", reader);
            CharTermAttribute term = ts.getAttribute(CharTermAttribute.class);
            //遍历分词数据
            ts.reset();
            while (ts.incrementToken()) {
                result.add(term.toString());
            }
            ts.close();
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            return result;
        }
    }
}
