package MyFirst;

import java.io.*;
import java.net.*;

public class ChatTwoServer {

    public ChatTwoServer(int port, String name) throws IOException {
        ServerSocket server = new ServerSocket(8888);//创建seversocket对象，提供tcp连接服务。指定端口port，等待tcp连接。
        System.out.println("正在等待连接，请勿操作！");
        Socket client = server.accept();//创建socket对象，它等待接收客户端的连接。
        new ChatTwoClient(name, client);//实现图形界面。
        server.close();
    }

    public static void main(String[] args) throws IOException {
        new ChatTwoServer(8888, "傻逼");

    }

}

