package TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) throws IOException {

        //2.确认客户端连接地址
        Socket client = new Socket("localhost",6666);
        //4.客户端获取输出流，发送消息
        OutputStream clientOS = client.getOutputStream();
        clientOS.write("hello".getBytes());//只能识别byte，利用方法getBytes()
        System.out.println("发送数据中……");

        //7.接收服务器端回复的信息
        InputStream clientIS = client.getInputStream();
        byte[] buf = new byte[1024];
        int len = clientIS.read(buf);
        String msg = new String(buf,0,len);
        System.out.println("收到回信:"+msg);

        //关闭资源
        clientOS.close();
        client.close();

    }
}
