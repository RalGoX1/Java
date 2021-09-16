public class Singleton
{
  private static Singleton single_instance=null;

  public String string;

  private Singleton()
  {
    string = "Hi there! See I am the same instance :)";
  }

  public static Singleton Singleton()
  {
    if (single_instance == null)
    {
      single_instance = new Singleton();
    }
    return single_instance;
  }
}


