package utils;
import org.junit.Test;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: gpp
 * @Date: 2023/09/15/15:55
 * @Description:
 */
public class ikFTest {
    @Test
    public void testIk(){
        String data="原神，启动";
        List<String> string = ikF.getString(data, false);
        System.out.println(string.toString());
    }
}
