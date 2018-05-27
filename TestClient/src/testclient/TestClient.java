/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testclient;

import java.io.IOException;
import java.net.Socket;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 *
 * @author barth
 */
public class TestClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnknownHostException, IOException
    {
        Socket socket = new Socket(InetAddress.getLocalHost().getHostAddress(), 5000);
        
        ReadFromServer in = new ReadFromServer(socket);
        WriteToServer out = new WriteToServer(socket, new Scanner(System.in));
        
        
    }
    
}
