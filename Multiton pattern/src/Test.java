public class Test
{
  public static void main(String[] args)
  {
    Multiton m1 = Multiton.getInstance("one");
    Multiton m2 = Multiton.getInstance("two");
    Multiton m3 = Multiton.getInstance("three");


    System.out.println(m1);
    System.out.println(m2);
    System.out.println(m3);
  }
}




