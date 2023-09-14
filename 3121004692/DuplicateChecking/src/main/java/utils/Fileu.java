package utils;

import org.example.FileEcp;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
/**
 * Created with IntelliJ IDEA.
 *
 * @Author: gpp
 * @Date: 2023/09/14/19:55
 * @Description:
 */
public class Fileu {
    public static String readFile(String fileName){
        //如果文件类型不是txt文件的话
        if(!fileName.endsWith(".txt")){
            FileEcp.handle();
        }
        StringBuilder s=new StringBuilder();
        try(BufferedReader br= Files.newBufferedReader(Paths.get(fileName))) {
            String line=null;
            while((line=br.readLine())!=null){
                s.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            return s.toString();
        }
    }

    //写入txt文件
    public static void writeFile(String fileName,String data){
        //判断文件类型是否匹配
        if (!fileName.endsWith(".txt")){
            FileEcp.handle();
        }

        try {
            File file=new File(fileName);
            file.createNewFile();
            try(FileWriter fileWriter=new FileWriter(file);
                BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);){
                bufferedWriter.write(data);
                bufferedWriter.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
