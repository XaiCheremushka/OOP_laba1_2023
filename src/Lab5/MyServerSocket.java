package Lab5;

import java.io.*;
import java.net.*;
import java.util.Random;


public class MyServerSocket {
    public static void main(String[] args) throws Exception {
        Socket s = null;
        try { // посылка строки клиенту
            ServerSocket server = new ServerSocket(8030);
            s = server.accept();
            PrintStream ps = new PrintStream(s.getOutputStream());

            Random random = new Random();
            int randomNumber = random.nextInt(154) + 1;

            sonet(randomNumber, ps);
            ps.flush();
            s.close(); // разрыв соединения
        } catch (IOException e) {
            System. out.println( " ошибка : " + e);
        }

    }

    static void sonet(int number, PrintStream ps) {
        try {
            File file = new File("D:\\Projects\\Java\\OOP_laba1\\src\\Lab5\\Sonets.txt"); 
            FileInputStream fis = new FileInputStream(file);
            InputStreamReader isr = new InputStreamReader(fis, "UTF-8"); 
            BufferedReader br = new BufferedReader(isr);

            String line;
            int i = 0;
            boolean flag = false;
            while ((line = br.readLine()) != null) {
                if (line.contains("Сонет " + number + " "))
                    flag = true;

                if (flag) {
                    ps.println(line);
                    if (i<30)
                        i++;
                    else
                        break;
                }
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
