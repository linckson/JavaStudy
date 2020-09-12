package TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 客户端向服务器端传消息
 */
public class TCPServer {
    public static void main(String[] args) throws IOException {
        //1.确认服务器端端口号
        ServerSocket myServer = new ServerSocket(6666);
        //2.服务器端接受客户端，返回socket对象
        Socket mySocket = myServer.accept();
        //5.利用socket对象获取输入流，读取信息
        System.out.println("接受数据中……");
        InputStream is = mySocket.getInputStream();
        byte[] buf = new byte[1024];
        int len = is.read(buf);
        String msg = new String(buf,0,len);
        System.out.println("收到的消息是："+msg);

        //6.服务器端收到信息后回复信息
        OutputStream mySocketOS = mySocket.getOutputStream();
        System.out.println("回复信息……");
        mySocketOS.write("nice to meet you".getBytes());

        //关闭资源
        is.close();
        mySocket.close();
    }
}
