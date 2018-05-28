/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package communication;

import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author barth
 */
public class TestClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException
    {
        ServerSocket server = new ServerSocket(5000);
        
        while(true)
        {
            System.out.println("Waiting for socket");
            Socket socket = server.accept();
            LoginHandler.getLoginAttempts().add(new LoginHandler(socket));
            System.out.println("Created LoginAttempt");
            OutputStreamWriter serverWriter = new OutputStreamWriter(socket.getOutputStream());
            serverWriter.write("Connected.");
            Thread loginHandlerThread = new Thread(LoginHandler.getLoginAttempts().getLast());
            loginHandlerThread.start();
            System.out.println("Started LoginAttempt");
        }
        
    }
    
}
