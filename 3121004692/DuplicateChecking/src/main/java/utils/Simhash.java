package utils;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.List;
/**
 * Created with IntelliJ IDEA.
 *
 * @Author: gpp
 * @Date: 2023/09/14/20:55
 * @Description:
 */
public class Simhash {
    public static String getSimHash(String date){
        //用数组表示特征向量,取128位,从 0 1 2 位开始表示从高位到低位
        int[] arr = new int[128];
        List<String> Ikstring = ikF.getString(date, false);
        int size = Ikstring.size();
        int i=0;
        for (String s : Ikstring) {
            //获取hash值
            String hash = getHash(s);
            if(hash.length()<128){
                int num=128-hash.length();
                for(int j=0;j<num;j++){
                    hash+="0";
                }
            }
            //加权合并
            for(int j=0;j<arr.length;j++){
                if(hash.charAt(j)=='1'){
                    //权重分10级，由词频从高到低，取权重10~0
                    arr[j] += (10 - (i / (size / 10)));
                }else{
                    arr[j] -= (10 - (i / (size / 10)));
                }
            }
            i++;
        }
        //降维
        StringBuilder sb=new StringBuilder();
        for(int j=0;j<arr.length;j++){
            if(arr[j]<=0){
                sb.append("0");
            }else{
                sb.append("1");
            }
        }
        return sb.toString();
    }

    public static String getHash(String str) {
        try {
            //使用MD5获得hash值
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            return new BigInteger(1, messageDigest.digest(str.getBytes("UTF-8"))).toString(2);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
