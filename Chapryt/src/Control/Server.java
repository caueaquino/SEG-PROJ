/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.io.ObjectOutputStream;
import java.net.*;
import java.util.Date;

/**
 *
 * @author can
 */
public class Server {
    
    private ServerSocket server;
    private Socket client;
    private ObjectOutputStream s;
    
    public void createServer(){
        try{
            server=new ServerSocket(50597);
            System.out.println("Server listening on port 50597...");
            while(true){
                client=server.accept();
                System.out.println("Cliente conectado: "+client.getInetAddress().getHostAddress());
                s=new ObjectOutputStream(client.getOutputStream());
                s.flush();
                s.close();
                client.close();
            }  

        }catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());

        }finally{
            System.out.println("Server closed!");  
        }
    }
}
