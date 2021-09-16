package Server;

import Shared.RemoteInterface;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ServerImplementation implements RemoteInterface
{
  public ServerImplementation() throws RemoteException
  {
    UnicastRemoteObject.exportObject(this, 0);
  }

  @Override public String toUppercase(String message) throws RemoteException
  {
    return message.toUpperCase();
  }
}
