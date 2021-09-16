package Client;

import Shared.RemoteInterface;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client
{

  private RemoteInterface server;

  public void startClient() throws RemoteException, NotBoundException
  {
    Registry registry = LocateRegistry.getRegistry("127.0.0.1", 1099);
    server = (RemoteInterface) registry.lookup("Server");
  }

  public void sendMessage(String msg)
  {
    try
    {
      System.out.println(server.toUppercase(msg));
    }
    catch (RemoteException e)
    {
      System.out.println("Message cannot be sent");
      e.printStackTrace();
    }
  }
}
