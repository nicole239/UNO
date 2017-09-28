/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uno.server;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import uno.conexion.IRemote;

/**
 *
 * @author Nicole
 */
public class Prueba extends UnicastRemoteObject implements IRemote {

    public Prueba() throws RemoteException{
        super();
    }
    @Override
    public String getData(String text) throws RemoteException {
        text = "Hi " + text;
        return text;
    }
    
    public static void main(String args[]){
        try{
            
            Registry reg = LocateRegistry.createRegistry(1099);
            reg.rebind("server", new Prueba());
            System.out.println("Server has started");
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
}
