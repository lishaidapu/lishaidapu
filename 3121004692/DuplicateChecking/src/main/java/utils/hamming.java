package utils;
/**
 * Created with IntelliJ IDEA.
 *
 * @Author: gpp
 * @Date: 2023/09/14/20:55
 * @Description:
 */
public class hamming {
    public static int getHammingDis(String simHash1,String simHash2){
        int result=0;
        if(simHash1.length()!=simHash2.length()){
            result=-1;
        }else {
            for (int i = 0; i < simHash1.length(); i++) {
                //每一位进行比较
                if (simHash1.charAt(i) != simHash2.charAt(i)) {
                    result++;
                }
            }
        }
        return result;
    }
    public static double getSimilarity(String simHash1, String simHash2) {
        //通过 simHash1 和 simHash2 获得它们的海明距离
        float distance = getHammingDis(simHash1, simHash2);
        String  str = String.format("%.2f",distance);
        //通过海明距离计算出相似度，并返回
        return  (100.0 - Double.parseDouble(str) * 100.0 / 128.0);
    }
}
