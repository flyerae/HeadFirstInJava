package Cap15.SimpleChat;

/**
 * Created with IntelliJ IDEA.
 * User: raluca.garba
 * Date: 7/5/13
 * Time: 2:52 AM
 */

import java.io.*;
import java.net.*;
import java.util.*;

public class ReallySimpleChatServer {
    ArrayList clientOutputStreams;
    // server reads messages from client
    public class ClientHandler implements Runnable{
        BufferedReader reader;
        Socket sock;

        public ClientHandler(Socket clientSocket){
            try {
                sock = clientSocket;
                InputStreamReader isReader = new InputStreamReader(sock.getInputStream());
                reader = new BufferedReader(isReader);
            } catch (Exception ex){ex.printStackTrace();}
        } // close constructor

        public void run(){
            String message;
            try {
                while ((message = reader.readLine()) != null){
                    System.out.println("read " + message);
                    tellEveryone(message);
                }
            } catch (Exception ex){ex.printStackTrace();}
        } // close run
    } // close ClientHandler inner class

    public static void main(String[] args) {
        new ReallySimpleChatServer().go();
    }
    // make a socket connection and add a new Socket to communicate with client
    public void go(){
        clientOutputStreams = new ArrayList();
        try {
           ServerSocket serverSock = new ServerSocket(5000);

            while (true){
                Socket clientSocket = serverSock.accept();
                PrintWriter writer = new PrintWriter(clientSocket.getOutputStream());
                clientOutputStreams.add(writer);
                // open a new thread
                Thread t = new Thread(new ClientHandler(clientSocket));
                t.start();
                System.out.println("Got a connection");
            } // close while
        } catch (Exception ex){ex.printStackTrace();}
    } // close go

    public void tellEveryone(String message){
        // as long you got a message from client, print it to all clients
        Iterator it = clientOutputStreams.iterator();

        while (it.hasNext()){
            try {
                PrintWriter writer = (PrintWriter)it.next();
                writer.println(message);
                writer.flush();
            } catch (Exception ex){ex.printStackTrace();}
        } // close while
    } // close tellEveryone
} // close class
