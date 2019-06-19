package ru.jh0n.javastart.lesson6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    private final String SERVER_ADDR="localhost";
    private final int SERVER_PORT = 5080;
    private Socket socket;
    private DataInputStream inpMessage;
    private DataOutputStream outMessage;

    public Client() throws IOException {
        try {
            openConnection();
        } catch (IOException e) {
            e.printStackTrace();
        }
        while (true) {
            sendMessage();
        }
        //closeConnection();
    }

    private void openConnection() throws IOException {
        socket = new Socket(SERVER_ADDR, SERVER_PORT);
        inpMessage = new DataInputStream(socket.getInputStream());
        outMessage = new DataOutputStream(socket.getOutputStream());
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    String strFromServer = null;
                    try {
                        strFromServer = inpMessage.readUTF();
                        if (strFromServer.equals("/end")) {
                            closeConnection();
                            break;
                        }

                        System.out.println("Сообщение от сервера: " + strFromServer);

                    } catch (IOException e) {
                        e.printStackTrace();
                    }


                }
            }
        }).start();
    }
    private void closeConnection() {
        try {
            inpMessage.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            outMessage.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    private void sendMessage() {
        Scanner input = new Scanner(System.in);
        String message;
        System.out.println("Введите собщение:");
        message = input.next();
        try {
            outMessage.writeUTF(message);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Ошибка отправки сообщения");
        }

    }

    public static void main(String[] args) {
        try {
            new Client();
        } catch (IOException e) {
            e.printStackTrace();
        }




    }

}
