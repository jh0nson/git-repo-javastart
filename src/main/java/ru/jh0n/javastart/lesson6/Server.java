package ru.jh0n.javastart.lesson6;

import sun.awt.windows.ThemeReader;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    private Socket socket;
    private DataInputStream inpMessage;
    private DataOutputStream outMessage;


    public Server ()  {
        try {
            startServer();

            while (true){
                sendMessage();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void startServer () throws IOException {
        //Socket socket = null;
        ServerSocket serverSocket = new ServerSocket(5080);
        System.out.println("������ �������");
        socket = serverSocket.accept();
        System.out.println("������ �����������");
        inpMessage = new DataInputStream(socket.getInputStream());

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    String str = null;

                    try {
                        str = inpMessage.readUTF ();

                        System.out.println("������ ������: " + str);
                        if (str.equals("/end")) {
                        break;
                        }
                    //outMessage.writeUTF("echo:"+str);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start ();
    }




    private void sendMessage() throws IOException {
        DataOutputStream outMessage = new DataOutputStream(socket.getOutputStream());
        Scanner input = new Scanner(System.in);
        String message;
        System.out.println("������� ��������:");
        message = input.next();
        try {
            outMessage.writeUTF(message);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("������ �������� ���������");
        }

    }

    public static void main(String[] args) {
        new Server();


    }
}
