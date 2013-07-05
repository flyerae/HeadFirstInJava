package Cap15.SimpleChat;

/**
 * Created with IntelliJ IDEA.
 * User: raluca.garba
 * Date: 7/5/13
 * Time: 2:12 AM
 */

import java.io.*;
import java.net.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleChatClient {

    JTextArea incoming;
    JTextField outgoing;
    BufferedReader reader;
    PrintWriter writer;
    Socket sock;

    public static void main(String[] args) {
        SimpleChatClient client = new SimpleChatClient();
        client.go();
    }

    public void go(){
        // make the gui and register a listener with a send button;
        // call the steUpNetworking() method;
        // start a new thread to read messages from server and display them;

        JFrame frame = new JFrame("Simple Chat Client");
        JPanel mainPanel = new JPanel();
        incoming = new JTextArea(15, 50);
        incoming.setLineWrap(true);
        incoming.setWrapStyleWord(true);
        incoming.setEditable(false);
        JScrollPane qScroller = new JScrollPane(incoming);
        qScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        qScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        outgoing = new JTextField(20);
        JButton sendButton = new JButton("Send");

        sendButton.addActionListener(new SendButtonListener());

        outgoing.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                //if user press enter
                // do some magic
                if (e.getKeyCode() == KeyEvent.VK_ENTER){
                    try {
                        writer.println(outgoing.getText());
                        writer.flush();
                    }   catch (Exception ex) {ex.printStackTrace();}
                    outgoing.setText("");
                    outgoing.requestFocus();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
        mainPanel.add(qScroller);
        mainPanel.add(outgoing);
        mainPanel.add(sendButton);
        setUpNetworking();

        // we are starting a new thread using a new inner class as the Runnable (job) for the thread.
        // The thread's job is to read from the server socKet stream and to display the incoming messages in the scrolling text area

        Thread readerThread = new Thread(new IncomingReader());
        readerThread.start();

        frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
        frame.setSize(800, 500);
        frame.setVisible(true);
    } // close go

    private void setUpNetworking(){
        // make a Socket, used to get input and output streams
        // make a PrintWriter and a BufferedReader

        try {
            sock = new Socket("127.0.0.1", 5000);
            InputStreamReader streamReader = new InputStreamReader(sock.getInputStream());
            reader = new BufferedReader(streamReader);
            writer = new PrintWriter(sock.getOutputStream());
            System.out.println("Networking established");
        } catch (IOException ex){
            ex.printStackTrace();
        }
    } //close setUpNetworking

    public class SendButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent ev){

            try {
                writer.println(outgoing.getText());
                writer.flush();
            }   catch (Exception ex) {ex.printStackTrace();}
            outgoing.setText("");
            outgoing.requestFocus();

        }
    } // close SendButtonListener inner class

   public class IncomingReader implements Runnable{
       // create a new thread; in the run() method, it stays in loop while they are lines to read, reading a line at a
       // time and adding each line to the scrolling text area

       public void run(){
           String message;
           try {
              while ((message = reader.readLine()) != null){
                  System.out.println("read " + message);
                  incoming.append(message + "\n");
              } // close while
           }   catch (Exception ex){ex.printStackTrace();}
       }  // close run
   } // close IncomingReader inner class
}   // close outer class
