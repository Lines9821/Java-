import java.io.*;
public class StatisticText {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("D://a.txt"));//输入文件名
        StringBuilder sb = new StringBuilder();
        while(true){
            String line = br.readLine();
            if(line==null){
                break;
            }
            sb.append(line);
        }
        br.close();
        String content = sb.toString();
        System.out.println("Character count is:"+(content.length()-content.replaceAll("[a-z||A-Z]","").length()));
        System.out.println("Number count is:"+(content.length()-content.replaceAll("[0-9]","").length()));
        System.out.println("HanZi count is:"+(content.length()-content.replaceAll("[\u4e00-\u9fa5]","").length()));
    }
}
