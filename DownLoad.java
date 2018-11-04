import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class DownLoad {
    public static void main(String[] args) throws IOException {
        System.out.println("复制开始");
        //软件下载链接
        URL u=new URL("http://cdn4.mydown.com/5bdeab6e/fc3fb296c743a1aef1c4c61a83247778/newsoft/W.P.S.7520.12012.0.exe");

        //此时起点来自网络
        InputStream in=u.openStream();
        OutputStream out=new FileOutputStream("d:/wps.exe");
        int n;
        byte[] b=new byte[1024];
        while((n=in.read(b))!=-1){
            out.write(b,0,n);
        }

        out.close();
        in.close();
        System.out.println("over");
        System.out.println("复制结束");
    }
}

