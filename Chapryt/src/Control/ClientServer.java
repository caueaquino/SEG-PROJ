/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.io.ObjectInputStream;
import java.net.*;

/**
 *
 * @author can
 */
public class ClientServer {
    private Socket client; 
    private ObjectInputStream e; 
    
    public void createClientServer(){
        try {
        Socket client=new Socket("caue",50597);
        e=new ObjectInputStream(client.getInputStream());
        e.close();
        System.out.println("Conexão encerrada");
    }
    catch(Exception e) {
        System.out.println("Erro: " + e.getMessage());
    }
  }
}
