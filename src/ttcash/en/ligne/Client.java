/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ttcash.en.ligne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author marwen.aouiti
 */
public class Client {

    public void Client() {

        BufferedReader in = null;
        Socket client;
        try {

            //After the server is waiting, a client instantiates a Socket object,
            //specifying the server name and the port number to connect to.
            client = new Socket(InetAddress.getLocalHost(), 1234);
            //If communication is established, the client now has a Socket object capable of communicating with the server.
            Scanner sc = new Scanner(System.in);
            in = new BufferedReader(new InputStreamReader(client.getInputStream()));
            PrintWriter out = new PrintWriter(client.getOutputStream());
            System.out.println(in.readLine());
            // while (true) {
            out.println(sc.nextLine());
            out.flush();
            System.out.println(in.readLine());
            // }
        } catch (IOException ex) {
            ex.getMessage();
        } finally {
            try {
                in.close();
            } catch (IOException ex) {
                ex.getMessage();
            }
        }
    }
}
