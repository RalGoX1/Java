import java.util.HashMap;
import java.util.Map;

public class Multiton
{
  private static Map<String, Multiton> allInstances = new HashMap<>();

  private Multiton(){}

  public static Multiton getInstance(String key){
    Multiton instance = allInstances.get(key);

    if (instance == null){
      synchronized (allInstances){
        instance = new Multiton();
        allInstances.put(key,instance);
      }
    }
    return instance;
  }
}


