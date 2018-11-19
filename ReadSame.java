import java.io.*;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;


public class ReadSame {
    public static void main(String[] args) throws Exception{
        Reader in1 = new FileReader("d://1.txt");
        Reader in2 = new FileReader("d://2.txt");
        BufferedReader br1 = new BufferedReader(in1);
        BufferedReader br2 = new BufferedReader(in2);
        Writer out = new FileWriter("d://3.txt");
        BufferedWriter bw = new BufferedWriter(out);
        Collection c1 = new HashSet();  //无重复
        Collection c2 = new HashSet();
        StringBuilder sb1 = new StringBuilder("");
        StringBuilder sb2 = new StringBuilder("");
        String line;
        while((line=br1.readLine())!=null){
            sb1.append(line);
        }
        while((line=br2.readLine())!=null){
            sb2.append(line);
        }
        String[] str1 = sb1.toString().split("[^a-z||A-Z]+");  //^取反
        String[] str2 = sb2.toString().split("[^a-z||A-Z]+");  //^取反
        for(String string:str1){

            c1.add(string);
        }
        for(String string:str2){
            c2.add(string);
        }
        System.out.println(c1);
        System.out.println(c2);
        c1.retainAll(c2);
        System.out.println(c1);
        Iterator it = c1.iterator();
        while(it.hasNext()){
            String ss = (String) it.next();
            bw.write(ss);
            bw.newLine();
        }
        bw.close();
        br1.close();
        br2.close();
    }
}
