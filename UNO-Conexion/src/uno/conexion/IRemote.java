/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uno.conexion;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Nicole
 */
public interface IRemote extends Remote{
    //Aquí van los métodos remotos(compartidos)
    public String getData(String text) throws RemoteException;
}
