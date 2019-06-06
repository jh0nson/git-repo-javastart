package ru.jh0n.javastart.lesson4;

import javafx.scene.paint.Color;

import javax.print.attribute.ResolutionSyntax;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javafx.scene.paint.Color.*;

class ChatCLient extends JFrame {
    public ChatCLient() {
        setTitle("Chat");
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);
        setBounds(300,100,600,400);
        final JTextArea chatText = new JTextArea();
        JButton sendButton = new JButton("Send");
        final JTextField sendText = new JTextField();
        JScrollPane scrollChat = new JScrollPane(chatText);
        chatText.setFocusable(false);
        chatText.setEditable(false);
        chatText.setBounds(1,1,598,300);
        sendText.setBounds(2,320,498,30);
        sendButton.setBounds(502,320,80,30);


        add(chatText);
        add(sendText);
        add(sendButton);
        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                chatText.append(sendText.getText()+"\n");
                sendText.setText("");

            }
        });
        sendText.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                chatText.append(sendText.getText()+"\n");
                sendText.setText("");
            }
        });
        setVisible(true);
    }

public static class Chat {
    public static void main(String[] args) {
        new ChatCLient();
    }
}
}
