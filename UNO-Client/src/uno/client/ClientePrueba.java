/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uno.client;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import uno.conexion.IRemote;

/**
 *
 * @author Nicole
 */
public class ClientePrueba {
    public static void main(String args[]){
        ClientePrueba cliente = new ClientePrueba();
        cliente.connectServer();
    }

    private void connectServer() {
        try{
            Registry reg = LocateRegistry.getRegistry("127.0.0.1",1099);
           IRemote remote = (IRemote) reg.lookup("server");
           System.out.println("Connected to server");
           String text = remote.getData("Nicole");
           System.out.println(text);
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
}
