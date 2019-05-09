package ttcash.en.ligne;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Serveur extends Thread {

    static int nb = 0;

    @Override
    public void run() {
        try {
            //The server instantiates a ServerSocket object, denoting which port number communication is to occur on.    
            ServerSocket serveur = new ServerSocket(1234);
            System.out.println("Server is Ready!!");
            nb = (int) ((Math.random() * 900000) + 100000);
            System.out.println(nb);

            while (true) {
                //The server invokes the accept() method of the ServerSocket class. 
                //This method waits until a client connects to the server on the given port.
                Socket client = serveur.accept();
                Jeu j = new Jeu();
                T1 t1 = new T1(j);
                T2 t2 = new T2(j);
            }
        } catch (IOException ex) {

        }

    }

    public static void main(String[] args) {

    }
}
