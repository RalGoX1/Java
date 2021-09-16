package Client;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class RunClient
{
  public static void main(String[] args)
      throws RemoteException, NotBoundException
  {
    Client client = new Client();
    client.startClient();

    Scanner scanner = new Scanner(System.in);

    while (true)
    {
      System.out.print("Message to uppercase: ");
      String message = scanner.nextLine();

      if (message.equalsIgnoreCase("exit"))
      {
        break;
      }
      client.sendMessage(message);
    }
  }
}
