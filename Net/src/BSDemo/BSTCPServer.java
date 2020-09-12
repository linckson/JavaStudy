package BSDemo;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * BS版的TCP服务器,此时浏览器就是客户端
 * 浏览器输入 localhost:8080/Net/web/index.html
 */
public class BSTCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket myServer = new ServerSocket(8080);
        Socket mySocket = myServer.accept();
        //利用socket对象获取网络字节输入流,读取请求信息
        InputStream mySocketIS = mySocket.getInputStream();

        //2.读返回信息的第一行，获取地址
        //2.1 把mySocket获取到的网络字节输入流转为字符缓冲流，从而读到第一行
        BufferedReader bufReader = new BufferedReader(new InputStreamReader(mySocketIS));
        String firstLine = bufReader.readLine(); //第一行 GET /Net/web/index.html HTTP/1.1
        //2.2 获取地址
        String[] split = firstLine.split(" ");//去空格 /Net/web/index.html
        String htmlPath = split[1].substring(1);//去反斜杠 Net/web/index.html
        System.out.println(htmlPath);

        //构造本地字节输入流，传入htmlPath
        FileInputStream htmlFIS = new FileInputStream(htmlPath);

        //socket对象获取网络字节输出流
        OutputStream out = mySocket.getOutputStream();
        int len = 0;
        byte[] buf = new byte[1024];

        // 写入HTTP协议响应头,固定写法
        out.write("HTTP/1.1 200 OK\r\n".getBytes());
        out.write("Content-Type:text/html\r\n".getBytes());
        // 必须要写入空行,否则浏览器不解析
        out.write("\r\n".getBytes());

        //将服务器读取到的html文件写回客户端

        while((len = htmlFIS.read(buf)) != -1){
            out.write(buf,0,len);
            System.out.println(new String(buf,0,len));
        }


        //释放        htmlFIS.close();
        out.close();
        bufReader.close();
        //mySocketIS.close();
        mySocket.close();
        myServer.close();
    }
}
