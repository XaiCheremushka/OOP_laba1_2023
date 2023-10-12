package Lab5;
/* получение клиентом строки : MyClientSocket. java */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;

public class MyClientSocket {
    public static void main(String[] args) {
        Socket socket = null;
        InetAddress myIP = null;

        try {// получение строки клиентом
            myIP = InetAddress.getLocalHost();
            socket = new Socket( myIP, 8030);
            BufferedReader dis = new BufferedReader(new InputStreamReader(
                    socket.getInputStream()));
            String msg;
            while ((msg = dis.readLine()) != null) {
                System.out.println(msg);
            }
        } catch (IOException e) {
            System. out.println( " ошибка : " + e);
        }
    }
}
