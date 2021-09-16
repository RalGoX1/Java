package Shared;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RemoteInterface extends Remote
{
  String toUppercase(String message) throws RemoteException;
}
